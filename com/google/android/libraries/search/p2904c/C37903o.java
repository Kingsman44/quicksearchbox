package com.google.android.libraries.search.p2904c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.o */
/* compiled from: PG */
public final class C37903o extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C37903o f100481a;

    /* renamed from: b */
    private static volatile C63010eb f100482b;

    static {
        C37903o oVar = new C37903o();
        f100481a = oVar;
        C62942bv.registerDefaultInstance(C37903o.class, oVar);
    }

    private C37903o() {
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
                return newMessageInfo(f100481a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C37903o();
            case 4:
                return new C37898n();
            case 5:
                return f100481a;
            case 6:
                C63010eb ebVar = f100482b;
                if (ebVar == null) {
                    synchronized (C37903o.class) {
                        ebVar = f100482b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f100481a);
                            f100482b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
