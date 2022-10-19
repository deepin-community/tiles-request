#!/bin/sh -e
#
# Removes unwanted content from the upstream sources.
# Called by uscan with '--upstream-version' <version> <file>
#

VERSION=$2
TAR=../tiles-request_$VERSION.orig.tar.xz
DIR=tiles-request-$VERSION
TAG=$(echo "tiles-request-$VERSION" | sed -re's/~(alpha|beta|rc)/-\1-/')

svn export http://svn.apache.org/repos/asf/tiles/request/tags/${TAG}/ $DIR
XZ_OPT=--best tar -c -J -f $TAR --exclude '*.jar' --exclude '*.class' $DIR
rm -rf $DIR ../$TAG
