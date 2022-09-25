package com.google.speech.p5218j.p5220b.p5221a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.speech.j.b.a.r */
/* compiled from: PG */
public enum C66814r implements C62957cd {
    UNDEFINED_JINN_SOURCE(0),
    APP_NAMES(1),
    CARLMIND_LOCATION(2),
    DEVICE_CONTACTS(3),
    STARLIGHT_PHOTOS_TAGGED_NAMES(11),
    GMM_PLACES(4),
    MESSAGE_CONTACTS(5),
    SONG_NAMES(6),
    SERVER_CONTACTS(7),
    WEB_PAGES(8),
    TEXT_TO_TEXT_REWRITE(10),
    OTHER(9);
    

    /* renamed from: m */
    public final int f181694m;

    private C66814r(int i) {
        this.f181694m = i;
    }

    /* renamed from: a */
    public static C66814r m97354a(int i) {
        switch (i) {
            case 0:
                return UNDEFINED_JINN_SOURCE;
            case 1:
                return APP_NAMES;
            case 2:
                return CARLMIND_LOCATION;
            case 3:
                return DEVICE_CONTACTS;
            case 4:
                return GMM_PLACES;
            case 5:
                return MESSAGE_CONTACTS;
            case 6:
                return SONG_NAMES;
            case 7:
                return SERVER_CONTACTS;
            case 8:
                return WEB_PAGES;
            case 9:
                return OTHER;
            case 10:
                return TEXT_TO_TEXT_REWRITE;
            case 11:
                return STARLIGHT_PHOTOS_TAGGED_NAMES;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m97355b() {
        return C66813q.f181680a;
    }

    public final int getNumber() {
        return this.f181694m;
    }

    public final String toString() {
        return Integer.toString(this.f181694m);
    }
}
