package com.google.android.libraries.lens.view.p2067ak;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.view.ak.cj */
/* compiled from: PG */
public final class C25258cj extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C25258cj f68719b;

    /* renamed from: c */
    private static volatile C63010eb f68720c;

    /* renamed from: a */
    public int f68721a;

    static {
        C25258cj cjVar = new C25258cj();
        f68719b = cjVar;
        C62942bv.registerDefaultInstance(C25258cj.class, cjVar);
    }

    private C25258cj() {
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
                return newMessageInfo(f68719b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"a"});
            case 3:
                return new C25258cj();
            case 4:
                return new C25257ci();
            case 5:
                return f68719b;
            case 6:
                C63010eb ebVar = f68720c;
                if (ebVar == null) {
                    synchronized (C25258cj.class) {
                        ebVar = f68720c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f68719b);
                            f68720c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
