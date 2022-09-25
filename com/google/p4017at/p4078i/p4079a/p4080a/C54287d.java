package com.google.p4017at.p4078i.p4079a.p4080a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62958ce;

/* renamed from: com.google.at.i.a.a.d */
/* compiled from: PG */
public enum C54287d implements C62957cd {
    REQUEST_MASK_CONTAINER_UNKNOWN(0),
    PROFILE(1),
    DOMAIN_PROFILE(7),
    CONTACT(2),
    ACCOUNT(5),
    AFFINITY(11),
    DOMAIN_CONTACT(8),
    PLACE(4),
    RAW_DEVICE_CONTACT(13),
    GOOGLE_GROUP(10),
    CHAT_ROOM(17),
    CIRCLE(3),
    EXTERNAL_ACCOUNT(6),
    DEVICE_CONTACT(9),
    UNRECOGNIZED(-1);
    

    /* renamed from: p */
    public static final C62958ce f142575p = null;

    /* renamed from: q */
    private final int f142577q;

    static {
        f142575p = new C54286c();
    }

    private C54287d(int i) {
        this.f142577q = i;
    }

    /* renamed from: a */
    public static C54287d m87248a(int i) {
        if (i == 13) {
            return RAW_DEVICE_CONTACT;
        }
        if (i == 17) {
            return CHAT_ROOM;
        }
        switch (i) {
            case 0:
                return REQUEST_MASK_CONTAINER_UNKNOWN;
            case 1:
                return PROFILE;
            case 2:
                return CONTACT;
            case 3:
                return CIRCLE;
            case 4:
                return PLACE;
            case 5:
                return ACCOUNT;
            case 6:
                return EXTERNAL_ACCOUNT;
            case 7:
                return DOMAIN_PROFILE;
            case 8:
                return DOMAIN_CONTACT;
            case 9:
                return DEVICE_CONTACT;
            case 10:
                return GOOGLE_GROUP;
            case 11:
                return AFFINITY;
            default:
                return null;
        }
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f142577q;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
