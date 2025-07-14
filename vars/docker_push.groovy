def call(String Project, String ImageTag, String dockehubuser){
  withCredentials([usernamePassword(credentialsId: 'dockerHubCred', passwordVariable: 'dockerHubPass', usernameVariable: 'dockerHubUser')]) {
      bat "docker login -u ${dockehubuser} -p ${dockerHubPass}"
  }
  bat "docker push ${dockerhubuser}/${Project}:${ImageTag}"
}
