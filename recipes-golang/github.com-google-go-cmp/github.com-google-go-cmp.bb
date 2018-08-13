SUMMARY = "Pretty Printing"
DESCRIPTION = "Go value printing library"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=4ac66f7dea41d8d116cb7fb28aeff2ab"


GO_IMPORT = "github.com/google/go-cmp"
SRC_URI="git://github.com/google/go-cmp.git;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
#SRCREV="${AUTOREV}"
SRCREV="5411ab924f9ffa6566244a9e504bc347edacffd3"

inherit go

DEPENDS += "\
"
