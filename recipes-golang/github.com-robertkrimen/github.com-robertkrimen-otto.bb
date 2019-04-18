SUMMARY = "Javascript interpreter"
DESCRIPTION = "Go lang native javascript interpreter"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=d4f7ce58b27e08f1bce3c4023a935487"


GO_IMPORT = "github.com/robertkrimen/otto"
SRC_URI="git://github.com/robertkrimen/otto.git;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
#SRCREV="${AUTOREV}"
SRCREV="15f95af6e78dcd2030d8195a138bd88d4f403546"

inherit go

DEPENDS += "\
    golang.org-x-net \
    golang.org-x-sys \
    gopkg.in-check.v1 \
    gopkg.in-sourcemap.v1 \
    gopkg.in-readline.v1 \
"
