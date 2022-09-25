package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.fz */
/* compiled from: PG */
public enum C14350fz implements C62957cd {
    MIC_UNKNOWN(0),
    MIC_CLOSE(1),
    MIC_OPEN(2),
    MIC_RECORDING(3),
    MIC_PROCESSING(4),
    MIC_TTS(5),
    UNRECOGNIZED(-1);
    

    /* renamed from: h */
    private final int f43432h;

    private C14350fz(int i) {
        this.f43432h = i;
    }

    /* renamed from: a */
    public static C14350fz m30611a(int i) {
        if (i == 0) {
            return MIC_UNKNOWN;
        }
        if (i == 1) {
            return MIC_CLOSE;
        }
        if (i == 2) {
            return MIC_OPEN;
        }
        if (i == 3) {
            return MIC_RECORDING;
        }
        if (i == 4) {
            return MIC_PROCESSING;
        }
        if (i != 5) {
            return null;
        }
        return MIC_TTS;
    }

    /* renamed from: b */
    public static C62959cf m30612b() {
        return C14349fy.f43423a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f43432h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
