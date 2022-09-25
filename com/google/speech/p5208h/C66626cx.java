package com.google.speech.p5208h;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.speech.h.cx */
/* compiled from: PG */
public enum C66626cx implements C62957cd {
    DEVICE_TYPE_UNKNOWN(0),
    PHONE(1),
    CHIRP(2),
    WATCH(3),
    TV(4),
    TABLET(5),
    PHONE_IOS(6),
    PHONE_ANDROID(7),
    STELLAR(8),
    LIBASSISTANT(9),
    DRAGONGLASS(10),
    ON_DEVICE_ARBITER(11),
    WRIST_WORN(12),
    BISTO_ON_EAR(13),
    SMART_DISPLAY_ANDROID(14),
    AUTO(15),
    HEARABLE(16);
    

    /* renamed from: r */
    public final int f181272r;

    private C66626cx(int i) {
        this.f181272r = i;
    }

    /* renamed from: a */
    public static C66626cx m97268a(int i) {
        switch (i) {
            case 0:
                return DEVICE_TYPE_UNKNOWN;
            case 1:
                return PHONE;
            case 2:
                return CHIRP;
            case 3:
                return WATCH;
            case 4:
                return TV;
            case 5:
                return TABLET;
            case 6:
                return PHONE_IOS;
            case 7:
                return PHONE_ANDROID;
            case 8:
                return STELLAR;
            case 9:
                return LIBASSISTANT;
            case 10:
                return DRAGONGLASS;
            case 11:
                return ON_DEVICE_ARBITER;
            case 12:
                return WRIST_WORN;
            case 13:
                return BISTO_ON_EAR;
            case 14:
                return SMART_DISPLAY_ANDROID;
            case 15:
                return AUTO;
            case 16:
                return HEARABLE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m97269b() {
        return C66625cw.f181253a;
    }

    public final int getNumber() {
        return this.f181272r;
    }

    public final String toString() {
        return Integer.toString(this.f181272r);
    }
}
