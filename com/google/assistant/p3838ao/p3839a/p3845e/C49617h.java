package com.google.assistant.p3838ao.p3839a.p3845e;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.ao.a.e.h */
/* compiled from: PG */
public enum C49617h implements C62957cd {
    CLIENT_ID_UNDEFINED(0),
    CLIENT_ID_TEST(11),
    ASSISTANT(1),
    PROACTIVE(2),
    SYSUI_DEMO(3),
    NGA_CORE(4),
    FRE_SUGGESTIONS(15),
    DISCOVERY_CARD(5),
    NGA_CARD_DEMO(6),
    TOAST_DEMO(7),
    SHARE_FULFILLER(8),
    NGA_STASH(9),
    CONTEXTUAL_CHIPS(10),
    ESCAPE_HATCH(12),
    AMBIENT_ASSISTANT(13),
    TAPAS(14);
    

    /* renamed from: q */
    public final int f128057q;

    private C49617h(int i) {
        this.f128057q = i;
    }

    /* renamed from: a */
    public static C49617h m85585a(int i) {
        switch (i) {
            case 0:
                return CLIENT_ID_UNDEFINED;
            case 1:
                return ASSISTANT;
            case 2:
                return PROACTIVE;
            case 3:
                return SYSUI_DEMO;
            case 4:
                return NGA_CORE;
            case 5:
                return DISCOVERY_CARD;
            case 6:
                return NGA_CARD_DEMO;
            case 7:
                return TOAST_DEMO;
            case 8:
                return SHARE_FULFILLER;
            case 9:
                return NGA_STASH;
            case 10:
                return CONTEXTUAL_CHIPS;
            case 11:
                return CLIENT_ID_TEST;
            case 12:
                return ESCAPE_HATCH;
            case 13:
                return AMBIENT_ASSISTANT;
            case 14:
                return TAPAS;
            case 15:
                return FRE_SUGGESTIONS;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m85586b() {
        return C49616g.f128039a;
    }

    public final int getNumber() {
        return this.f128057q;
    }

    public final String toString() {
        return Integer.toString(this.f128057q);
    }
}
