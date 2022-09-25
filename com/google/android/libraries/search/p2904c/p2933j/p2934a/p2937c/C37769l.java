package com.google.android.libraries.search.p2904c.p2933j.p2934a.p2937c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.j.a.c.l */
/* compiled from: PG */
public final class C37769l extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C37769l f100202a;

    /* renamed from: b */
    private static volatile C63010eb f100203b;

    static {
        C37769l lVar = new C37769l();
        f100202a = lVar;
        C62942bv.registerDefaultInstance(C37769l.class, lVar);
    }

    private C37769l() {
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
                return newMessageInfo(f100202a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C37769l();
            case 4:
                return new C37768k();
            case 5:
                return f100202a;
            case 6:
                C63010eb ebVar = f100203b;
                if (ebVar == null) {
                    synchronized (C37769l.class) {
                        ebVar = f100203b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f100202a);
                            f100203b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
