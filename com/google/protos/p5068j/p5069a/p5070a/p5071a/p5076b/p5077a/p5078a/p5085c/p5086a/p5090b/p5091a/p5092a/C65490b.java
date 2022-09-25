package com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5078a.p5085c.p5086a.p5090b.p5091a.p5092a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62958ce;

/* renamed from: com.google.protos.j.a.a.a.b.a.a.c.a.b.a.a.b */
/* compiled from: PG */
public enum C65490b implements C62957cd {
    UNKNOWN(0),
    UNEXPECTED_FOCUS_LOSS(1),
    UNABLE_TO_SEND_UTTERANCE_REQUEST(2);
    

    /* renamed from: d */
    public static final C62958ce f178040d = null;

    /* renamed from: e */
    public final int f178042e;

    static {
        f178040d = new C65489a();
    }

    private C65490b(int i) {
        this.f178042e = i;
    }

    /* renamed from: a */
    public static C65490b m96699a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return UNEXPECTED_FOCUS_LOSS;
        }
        if (i != 2) {
            return null;
        }
        return UNABLE_TO_SEND_UTTERANCE_REQUEST;
    }

    public final int getNumber() {
        return this.f178042e;
    }

    public final String toString() {
        return Integer.toString(this.f178042e);
    }
}
