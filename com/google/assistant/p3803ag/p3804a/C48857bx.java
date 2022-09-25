package com.google.assistant.p3803ag.p3804a;

import com.google.assistant.p3897e.p3921j.aas;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.ag.a.bx */
/* compiled from: PG */
public final class C48857bx extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48857bx f126427b;

    /* renamed from: c */
    public static final C62940bt f126428c;

    /* renamed from: f */
    private static volatile C63010eb f126429f;

    /* renamed from: a */
    public aas f126430a;

    /* renamed from: d */
    private int f126431d;

    /* renamed from: e */
    private byte f126432e = 2;

    static {
        C48857bx bxVar = new C48857bx();
        f126427b = bxVar;
        C62942bv.registerDefaultInstance(C48857bx.class, bxVar);
        f126428c = C62942bv.newSingularGeneratedExtension(C48877t.f126483b, bxVar, bxVar, (C62958ce) null, 200, C63066gd.MESSAGE, C48857bx.class);
    }

    private C48857bx() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f126432e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f126432e = b;
                return null;
            case 2:
                return newMessageInfo(f126427b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"d", "a"});
            case 3:
                return new C48857bx();
            case 4:
                return new C48856bw();
            case 5:
                return f126427b;
            case 6:
                C63010eb ebVar = f126429f;
                if (ebVar == null) {
                    synchronized (C48857bx.class) {
                        ebVar = f126429f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126427b);
                            f126429f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
