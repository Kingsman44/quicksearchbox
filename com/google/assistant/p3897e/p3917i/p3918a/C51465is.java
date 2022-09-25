package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.i.a.is */
/* compiled from: PG */
public enum C51465is implements C62957cd {
    UNKNOWN(0),
    SEND_CHAT_MESSAGE(1),
    SEND_AUDIO_MESSAGE(9),
    SHARE_SCREENSHOT(2),
    SHARE_WEB_URL(3),
    SHARE_LOCATION(4),
    SHARE_ETA(5),
    SHARE_GOOGLE_PHOTOS(8),
    SHARE_SINGLE_PHOTO(6),
    SHARE_MULTIPLE_PHOTOS(7);
    

    /* renamed from: k */
    private final int f134075k;

    private C51465is(int i) {
        this.f134075k = i;
    }

    /* renamed from: a */
    public static C51465is m86194a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return SEND_CHAT_MESSAGE;
            case 2:
                return SHARE_SCREENSHOT;
            case 3:
                return SHARE_WEB_URL;
            case 4:
                return SHARE_LOCATION;
            case 5:
                return SHARE_ETA;
            case 6:
                return SHARE_SINGLE_PHOTO;
            case 7:
                return SHARE_MULTIPLE_PHOTOS;
            case 8:
                return SHARE_GOOGLE_PHOTOS;
            case 9:
                return SEND_AUDIO_MESSAGE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m86195b() {
        return C51464ir.f134063a;
    }

    public final int getNumber() {
        return this.f134075k;
    }

    public final String toString() {
        return Integer.toString(this.f134075k);
    }
}
