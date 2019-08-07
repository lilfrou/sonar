pipeline {
    agent any
stages {
        stage("clone code") {
            steps {
                script {
                    // Let's clone the source
                    git 'https://github.com/lilfrou/sonar.git';
                }
            }
        }
    stage('compile stage') {
             steps {
              sh "mvn clean compile"
               
        }
    }  
     stage('sonar') {
         steps{
             sh "mvn clean verify-P sonar \"
  -Dsonar.projectKey=lilfrou_sonar \
  -Dsonar.organization=lilfrou-github \
  -Dsonar.host.url=https://sonarcloud.io \
  -Dsonar.login=3d3eb46dc53ffe8eeb5fa5f46eea024aa3ffe270
     }
}
 
         stage('selenium') {
            steps {
                sh "mvn clean test -DsuiteXmlFile=testng.xml"
              
            }   
      }   
}
    post {
        always {
            step([$class: 'Publisher', reportFilenamePattern: '**/testng-results.xml'])
            junit '**/junitreports/*.xml'
        }
}
}
