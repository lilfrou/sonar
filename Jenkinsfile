pipeline {
    agent any
stages {
        stage("clone code") {
            steps {
                script {
                    // Let's clone the source
                    git 'https://github.com/lilfrou/pipline.git';
                    sh "mvn clean install";
                }
            }
        }
    
         stage('selenium') {
            steps {
                sh "mvn clean test -Dtestngfile=testng.xml"
            }
        }
    }
}
