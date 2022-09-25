package com.google.p4242bp.p4257f.p4260b.p4261a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bp.f.b.a.x */
/* compiled from: PG */
public enum C56326x implements C62957cd {
    UNKNOWN(0),
    CARD(1),
    CHIP(2),
    PROMPT(3),
    FALLBACK_PROMPT(4),
    CUSTOM_PROMPT(5),
    NONE(6);
    

    /* renamed from: h */
    public final int f150135h;

    private C56326x(int i) {
        this.f150135h = i;
    }

    /* renamed from: a */
    public static C56326x m87970a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return CARD;
            case 2:
                return CHIP;
            case 3:
                return PROMPT;
            case 4:
                return FALLBACK_PROMPT;
            case 5:
                return CUSTOM_PROMPT;
            case 6:
                return NONE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m87971b() {
        return C56325w.f150126a;
    }

    public final int getNumber() {
        return this.f150135h;
    }

    public final String toString() {
        return Integer.toString(this.f150135h);
    }
}
