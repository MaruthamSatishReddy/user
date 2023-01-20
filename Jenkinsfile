pipeline {
  agent any
    tools {
      maven 'Maven'
                 jdk 'JDK-17'
    }
    stages {      
        stage('Build maven ') {
            steps { 
                    sh 'pwd'      
                    sh 'mvn  clean install package'
            }
        }
        stage('Build docker image') {
           steps {
               script {         
                 def customImage = docker.build('satishlakshmiudemy/user', "./Dockerfile")
                 docker.withRegistry('https://registry.hub.docker.com', 'Docker') {
                 customImage.push("${env.BUILD_NUMBER}")
                 }                     
           }
        }
	  }
    }
}
