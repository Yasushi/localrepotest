#! /bin/sh

rm -fr target/ project/.ivy/cache/commons-lang/ project/.ivy/cache/default-default-* project/.ivy/cache/resolved-default-default-3a5ef3-0.1-SNAPSHOT.*

exec java -Dsbt.global.base=project/.sbtboot -Dsbt.boot.directory=project/.boot -Dsbt.ivy.home=`pwd`/project/.ivy -jar sbt-launch.jar "$@"

