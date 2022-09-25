package com.google.android.ssb;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.ssb.g */
/* compiled from: PG */
public enum C45350g implements C62957cd {
    IDLE(0),
    LISTENING(1),
    RECORDING(2),
    PROCESSING(3),
    PLAYING_TTS(4);
    

    /* renamed from: f */
    public final int f118548f;

    private C45350g(int i) {
        this.f118548f = i;
    }

    /* renamed from: a */
    public static C45350g m80860a(int i) {
        if (i == 0) {
            return IDLE;
        }
        if (i == 1) {
            return LISTENING;
        }
        if (i == 2) {
            return RECORDING;
        }
        if (i == 3) {
            return PROCESSING;
        }
        if (i != 4) {
            return null;
        }
        return PLAYING_TTS;
    }

    /* renamed from: b */
    public static C62959cf m80861b() {
        return C45349f.f118541a;
    }

    public final int getNumber() {
        return this.f118548f;
    }

    public final String toString() {
        return Integer.toString(this.f118548f);
    }
}
