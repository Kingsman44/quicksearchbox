package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.ga */
/* compiled from: PG */
public final class C66965ga extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66965ga f182027c;

    /* renamed from: d */
    private static volatile C63010eb f182028d;

    /* renamed from: a */
    public int f182029a;

    /* renamed from: b */
    public C67175t f182030b;

    static {
        C66965ga gaVar = new C66965ga();
        f182027c = gaVar;
        C62942bv.registerDefaultInstance(C66965ga.class, gaVar);
    }

    private C66965ga() {
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
                return newMessageInfo(f182027c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C66965ga();
            case 4:
                return new C66963fz();
            case 5:
                return f182027c;
            case 6:
                C63010eb ebVar = f182028d;
                if (ebVar == null) {
                    synchronized (C66965ga.class) {
                        ebVar = f182028d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182027c);
                            f182028d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
