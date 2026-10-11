plugins {
    java
}

group = property("group") as String
version = property("project_version") as String

subprojects {
    group = rootProject.group
    apply {
        plugin("java-library")
    }

    java.toolchain {
        languageVersion.set(JavaLanguageVersion.of(25))
    }

    tasks.withType<JavaCompile>().configureEach {
        options.encoding = "UTF-8"
        options.release.set(25)
    }
}