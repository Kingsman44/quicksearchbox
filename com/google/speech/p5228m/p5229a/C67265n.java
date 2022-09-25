package com.google.speech.p5228m.p5229a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.m.a.n */
/* compiled from: PG */
public final class C67265n extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67265n f182842c;

    /* renamed from: d */
    private static volatile C63010eb f182843d;

    /* renamed from: a */
    public int f182844a = 0;

    /* renamed from: b */
    public Object f182845b;

    static {
        C67265n nVar = new C67265n();
        f182842c = nVar;
        C62942bv.registerDefaultInstance(C67265n.class, nVar);
    }

    private C67265n() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f182842c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", C67261j.class, C67269r.class, C67259h.class});
            case 3:
                return new C67265n();
            case 4:
                return new C67264m();
            case 5:
                return f182842c;
            case 6:
                C63010eb ebVar = f182843d;
                if (ebVar == null) {
                    synchronized (C67265n.class) {
                        ebVar = f182843d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182842c);
                            f182843d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
