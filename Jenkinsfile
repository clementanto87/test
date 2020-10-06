node {
  stage("SCM Checkout") {
    git 'https://github.com/clementanto87/test'
  }
  
  stage("Compail Package") {
    sh 'mvn package'
  }
}
