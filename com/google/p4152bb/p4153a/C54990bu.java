package com.google.p4152bb.p4153a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bb.a.bu */
/* compiled from: PG */
public enum C54990bu implements C62957cd {
    NO_MEDIA(0),
    PAUSED(1),
    PLAYING(2),
    STOPPED(3);
    

    /* renamed from: e */
    private final int f144691e;

    private C54990bu(int i) {
        this.f144691e = i;
    }

    /* renamed from: a */
    public static C54990bu m87554a(int i) {
        if (i == 0) {
            return NO_MEDIA;
        }
        if (i == 1) {
            return PAUSED;
        }
        if (i == 2) {
            return PLAYING;
        }
        if (i != 3) {
            return null;
        }
        return STOPPED;
    }

    /* renamed from: b */
    public static C62959cf m87555b() {
        return C54989bt.f144685a;
    }

    public final int getNumber() {
        return this.f144691e;
    }

    public final String toString() {
        return Integer.toString(this.f144691e);
    }
}
