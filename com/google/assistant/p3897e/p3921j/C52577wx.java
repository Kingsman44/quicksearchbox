package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.j.wx */
/* compiled from: PG */
public enum C52577wx implements C62957cd {
    UNKNOWN_PLAYBACK_TYPE(0),
    READ_IT_NOW_SINGLE(1),
    READ_IT_LATER(2),
    READ_IT_NOW_PLAYLIST(3);
    

    /* renamed from: e */
    public final int f138041e;

    private C52577wx(int i) {
        this.f138041e = i;
    }

    /* renamed from: a */
    public static C52577wx m86654a(int i) {
        if (i == 0) {
            return UNKNOWN_PLAYBACK_TYPE;
        }
        if (i == 1) {
            return READ_IT_NOW_SINGLE;
        }
        if (i == 2) {
            return READ_IT_LATER;
        }
        if (i != 3) {
            return null;
        }
        return READ_IT_NOW_PLAYLIST;
    }

    /* renamed from: b */
    public static C62959cf m86655b() {
        return C52576ww.f138035a;
    }

    public final int getNumber() {
        return this.f138041e;
    }

    public final String toString() {
        return Integer.toString(this.f138041e);
    }
}
