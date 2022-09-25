package com.google.p3723ar.core;

import com.google.p3723ar.core.exceptions.FatalException;

/* renamed from: com.google.ar.core.RecordingStatus */
/* compiled from: PG */
public enum RecordingStatus {
    NONE(0),
    OK(1),
    IO_ERROR(2);
    
    final int nativeCode;

    private RecordingStatus(int i) {
        this.nativeCode = i;
    }

    static RecordingStatus forNumber(int i) {
        for (RecordingStatus recordingStatus : values()) {
            if (recordingStatus.nativeCode == i) {
                return recordingStatus;
            }
        }
        throw new FatalException("Unexpected value for native RecordingStatus, value=" + i);
    }
}
