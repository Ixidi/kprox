dependencies {
    implementation(Dependencies.kotlinStdLib)
    implementation(Dependencies.ktorNetwork)
    testImplementation(Dependencies.jUnit)
    testImplementation(Dependencies.kotlinTest)
    testImplementation(Dependencies.assertJ)
}

tasks.test {
    useJUnitPlatform()
}