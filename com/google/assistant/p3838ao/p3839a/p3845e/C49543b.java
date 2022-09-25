package com.google.assistant.p3838ao.p3839a.p3845e;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.ao.a.e.b */
/* compiled from: PG */
public enum C49543b implements C62957cd {
    APP_CATEGORY_UNKNOWN(0),
    APP_CATEGORY_AUDIO(1),
    APP_CATEGORY_GAME(2),
    APP_CATEGORY_IMAGE(3),
    APP_CATEGORY_MAPS(4),
    APP_CATEGORY_NEWS(5),
    APP_CATEGORY_PRODUCTIVITY(6),
    APP_CATEGORY_SOCIAL(7),
    APP_CATEGORY_VIDEO(8);
    

    /* renamed from: j */
    private final int f127843j;

    private C49543b(int i) {
        this.f127843j = i;
    }

    /* renamed from: a */
    public static C49543b m85578a(int i) {
        switch (i) {
            case 0:
                return APP_CATEGORY_UNKNOWN;
            case 1:
                return APP_CATEGORY_AUDIO;
            case 2:
                return APP_CATEGORY_GAME;
            case 3:
                return APP_CATEGORY_IMAGE;
            case 4:
                return APP_CATEGORY_MAPS;
            case 5:
                return APP_CATEGORY_NEWS;
            case 6:
                return APP_CATEGORY_PRODUCTIVITY;
            case 7:
                return APP_CATEGORY_SOCIAL;
            case 8:
                return APP_CATEGORY_VIDEO;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m85579b() {
        return C49516a.f127751a;
    }

    public final int getNumber() {
        return this.f127843j;
    }

    public final String toString() {
        return Integer.toString(this.f127843j);
    }
}
