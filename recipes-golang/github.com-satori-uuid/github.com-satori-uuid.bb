SUMMARY = "UUID Library"
DESCRIPTION = "Go native Universally Unique IDentification (UUID) RFC-4122 library"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=ae4ba217c6e20c2d8f48f69966b9121b"


GO_IMPORT = "github.com/satori/uuid"
SRC_URI="git://github.com/satori/go.uuid.git;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
#SRCREV="${AUTOREV}"
SRCREV="36e9d2ebbde5e3f13ab2e25625fd453271d6522e"

inherit go

DEPENDS += "\
    golang.org-x-net \
    golang.org-x-sys \
    gopkg.in-check.v1 \
"
