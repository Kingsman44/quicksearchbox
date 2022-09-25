package com.google.android.libraries.search.p2904c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.ci */
/* compiled from: PG */
public final class C37460ci extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C37460ci f99438c;

    /* renamed from: d */
    private static volatile C63010eb f99439d;

    /* renamed from: a */
    public int f99440a;

    /* renamed from: b */
    public int f99441b;

    static {
        C37460ci ciVar = new C37460ci();
        f99438c = ciVar;
        C62942bv.registerDefaultInstance(C37460ci.class, ciVar);
    }

    private C37460ci() {
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
                return newMessageInfo(f99438c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C37476cy.m66493b()});
            case 3:
                return new C37460ci();
            case 4:
                return new C37459ch();
            case 5:
                return f99438c;
            case 6:
                C63010eb ebVar = f99439d;
                if (ebVar == null) {
                    synchronized (C37460ci.class) {
                        ebVar = f99439d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f99438c);
                            f99439d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
