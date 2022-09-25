package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.j.hm */
/* compiled from: PG */
public enum C52161hm implements C62957cd {
    NONE(0),
    PLAY_FROM_URI(1),
    PLAY_FROM_SEARCH(2),
    INTENT_VIEW(3),
    INTENT_MEDIA_PLAY_FROM_SEARCH(4),
    PLAY_FROM_MEDIA_ID(5);
    

    /* renamed from: g */
    public final int f136874g;

    private C52161hm(int i) {
        this.f136874g = i;
    }

    /* renamed from: a */
    public static C52161hm m86524a(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i == 1) {
            return PLAY_FROM_URI;
        }
        if (i == 2) {
            return PLAY_FROM_SEARCH;
        }
        if (i == 3) {
            return INTENT_VIEW;
        }
        if (i == 4) {
            return INTENT_MEDIA_PLAY_FROM_SEARCH;
        }
        if (i != 5) {
            return null;
        }
        return PLAY_FROM_MEDIA_ID;
    }

    /* renamed from: b */
    public static C62959cf m86525b() {
        return C52160hl.f136866a;
    }

    public final int getNumber() {
        return this.f136874g;
    }

    public final String toString() {
        return Integer.toString(this.f136874g);
    }
}
