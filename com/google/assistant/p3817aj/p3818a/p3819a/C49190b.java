package com.google.assistant.p3817aj.p3818a.p3819a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.aj.a.a.b */
/* compiled from: PG */
public enum C49190b implements C62957cd {
    OTHER(0),
    YOUTUBE(1),
    GOOGLE_MAPS(2),
    GOOGLE_PHOTOS(3),
    GOOGLE_PLAY_STORE(4),
    PIXEL_LAUNCHER(31),
    GOOGLE_WEB_SEARCH(5),
    GOOGLE_IMAGE_SEARCH(6),
    WIKIPEDIA(9),
    CATEGORY_SHOPPING(10),
    CATEGORY_TRAVEL(11),
    CATEGORY_ENTERTAINMENT(12),
    CATEGORY_SOCIAL(13),
    CATEGORY_MUSIC_AND_AUDIO(14),
    CATEGORY_NEWS_AND_MAGAZINES(15),
    CATEGORY_FOOD_AND_DRINK(16),
    MULTIAPP_TRAVEL(20);
    

    /* renamed from: r */
    public final int f127198r;

    private C49190b(int i) {
        this.f127198r = i;
    }

    /* renamed from: a */
    public static C49190b m85387a(int i) {
        if (i == 20) {
            return MULTIAPP_TRAVEL;
        }
        if (i == 31) {
            return PIXEL_LAUNCHER;
        }
        switch (i) {
            case 0:
                return OTHER;
            case 1:
                return YOUTUBE;
            case 2:
                return GOOGLE_MAPS;
            case 3:
                return GOOGLE_PHOTOS;
            case 4:
                return GOOGLE_PLAY_STORE;
            case 5:
                return GOOGLE_WEB_SEARCH;
            case 6:
                return GOOGLE_IMAGE_SEARCH;
            default:
                switch (i) {
                    case 9:
                        return WIKIPEDIA;
                    case 10:
                        return CATEGORY_SHOPPING;
                    case 11:
                        return CATEGORY_TRAVEL;
                    case 12:
                        return CATEGORY_ENTERTAINMENT;
                    case 13:
                        return CATEGORY_SOCIAL;
                    case 14:
                        return CATEGORY_MUSIC_AND_AUDIO;
                    case 15:
                        return CATEGORY_NEWS_AND_MAGAZINES;
                    case 16:
                        return CATEGORY_FOOD_AND_DRINK;
                    default:
                        return null;
                }
        }
    }

    /* renamed from: b */
    public static C62959cf m85388b() {
        return C49189a.f127179a;
    }

    public final int getNumber() {
        return this.f127198r;
    }

    public final String toString() {
        return Integer.toString(this.f127198r);
    }
}
