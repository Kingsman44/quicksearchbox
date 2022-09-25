package com.google.android.libraries.web.p3353c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.web.c.g */
/* compiled from: PG */
public enum C43362g implements C62957cd {
    UNSPECIFIED(0),
    CLIENT(1),
    SERVER(2),
    SSL(3),
    CONNECTIVITY(4),
    SAFE_BROWSING(5),
    HTTP(6);
    

    /* renamed from: h */
    public final int f113274h;

    private C43362g(int i) {
        this.f113274h = i;
    }

    /* renamed from: a */
    public static C43362g m76515a(int i) {
        switch (i) {
            case 0:
                return UNSPECIFIED;
            case 1:
                return CLIENT;
            case 2:
                return SERVER;
            case 3:
                return SSL;
            case 4:
                return CONNECTIVITY;
            case 5:
                return SAFE_BROWSING;
            case 6:
                return HTTP;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m76516b() {
        return C43361f.f113265a;
    }

    public final int getNumber() {
        return this.f113274h;
    }

    public final String toString() {
        return Integer.toString(this.f113274h);
    }
}
