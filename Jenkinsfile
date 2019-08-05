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
                sh "chmod +x -R /drivers/chromedriver/"
                sh "mvn clean test -DsuiteXmlFile=testng.xml"
            }
        }
    }
}
