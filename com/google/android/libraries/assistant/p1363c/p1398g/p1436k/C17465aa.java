package com.google.android.libraries.assistant.p1363c.p1398g.p1436k;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.assistant.c.g.k.aa */
/* compiled from: PG */
public enum C17465aa implements C62957cd {
    UNSPECIFIED_PLAYBACK_END_FAILURE(0),
    PLAYBACK_CANCELLED_BY_CLIENT_BEFORE_ENDED(1),
    PLAYBACK_CLOSED_BY_CLIENT_BEFORE_ENDED(2),
    SESSION_CLOSED_PLAY_NOT_CALLED_NOTHING_TO_END(3),
    PLAYBACK_END_ABORTED_DUE_TO_STALE_SESSION(4),
    FAILED_END_DUE_TO_PLAYBACK_EXCEPTION(100);
    

    /* renamed from: g */
    public final int f50439g;

    private C17465aa(int i) {
        this.f50439g = i;
    }

    /* renamed from: a */
    public static C17465aa m34779a(int i) {
        if (i == 0) {
            return UNSPECIFIED_PLAYBACK_END_FAILURE;
        }
        if (i == 1) {
            return PLAYBACK_CANCELLED_BY_CLIENT_BEFORE_ENDED;
        }
        if (i == 2) {
            return PLAYBACK_CLOSED_BY_CLIENT_BEFORE_ENDED;
        }
        if (i == 3) {
            return SESSION_CLOSED_PLAY_NOT_CALLED_NOTHING_TO_END;
        }
        if (i == 4) {
            return PLAYBACK_END_ABORTED_DUE_TO_STALE_SESSION;
        }
        if (i != 100) {
            return null;
        }
        return FAILED_END_DUE_TO_PLAYBACK_EXCEPTION;
    }

    /* renamed from: b */
    public static C62959cf m34780b() {
        return C17523z.f50539a;
    }

    public final int getNumber() {
        return this.f50439g;
    }

    public final String toString() {
        return Integer.toString(this.f50439g);
    }
}
