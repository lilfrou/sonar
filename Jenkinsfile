pipeline {
    agent any
stages {
        stage("clone code") {
            steps {
                script {
                    // Let's clone the source
                    git 'https://github.com/lilfrou/selenium.git';
                }
            }
        }
      stage('change path') {
           dir("selenium/drivers/chromedriver/") {
    sh "pwd"
}
        }
    
         stage('selenium') {
            steps {
                sh "mvn clean test -DsuiteXmlFile=testng.xml"
            }
        }
    }
}
