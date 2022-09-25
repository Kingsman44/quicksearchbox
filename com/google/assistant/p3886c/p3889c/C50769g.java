package com.google.assistant.p3886c.p3889c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.c.c.g */
/* compiled from: PG */
public enum C50769g implements C62957cd {
    DEFAULT(0),
    SUB_IMAGE(1),
    SUB_LIST(2),
    CAROUSEL(3),
    HEAD_TO_HEAD(4),
    COMBINED_CARDS(5),
    SUB_CARD(6);
    

    /* renamed from: h */
    public final int f132123h;

    private C50769g(int i) {
        this.f132123h = i;
    }

    /* renamed from: a */
    public static C50769g m85915a(int i) {
        switch (i) {
            case 0:
                return DEFAULT;
            case 1:
                return SUB_IMAGE;
            case 2:
                return SUB_LIST;
            case 3:
                return CAROUSEL;
            case 4:
                return HEAD_TO_HEAD;
            case 5:
                return COMBINED_CARDS;
            case 6:
                return SUB_CARD;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m85916b() {
        return C50768f.f132114a;
    }

    public final int getNumber() {
        return this.f132123h;
    }

    public final String toString() {
        return Integer.toString(this.f132123h);
    }
}
