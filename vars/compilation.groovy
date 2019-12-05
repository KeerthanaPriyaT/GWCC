//def call(Map Dircect){
def call(String dirc){
  dir(dirc){
    echo 'hello'
    sh './gwb compile' 
  }
}
