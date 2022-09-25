package com.google.android.apps.auto.p450a.p451a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.auto.a.a.bm */
/* compiled from: PG */
public final class C8895bm extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8895bm f30872a;

    /* renamed from: b */
    private static volatile C63010eb f30873b;

    static {
        C8895bm bmVar = new C8895bm();
        f30872a = bmVar;
        C62942bv.registerDefaultInstance(C8895bm.class, bmVar);
    }

    private C8895bm() {
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
                return newMessageInfo(f30872a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C8895bm();
            case 4:
                return new C8894bl();
            case 5:
                return f30872a;
            case 6:
                C63010eb ebVar = f30873b;
                if (ebVar == null) {
                    synchronized (C8895bm.class) {
                        ebVar = f30873b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30872a);
                            f30873b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
