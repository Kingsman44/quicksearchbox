package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.j.be */
/* compiled from: PG */
public enum C51707be implements C62957cd {
    VOICE_QUALITY(1),
    MUSIC_QUALITY(2);
    

    /* renamed from: c */
    public final int f135649c;

    private C51707be(int i) {
        this.f135649c = i;
    }

    /* renamed from: a */
    public static C51707be m86366a(int i) {
        if (i == 1) {
            return VOICE_QUALITY;
        }
        if (i != 2) {
            return null;
        }
        return MUSIC_QUALITY;
    }

    /* renamed from: b */
    public static C62959cf m86367b() {
        return C51706bd.f135645a;
    }

    public final int getNumber() {
        return this.f135649c;
    }

    public final String toString() {
        return Integer.toString(this.f135649c);
    }
}
