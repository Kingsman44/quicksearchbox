package com.google.protos.p5068j.p5069a.p5070a.p5111b.p5112a.p5113a.p5117b.p5118a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62958ce;

/* renamed from: com.google.protos.j.a.a.b.a.a.b.a.j */
/* compiled from: PG */
public enum C65581j implements C62957cd {
    UNKNOWN_NETWORK_ERROR(0),
    UNKNOWN_SERVER_ERROR(1);
    

    /* renamed from: c */
    public static final C62958ce f178249c = null;

    /* renamed from: d */
    private final int f178251d;

    static {
        f178249c = new C65580i();
    }

    private C65581j(int i) {
        this.f178251d = i;
    }

    /* renamed from: a */
    public static C65581j m96741a(int i) {
        if (i == 0) {
            return UNKNOWN_NETWORK_ERROR;
        }
        if (i != 1) {
            return null;
        }
        return UNKNOWN_SERVER_ERROR;
    }

    public final int getNumber() {
        return this.f178251d;
    }

    public final String toString() {
        return Integer.toString(this.f178251d);
    }
}
