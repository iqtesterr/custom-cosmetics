import net.minecrell.pluginyml.bukkit.BukkitPluginDescription.PluginLoadOrder.STARTUP
import net.minecrell.pluginyml.paper.PaperPluginDescription.RelativeLoadOrder.BEFORE

plugins {
    id("com.gradleup.shadow") version "9.4.1"
    id("de.eldoria.plugin-yml.paper") version "0.9.0"
}

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
    maven("https://repo.momirealms.net/releases/")
}

dependencies {
    implementation(project(":api"))
    compileOnly("net.momirealms:craft-engine-bukkit:26.9")
    compileOnly("io.papermc.paper:paper-api:${rootProject.property("paper_version")}.build.+")
}

paper {
    main = "net.chiiblock.customcosmetics.BukkitPlatform"
    version = rootProject.property("version") as String
    name = "CustomCosmetics"
    apiVersion = rootProject.property("paper_version") as String
    author = "iqtester, Packurk"
    website = "https://github.com/iqtesterr/custom-cosmetics"
    load = STARTUP
    foliaSupported = true
    serverDependencies {
        register("CraftEngine") {
            required = false
            load = BEFORE
        }
    }
}

tasks {
    shadowJar {
        archiveFileName.set("CustomCosmetics-${rootProject.version}.jar");
        destinationDirectory.set(file("$rootDir" + File.separator + "target"))
    }
}