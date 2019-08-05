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
    
         stage('selenium') {
            steps {
                sh "dir selenium/drivers/chromedriver/"
                sh "mvn clean test -DsuiteXmlFile=testng.xml"
            }
        }
    }
}
