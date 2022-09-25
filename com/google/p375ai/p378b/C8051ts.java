package com.google.p375ai.p378b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.ai.b.ts */
/* compiled from: PG */
public enum C8051ts implements C62957cd {
    IMAGE_RIGHT(1),
    CAROUSEL(2),
    CAROUSEL_CUSTOMIZE(21),
    CAROUSEL_LOGO(7),
    CAROUSEL_TEXTONLY(13),
    CAROUSEL_TWO_TONE(16),
    CAROUSEL_TWO_TONE_ICON(19),
    CAROUSEL_SPLIT_TEXT(17),
    CAROUSEL_MONOTONE(18),
    CAROUSEL_WEB_LOGO(40),
    CAROUSEL_TEXTONLY_RADIO(45),
    ARTICLE(3),
    TUTORIAL(4),
    SCREENIE(5),
    SCREENIE_MOVIE(6),
    PORTRAIT_IMAGE_RIGHT(8),
    LARGE_IMAGE_RIGHT(9),
    HEADER(10),
    COMPACT_HEADER(11),
    SCREENIE_LIST_HEADER(12),
    INTEREST_UPDATE(14),
    EMBEDDED_EMAIL(15),
    CENTERED_ICON(20),
    CLOSET_NAVIGATION_ROW(22),
    ASSISTANT_HQ(23),
    SUGGESTION_CHIPS(24),
    ASSISTANT_HQ_LARGE(25),
    SUGGESTION_CHIPS_LIST_ROW(26),
    SUGGESTION_CHIPS_IMAGE_RIGHT(27),
    HERO_IMAGE_CENTER(28),
    HERO_IMAGE_RIGHT(29),
    TRAY_SPORTS(30),
    TRAY_SPORTS_STANDINGS(31),
    TRAY_GENERIC_SMALL_SPACE(32),
    TRAY_GENERIC_LARGE_SPACE(33),
    TRAY_RATING(34),
    TRAY_CRITIC(35),
    TRAY_IMAGE_FULL(41),
    TRAY_SEARCH_CHIP(43),
    TRAY_SEARCH_CHIP_WRAP(44),
    ASSISTANT_HQ_EMPTY_CLUSTER(36),
    VOICE_OF_FEED(37),
    ASSISTANT_HQ_HEADER(38),
    ASSISTANT_HQ_IMAGE_RIGHT(39),
    RELATED_HEADER(42);
    

    /* renamed from: T */
    private final int f28313T;

    private C8051ts(int i) {
        this.f28313T = i;
    }

    /* renamed from: a */
    public static C8051ts m22928a(int i) {
        switch (i) {
            case 1:
                return IMAGE_RIGHT;
            case 2:
                return CAROUSEL;
            case 3:
                return ARTICLE;
            case 4:
                return TUTORIAL;
            case 5:
                return SCREENIE;
            case 6:
                return SCREENIE_MOVIE;
            case 7:
                return CAROUSEL_LOGO;
            case 8:
                return PORTRAIT_IMAGE_RIGHT;
            case 9:
                return LARGE_IMAGE_RIGHT;
            case 10:
                return HEADER;
            case 11:
                return COMPACT_HEADER;
            case 12:
                return SCREENIE_LIST_HEADER;
            case 13:
                return CAROUSEL_TEXTONLY;
            case 14:
                return INTEREST_UPDATE;
            case 15:
                return EMBEDDED_EMAIL;
            case 16:
                return CAROUSEL_TWO_TONE;
            case 17:
                return CAROUSEL_SPLIT_TEXT;
            case 18:
                return CAROUSEL_MONOTONE;
            case 19:
                return CAROUSEL_TWO_TONE_ICON;
            case 20:
                return CENTERED_ICON;
            case 21:
                return CAROUSEL_CUSTOMIZE;
            case 22:
                return CLOSET_NAVIGATION_ROW;
            case 23:
                return ASSISTANT_HQ;
            case 24:
                return SUGGESTION_CHIPS;
            case 25:
                return ASSISTANT_HQ_LARGE;
            case 26:
                return SUGGESTION_CHIPS_LIST_ROW;
            case 27:
                return SUGGESTION_CHIPS_IMAGE_RIGHT;
            case 28:
                return HERO_IMAGE_CENTER;
            case 29:
                return HERO_IMAGE_RIGHT;
            case 30:
                return TRAY_SPORTS;
            case 31:
                return TRAY_SPORTS_STANDINGS;
            case 32:
                return TRAY_GENERIC_SMALL_SPACE;
            case 33:
                return TRAY_GENERIC_LARGE_SPACE;
            case 34:
                return TRAY_RATING;
            case 35:
                return TRAY_CRITIC;
            case 36:
                return ASSISTANT_HQ_EMPTY_CLUSTER;
            case 37:
                return VOICE_OF_FEED;
            case 38:
                return ASSISTANT_HQ_HEADER;
            case 39:
                return ASSISTANT_HQ_IMAGE_RIGHT;
            case 40:
                return CAROUSEL_WEB_LOGO;
            case 41:
                return TRAY_IMAGE_FULL;
            case 42:
                return RELATED_HEADER;
            case 43:
                return TRAY_SEARCH_CHIP;
            case 44:
                return TRAY_SEARCH_CHIP_WRAP;
            case 45:
                return CAROUSEL_TEXTONLY_RADIO;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m22929b() {
        return C8050tr.f28266a;
    }

    public final int getNumber() {
        return this.f28313T;
    }

    public final String toString() {
        return Integer.toString(this.f28313T);
    }
}
