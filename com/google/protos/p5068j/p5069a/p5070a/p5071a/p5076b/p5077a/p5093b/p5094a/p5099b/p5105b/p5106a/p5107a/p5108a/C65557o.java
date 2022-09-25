package com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5105b.p5106a.p5107a.p5108a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.protos.j.a.a.a.b.a.b.a.b.b.a.a.a.o */
/* compiled from: PG */
public enum C65557o implements C62957cd {
    UNDEFINED(0),
    READ_IT(1),
    LENS(2),
    MEMORY(3);
    

    /* renamed from: e */
    public final int f178152e;

    private C65557o(int i) {
        this.f178152e = i;
    }

    /* renamed from: a */
    public static C65557o m96724a(int i) {
        if (i == 0) {
            return UNDEFINED;
        }
        if (i == 1) {
            return READ_IT;
        }
        if (i == 2) {
            return LENS;
        }
        if (i != 3) {
            return null;
        }
        return MEMORY;
    }

    /* renamed from: b */
    public static C62959cf m96725b() {
        return C65556n.f178146a;
    }

    public final int getNumber() {
        return this.f178152e;
    }

    public final String toString() {
        return Integer.toString(this.f178152e);
    }
}
