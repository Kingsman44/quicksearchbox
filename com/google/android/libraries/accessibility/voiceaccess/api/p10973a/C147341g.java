package com.google.android.libraries.accessibility.voiceaccess.api.p10973a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.accessibility.voiceaccess.api.a.g */
/* compiled from: PG */
public enum C147341g implements C62957cd {
    SPEECH_PROCESSING_COMPLETE(1),
    STOP_SESSION(2);
    

    /* renamed from: c */
    private final int f397743c;

    private C147341g(int i) {
        this.f397743c = i;
    }

    /* renamed from: a */
    public static C147341g m240256a(int i) {
        if (i == 1) {
            return SPEECH_PROCESSING_COMPLETE;
        }
        if (i != 2) {
            return null;
        }
        return STOP_SESSION;
    }

    /* renamed from: b */
    public static C62959cf m240257b() {
        return C147340f.f397739a;
    }

    public final int getNumber() {
        return this.f397743c;
    }

    public final String toString() {
        return Integer.toString(this.f397743c);
    }
}
