pipeline {
  agent any
    tools {
      maven 'Maven'
                 jdk 'JDK-17'
    }
    stages {      
        stage('Maven Build') {
            steps { 
                
                    sh 'mvn  clean install'
            }
        }

	  }
    }
}
