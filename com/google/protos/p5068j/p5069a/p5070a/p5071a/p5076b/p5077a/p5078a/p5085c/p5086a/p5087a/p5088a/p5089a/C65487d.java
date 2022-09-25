package com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5078a.p5085c.p5086a.p5087a.p5088a.p5089a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62958ce;

/* renamed from: com.google.protos.j.a.a.a.b.a.a.c.a.a.a.a.d */
/* compiled from: PG */
public enum C65487d implements C62957cd {
    UNSUPPORTED_UNKNOWN_CONFIGURATION(0),
    UNSUPPORTED_ENCODING(1);
    

    /* renamed from: c */
    public static final C62958ce f178029c = null;

    /* renamed from: d */
    private final int f178031d;

    static {
        f178029c = new C65486c();
    }

    private C65487d(int i) {
        this.f178031d = i;
    }

    /* renamed from: a */
    public static C65487d m96697a(int i) {
        if (i == 0) {
            return UNSUPPORTED_UNKNOWN_CONFIGURATION;
        }
        if (i != 1) {
            return null;
        }
        return UNSUPPORTED_ENCODING;
    }

    public final int getNumber() {
        return this.f178031d;
    }

    public final String toString() {
        return Integer.toString(this.f178031d);
    }
}
