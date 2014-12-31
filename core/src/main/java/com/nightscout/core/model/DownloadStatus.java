// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: /Users/klee/Projects/Nightscout/android-uploader/core/src/main/java/com/nightscout/core/protobuf/G4Download.proto
package com.nightscout.core.model;

import com.squareup.wire.ProtoEnum;

public enum DownloadStatus
        implements ProtoEnum {
    SUCCESS(0),
    NO_DATA(1),
    DEVICE_NOT_FOUND(2),
    IO_ERROR(3),
    APPLICATION_ERROR(4),
    NA(6),
    UNKNOWN(7);

    private final int value;

    private DownloadStatus(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }
}