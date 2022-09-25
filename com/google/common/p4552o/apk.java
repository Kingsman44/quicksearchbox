package com.google.common.p4552o;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.common.o.apk */
/* compiled from: PG */
public enum apk implements C62957cd {
    UNKNOWN_SURFACE(0),
    IGA(1),
    AGA_CLASSIC(2),
    GOOGLE_GO(3),
    AOPA(4),
    TNG_DISCOVER(5),
    TNG_SEARCH(6),
    LENS(7),
    LIBRARY_ASSISTANT_KIT(8),
    LIBRARY_GOOGLE_SEARCH_XUIKIT(9),
    LIBRARY_DISCOVER(10),
    PLAYGROUND_ANDROID(11),
    LENS_ANDROID(12),
    TNG(13),
    TNG_COLLECTIONS(14),
    TNG_NOTIFICATION(15),
    TNG_SILK_PANE(16),
    TNG_NIU(17),
    TNG_ASSISTANT(18),
    TNG_WEATHER(19),
    CARD_VIEWER(20),
    XBLEND_IOS(21),
    XBLEND_ANDROID(22),
    INTERNAL_TESTING(23),
    JUMP_BACK_IN_IOS(24),
    SEARCH_NOTIFICATIONS_IOS(25),
    TNG_SETTINGS(26),
    TNG_SUGGEST(27),
    IOS_SUGGEST(28),
    ZERO_SERVER(29);
    

    /* renamed from: E */
    public final int f159677E;

    private apk(int i) {
        this.f159677E = i;
    }

    /* renamed from: a */
    public static apk m92453a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_SURFACE;
            case 1:
                return IGA;
            case 2:
                return AGA_CLASSIC;
            case 3:
                return GOOGLE_GO;
            case 4:
                return AOPA;
            case 5:
                return TNG_DISCOVER;
            case 6:
                return TNG_SEARCH;
            case 7:
                return LENS;
            case 8:
                return LIBRARY_ASSISTANT_KIT;
            case 9:
                return LIBRARY_GOOGLE_SEARCH_XUIKIT;
            case 10:
                return LIBRARY_DISCOVER;
            case 11:
                return PLAYGROUND_ANDROID;
            case 12:
                return LENS_ANDROID;
            case 13:
                return TNG;
            case 14:
                return TNG_COLLECTIONS;
            case 15:
                return TNG_NOTIFICATION;
            case 16:
                return TNG_SILK_PANE;
            case 17:
                return TNG_NIU;
            case 18:
                return TNG_ASSISTANT;
            case 19:
                return TNG_WEATHER;
            case 20:
                return CARD_VIEWER;
            case 21:
                return XBLEND_IOS;
            case 22:
                return XBLEND_ANDROID;
            case 23:
                return INTERNAL_TESTING;
            case 24:
                return JUMP_BACK_IN_IOS;
            case 25:
                return SEARCH_NOTIFICATIONS_IOS;
            case 26:
                return TNG_SETTINGS;
            case 27:
                return TNG_SUGGEST;
            case 28:
                return IOS_SUGGEST;
            case 29:
                return ZERO_SERVER;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m92454b() {
        return apj.f159645a;
    }

    public final int getNumber() {
        return this.f159677E;
    }

    public final String toString() {
        return Integer.toString(this.f159677E);
    }
}
