package com.google.p4017at.p4082j.p4083a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.j.a.ac */
/* compiled from: PG */
public final class C54299ac extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54299ac f142653c;

    /* renamed from: d */
    private static volatile C63010eb f142654d;

    /* renamed from: a */
    public int f142655a = 0;

    /* renamed from: b */
    public Object f142656b;

    static {
        C54299ac acVar = new C54299ac();
        f142653c = acVar;
        C62942bv.registerDefaultInstance(C54299ac.class, acVar);
    }

    private C54299ac() {
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
                return newMessageInfo(f142653c, "\u0001\b\u0001\u0000\u0001\t\b\u0000\u0000\u0000\u0001ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000\tြ\u0000", new Object[]{"b", "a", C54453r.class, C54404dc.class, C54392cr.class, C54368bu.class, C54376cb.class, C54361bn.class, C54357bj.class, C54323b.class});
            case 3:
                return new C54299ac();
            case 4:
                return new C54298ab();
            case 5:
                return f142653c;
            case 6:
                C63010eb ebVar = f142654d;
                if (ebVar == null) {
                    synchronized (C54299ac.class) {
                        ebVar = f142654d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142653c);
                            f142654d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
