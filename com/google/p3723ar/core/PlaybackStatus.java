package com.google.p3723ar.core;

import com.google.p3723ar.core.exceptions.FatalException;

/* renamed from: com.google.ar.core.PlaybackStatus */
/* compiled from: PG */
public enum PlaybackStatus {
    NONE(0),
    OK(1),
    IO_ERROR(2),
    FINISHED(3);
    
    final int nativeCode;

    private PlaybackStatus(int i) {
        this.nativeCode = i;
    }

    static PlaybackStatus forNumber(int i) {
        for (PlaybackStatus playbackStatus : values()) {
            if (playbackStatus.nativeCode == i) {
                return playbackStatus;
            }
        }
        throw new FatalException("Unexpected value for native PlaybackStatus, value=" + i);
    }
}
