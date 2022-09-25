package com.google.assistant.p3860as;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.as.h */
/* compiled from: PG */
public enum C49794h implements C62957cd {
    UNDEFINED(0),
    NEWS(1),
    VIDEO(2),
    MUSIC(3),
    SHOPPING(4),
    GROCERY_LIST(22),
    PAYMENT(23),
    COUPONS_AND_REWARDS(24),
    PODCASTS(5),
    AUDIOBOOKS(6),
    CAFE(7),
    GAS_STATION(8),
    PARKING(9),
    RESTAURANT(10),
    SHOPPING_CENTER(11),
    TRANSIT_STATION(12),
    SPORTS(13),
    REMOTE_CONTROLS(14),
    WEATHER(15),
    CALENDAR(16),
    NAVIGATION(17),
    SMART_HOME(18),
    STOCKS(19),
    ALARMS(20),
    RIDE_SHARE(21),
    CAMERA(25),
    MESSAGE(26),
    SPARKLE_GAMES(27),
    SPARKLE_VIDEO(28),
    SPARKLE_AUDIO(29),
    SPARKLE_SOCIAL(30),
    SPARKLE_SHOPPING(31),
    SPARKLE_FOOD_AND_DRINK(32),
    SPARKLE_FINANCE(33),
    SPARKLE_PRODUCTIVITY(34),
    SPARKLE_NEWS(35),
    SPARKLE_WEATHER(36),
    SPARKLE_TRAVEL(37),
    SPARKLE_EVENTS(38),
    SPARKLE_SPORTS(39),
    SPARKLE_IMAGES(40),
    SPARKLE_HEALTH(41),
    SPARKLE_CONVERSATIONS(42),
    SPARKLE_STOCKS(43),
    SPARKLE_REAL_ESTATE(44);
    

    /* renamed from: T */
    public final int f128629T;

    private C49794h(int i) {
        this.f128629T = i;
    }

    /* renamed from: a */
    public static C49794h m85713a(int i) {
        switch (i) {
            case 0:
                return UNDEFINED;
            case 1:
                return NEWS;
            case 2:
                return VIDEO;
            case 3:
                return MUSIC;
            case 4:
                return SHOPPING;
            case 5:
                return PODCASTS;
            case 6:
                return AUDIOBOOKS;
            case 7:
                return CAFE;
            case 8:
                return GAS_STATION;
            case 9:
                return PARKING;
            case 10:
                return RESTAURANT;
            case 11:
                return SHOPPING_CENTER;
            case 12:
                return TRANSIT_STATION;
            case 13:
                return SPORTS;
            case 14:
                return REMOTE_CONTROLS;
            case 15:
                return WEATHER;
            case 16:
                return CALENDAR;
            case 17:
                return NAVIGATION;
            case 18:
                return SMART_HOME;
            case 19:
                return STOCKS;
            case 20:
                return ALARMS;
            case 21:
                return RIDE_SHARE;
            case 22:
                return GROCERY_LIST;
            case 23:
                return PAYMENT;
            case 24:
                return COUPONS_AND_REWARDS;
            case 25:
                return CAMERA;
            case 26:
                return MESSAGE;
            case 27:
                return SPARKLE_GAMES;
            case 28:
                return SPARKLE_VIDEO;
            case 29:
                return SPARKLE_AUDIO;
            case 30:
                return SPARKLE_SOCIAL;
            case 31:
                return SPARKLE_SHOPPING;
            case 32:
                return SPARKLE_FOOD_AND_DRINK;
            case 33:
                return SPARKLE_FINANCE;
            case 34:
                return SPARKLE_PRODUCTIVITY;
            case 35:
                return SPARKLE_NEWS;
            case 36:
                return SPARKLE_WEATHER;
            case 37:
                return SPARKLE_TRAVEL;
            case 38:
                return SPARKLE_EVENTS;
            case 39:
                return SPARKLE_SPORTS;
            case 40:
                return SPARKLE_IMAGES;
            case 41:
                return SPARKLE_HEALTH;
            case 42:
                return SPARKLE_CONVERSATIONS;
            case 43:
                return SPARKLE_STOCKS;
            case 44:
                return SPARKLE_REAL_ESTATE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m85714b() {
        return C49793g.f128582a;
    }

    public final int getNumber() {
        return this.f128629T;
    }

    public final String toString() {
        return Integer.toString(this.f128629T);
    }
}
