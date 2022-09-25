package com.google.android.libraries.search.p2904c.p2967t.p2971c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.search.c.t.c.j */
/* compiled from: PG */
public enum C38086j implements C62957cd {
    CLIENT_TYPE_UNKNOWN(0),
    CLIENT_TYPE_AUDIO_REQUEST(1),
    CLIENT_TYPE_HOTWORD(2),
    CLIENT_TYPE_EXTERNAL(10),
    CLIENT_TYPE_TELEPHONY_CALL(11),
    CLIENT_TYPE_PLATFORM_EXTERNAL(12);
    

    /* renamed from: g */
    public final int f100916g;

    private C38086j(int i) {
        this.f100916g = i;
    }

    /* renamed from: a */
    public static C38086j m67233a(int i) {
        if (i == 0) {
            return CLIENT_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return CLIENT_TYPE_AUDIO_REQUEST;
        }
        if (i == 2) {
            return CLIENT_TYPE_HOTWORD;
        }
        switch (i) {
            case 10:
                return CLIENT_TYPE_EXTERNAL;
            case 11:
                return CLIENT_TYPE_TELEPHONY_CALL;
            case 12:
                return CLIENT_TYPE_PLATFORM_EXTERNAL;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m67234b() {
        return C38085i.f100908a;
    }

    public final int getNumber() {
        return this.f100916g;
    }

    public final String toString() {
        return Integer.toString(this.f100916g);
    }
}
