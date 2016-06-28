# Gradle to Pants converter

[![Build Status](https://travis-ci.org/fkorotkov/gradle-to-pants-converter.svg?branch=master)](https://travis-ci.org/fkorotkov/gradle-to-pants-converter)

A simple Gradle task to automate migration from Gradle to [Pants](https://pantsbuild.github.io/).

**Disclaimer:** Only Java projects are supported. The main reason behind `buildgen` task is to automate creation of most of the BUILD files in the project and all 3rdparty BUILD files that follow [3rdparty idiom](https://pantsbuild.github.io/3rdparty_jvm.html). **Manual tweaks will be required for a full migration!**

# Usage

To use `buildgen` task please copy `buildgen.gradle` to the root of your project and add `apply from: 'buildgen.gradle'` to your root `build.gradle` file. To generate BUILD files for Pants follow steps below:
* [Install Pants](https://pantsbuild.github.io/install.html) with a simple script.
* Run `./gradlew buildgen`
* Run `./pants list ::` to validate all BUILD files
* Run `./pants compile ::` or `./pants compile some/small/project/::` to check full or partial compilation
