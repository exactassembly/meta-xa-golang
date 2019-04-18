SUMMARY = "Go test extensions Library"
DESCRIPTION = "Package check is a rich testing extension for Go's testing package."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=d9a2914e5c6aaac3ce2513ca9b7dabaf"


GO_IMPORT = "gopkg.in/sourcemap.v1"
SRC_URI="git://github.com/go-sourcemap/sourcemap.git;protocol=https;branch=v1;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV="${AUTOREV}"

inherit go

DEPENDS += "\
    gopkg.in-check.v1 \
"
#PTEST_ENABLED="0"
