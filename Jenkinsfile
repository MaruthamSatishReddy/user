pipeline {
    agent any
    tools {
    maven 'Maven'
    }
    stages {
        stage('Maven Build') {
           steps{
               checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/MaruthamSatishReddy/user.git']])
               sh 'mvn clean install'
           
         }
       }
    }
  }
