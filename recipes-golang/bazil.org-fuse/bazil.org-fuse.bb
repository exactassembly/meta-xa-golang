SUMMARY = "FUSE bindings for Go"
DESCRIPTION = "Go native Filesystems in Userspace (FUSE) protocol"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=d0ee8be1819fdcf5ae601a8beb362cc6"

GO_IMPORT = "bazil.org/fuse"

inherit go

SRC_URI="git://github.com/bazil/fuse.git;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV="${AUTOREV}"

DEPENDS += "\
    golang.org-x-net \
    golang.org-x-sys \
"
