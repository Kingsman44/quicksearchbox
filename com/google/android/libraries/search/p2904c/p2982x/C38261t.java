package com.google.android.libraries.search.p2904c.p2982x;

import com.google.android.libraries.search.p2904c.C37679hz;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.x.t */
/* compiled from: PG */
public final class C38261t extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C38261t f101368c;

    /* renamed from: d */
    private static volatile C63010eb f101369d;

    /* renamed from: a */
    public int f101370a;

    /* renamed from: b */
    public C37679hz f101371b;

    static {
        C38261t tVar = new C38261t();
        f101368c = tVar;
        C62942bv.registerDefaultInstance(C38261t.class, tVar);
    }

    private C38261t() {
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
                return newMessageInfo(f101368c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C38261t();
            case 4:
                return new C38260s();
            case 5:
                return f101368c;
            case 6:
                C63010eb ebVar = f101369d;
                if (ebVar == null) {
                    synchronized (C38261t.class) {
                        ebVar = f101369d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f101368c);
                            f101369d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
