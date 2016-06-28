./gradlew buildgen
curl -L -O https://pantsbuild.github.io/setup/pants && chmod +x pants && touch pants.ini
./pants test ::
