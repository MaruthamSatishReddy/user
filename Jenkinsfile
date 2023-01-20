node {
    def mvnHome
    stage('Preparation') {
        mvnHome = tool 'MAVEN_HOME'
        sh "${mvnHome}/bin/mvn --version"
    }
    stage('Build') {
        sh "${mvnHome}/bin/mvn clean install"
    }
}
