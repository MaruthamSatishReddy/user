node {
    def mvnHome
    stage('Preparation') {
        mvnHome = tool 'M3'
        sh "${mvnHome}/bin/mvn --version"
    }
    stage('Build') {
        sh "${mvnHome}/bin/mvn clean install"
    }
}
