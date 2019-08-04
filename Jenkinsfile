pipeline {
    agent any
stages {
        stage("clone code") {
            steps {
                script {
                    // Let's clone the source
                    git 'https://github.com/lilfrou/pipline.git';
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
