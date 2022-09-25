package com.google.assistant.p3861at;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.at.cf */
/* compiled from: PG */
public enum C49875cf implements C62957cd {
    UNKNOWN(0),
    CHIRP(1),
    ON_HUB(2),
    ALLO(3),
    NEXUS(4),
    WEAR(5),
    IPHONE(6),
    ANDROID_TV(7),
    BISTO(8),
    JASPER(13),
    LIBASSISTANT(9),
    CHROME_OS(10),
    ASSISTANT_SDK(11),
    ANDROID_TABLET(12),
    ANDROID_GO(14),
    AUTO(15),
    MANHATTAN(16),
    OPA_CROS(17),
    ANDROID_THINGS_CUBE(18),
    CLOUD_AUTO(19),
    TITAN(20);
    

    /* renamed from: v */
    public final int f129621v;

    private C49875cf(int i) {
        this.f129621v = i;
    }

    /* renamed from: a */
    public static C49875cf m85755a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return CHIRP;
            case 2:
                return ON_HUB;
            case 3:
                return ALLO;
            case 4:
                return NEXUS;
            case 5:
                return WEAR;
            case 6:
                return IPHONE;
            case 7:
                return ANDROID_TV;
            case 8:
                return BISTO;
            case 9:
                return LIBASSISTANT;
            case 10:
                return CHROME_OS;
            case 11:
                return ASSISTANT_SDK;
            case 12:
                return ANDROID_TABLET;
            case 13:
                return JASPER;
            case 14:
                return ANDROID_GO;
            case 15:
                return AUTO;
            case 16:
                return MANHATTAN;
            case 17:
                return OPA_CROS;
            case 18:
                return ANDROID_THINGS_CUBE;
            case 19:
                return CLOUD_AUTO;
            case 20:
                return TITAN;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m85756b() {
        return C49874ce.f129598a;
    }

    public final int getNumber() {
        return this.f129621v;
    }

    public final String toString() {
        return Integer.toString(this.f129621v);
    }
}
