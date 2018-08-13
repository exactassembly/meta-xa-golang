SUMMARY = "Go test extensions Library"
DESCRIPTION = "Package check is a rich testing extension for Go's testing package."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=598d6673548efc92a7d6dfb739add1ed"


GO_IMPORT = "gopkg.in/check.v1"
SRC_URI="git://github.com/go-check/check.git;protocol=https;branch=v1;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV="${AUTOREV}"

inherit go

DEPENDS += "\
    golang.org-x-net \
    golang.org-x-sys \
    github.com-kr-pretty \
"
