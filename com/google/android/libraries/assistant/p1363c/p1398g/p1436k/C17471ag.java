package com.google.android.libraries.assistant.p1363c.p1398g.p1436k;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.assistant.c.g.k.ag */
/* compiled from: PG */
public enum C17471ag implements C62957cd {
    UNSPECIFIED_PLAYBACK_START_FAILURE(0),
    PLAYBACK_CANCELLED_BY_CLIENT_BEFORE_STARTING(1),
    PLAYBACK_CLOSED_BY_CLIENT_BEFORE_STARTING(2),
    PLAYBACK_CLOSED_EXOPLAYER_ENDED_BEFORE_STARTING(3),
    SESSION_CLOSED_PLAY_NOT_CALLED_NOTHING_TO_START(4),
    PLAYBACK_START_ABORTED_DUE_TO_STALE_SESSION(5),
    FAILED_START_DUE_TO_PLAYBACK_EXCEPTION(100);
    

    /* renamed from: h */
    public final int f50456h;

    private C17471ag(int i) {
        this.f50456h = i;
    }

    /* renamed from: a */
    public static C17471ag m34782a(int i) {
        if (i == 0) {
            return UNSPECIFIED_PLAYBACK_START_FAILURE;
        }
        if (i == 1) {
            return PLAYBACK_CANCELLED_BY_CLIENT_BEFORE_STARTING;
        }
        if (i == 2) {
            return PLAYBACK_CLOSED_BY_CLIENT_BEFORE_STARTING;
        }
        if (i == 3) {
            return PLAYBACK_CLOSED_EXOPLAYER_ENDED_BEFORE_STARTING;
        }
        if (i == 4) {
            return SESSION_CLOSED_PLAY_NOT_CALLED_NOTHING_TO_START;
        }
        if (i == 5) {
            return PLAYBACK_START_ABORTED_DUE_TO_STALE_SESSION;
        }
        if (i != 100) {
            return null;
        }
        return FAILED_START_DUE_TO_PLAYBACK_EXCEPTION;
    }

    /* renamed from: b */
    public static C62959cf m34783b() {
        return C17470af.f50447a;
    }

    public final int getNumber() {
        return this.f50456h;
    }

    public final String toString() {
        return Integer.toString(this.f50456h);
    }
}
