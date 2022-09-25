package com.google.assistant.p3838ao.p3839a.p3845e;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.ao.a.e.d */
/* compiled from: PG */
public enum C49597d implements C62957cd {
    UNKNOWN(0),
    BUSINESS_DIRECTORY(1),
    CHAT(2),
    MOVIE_INFO(3),
    MOVIE_STREAMING(4),
    MOVIE_TICKET_PURCHASING(5),
    NAVIGATION(6),
    RESTAURANT_REVIEWS(7),
    RIDE(8),
    SOCIAL(9),
    NEWS(10),
    TRAVEL(11);
    

    /* renamed from: m */
    private final int f127990m;

    private C49597d(int i) {
        this.f127990m = i;
    }

    /* renamed from: a */
    public static C49597d m85582a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return BUSINESS_DIRECTORY;
            case 2:
                return CHAT;
            case 3:
                return MOVIE_INFO;
            case 4:
                return MOVIE_STREAMING;
            case 5:
                return MOVIE_TICKET_PURCHASING;
            case 6:
                return NAVIGATION;
            case 7:
                return RESTAURANT_REVIEWS;
            case 8:
                return RIDE;
            case 9:
                return SOCIAL;
            case 10:
                return NEWS;
            case 11:
                return TRAVEL;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m85583b() {
        return C49570c.f127906a;
    }

    public final int getNumber() {
        return this.f127990m;
    }

    public final String toString() {
        return Integer.toString(this.f127990m);
    }
}
