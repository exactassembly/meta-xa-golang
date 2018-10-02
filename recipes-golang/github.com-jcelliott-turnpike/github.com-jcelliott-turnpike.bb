SUMMARY = "Golang WAMP Library"
DESCRIPTION = "Go native WAMP protocol library"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=abeb1afa2c29735e396cffb28071a0a8"
FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

GO_IMPORT = "github.com/jcelliott/turnpike"

DEPENDS += "\
    ncurses \
"

SRC_URI=" \
    git://github.com/jcelliott/turnpike.git;protocol=https;branch=v2;destsuffix=${PN}-${PV}/src/${GO_IMPORT} \
    file://01_fixurls.patch;patchdir=src/${GO_IMPORT} \
    file://02_add_checkorigin.patch;patchdir=src/${GO_IMPORT} \
"
#SRCREV="${AUTOREV}"
SRCREV="de9a4503e73c675401e8c345d73623aa3dcb98ac"
do_compile_prepend () {
    rm -rf ${WORKDIR}/${PN}-${PV}/src/github.com/jcelliott/turnpike/examples
}

inherit go pkgconfig

RDEPENDS_${PN}-dev += "bash"
