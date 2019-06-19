repositories {

  // prefer artifacts from local cache
  mavenLocal()

  // if not found, search on jcenter
  jcenter()

  maven {
    setUrl("https://jitpack.io")
  }
}
