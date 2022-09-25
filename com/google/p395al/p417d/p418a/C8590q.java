package com.google.p395al.p417d.p418a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.al.d.a.q */
/* compiled from: PG */
public enum C8590q implements C62957cd {
    AUTOPLAY_UNSPECIFIED(0),
    AUTOPLAY_DISABLED(1),
    AUTOPLAY_ON_WIFI_ONLY(2),
    AUTOPLAY_ON_WIFI_AND_MOBILE_DATA(3);
    

    /* renamed from: e */
    public final int f29729e;

    private C8590q(int i) {
        this.f29729e = i;
    }

    /* renamed from: a */
    public static C8590q m23276a(String str) {
        return (C8590q) Enum.valueOf(C8590q.class, str);
    }

    /* renamed from: b */
    public static C8590q m23277b(int i) {
        if (i == 0) {
            return AUTOPLAY_UNSPECIFIED;
        }
        if (i == 1) {
            return AUTOPLAY_DISABLED;
        }
        if (i == 2) {
            return AUTOPLAY_ON_WIFI_ONLY;
        }
        if (i != 3) {
            return null;
        }
        return AUTOPLAY_ON_WIFI_AND_MOBILE_DATA;
    }

    /* renamed from: c */
    public static C62959cf m23278c() {
        return C8589p.f29723a;
    }

    public final int getNumber() {
        return this.f29729e;
    }

    public final String toString() {
        return Integer.toString(this.f29729e);
    }
}
