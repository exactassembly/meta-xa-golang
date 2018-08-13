SUMMARY = "Pretty Printing"
DESCRIPTION = "Go value printing library"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=ae4ba217c6e20c2d8f48f69966b9121b"


GO_IMPORT = "github.com/kr/pretty"
SRC_URI="git://github.com/kr/pretty.git;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
#SRCREV="${AUTOREV}"
SRCREV="36e9d2ebbde5e3f13ab2e25625fd453271d6522e"

inherit go

DEPENDS += "\
    golang.org-x-sys \
"
