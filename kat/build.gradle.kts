/* === PLUGIN === */
plugins {
    kotlin("jvm")
    `maven-publish`
}


/* === CONFIGURATION === */
kotlin {
    sourceSets {
        all {
            dependencies {
                /* Kotlin & Kotlinx */
                implementation(kotlin("stdlib"))
                implementation(kotlin("reflect"))

                /* ASM */
                implementation("org.ow2.asm:asm:9.9.1")
                implementation("org.ow2.asm:asm-commons:9.9.1")
                implementation("org.ow2.asm:asm-tree:9.9.1")
            }
        }
    }
}