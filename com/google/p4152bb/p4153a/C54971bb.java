package com.google.p4152bb.p4153a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bb.a.bb */
/* compiled from: PG */
public enum C54971bb implements C62957cd {
    DATE_DAY(0),
    DATE_MONTH(1),
    DATE_DAY_OF_WEEK(2),
    LOCAL_CONTACT_NAME_WITH_PHONE(3),
    LOCAL_CONTACT_NAME_WITH_EMAIL(4),
    LOCAL_CONTACT_PHONE_NUMBER(5),
    LOCAL_CONTACT_NAME_WITH_ADDRESS(6),
    MEDIA_ARTIST(7),
    MEDIA_SONG(8),
    MEDIA_ALBUM(9);
    

    /* renamed from: k */
    public final int f144605k;

    private C54971bb(int i) {
        this.f144605k = i;
    }

    /* renamed from: a */
    public static C54971bb m87550a(int i) {
        switch (i) {
            case 0:
                return DATE_DAY;
            case 1:
                return DATE_MONTH;
            case 2:
                return DATE_DAY_OF_WEEK;
            case 3:
                return LOCAL_CONTACT_NAME_WITH_PHONE;
            case 4:
                return LOCAL_CONTACT_NAME_WITH_EMAIL;
            case 5:
                return LOCAL_CONTACT_PHONE_NUMBER;
            case 6:
                return LOCAL_CONTACT_NAME_WITH_ADDRESS;
            case 7:
                return MEDIA_ARTIST;
            case 8:
                return MEDIA_SONG;
            case 9:
                return MEDIA_ALBUM;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m87551b() {
        return C54970ba.f144593a;
    }

    public final int getNumber() {
        return this.f144605k;
    }

    public final String toString() {
        return Integer.toString(this.f144605k);
    }
}
