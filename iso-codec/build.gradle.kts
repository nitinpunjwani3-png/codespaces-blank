plugins {
    java
}

group = "com.omnibridge"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // 1. The API to write the tests
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.2")
    
    // 2. The Engine to execute the tests
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.10.2")
    
    // 3. The Launcher (The missing piece in your screenshot)
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
    testLogging {
        events("passed", "skipped", "failed")
    }
}