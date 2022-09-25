package com.google.android.libraries.search.p2904c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.gt */
/* compiled from: PG */
public final class C37641gt extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C37641gt f100008c;

    /* renamed from: d */
    private static volatile C63010eb f100009d;

    /* renamed from: a */
    public int f100010a;

    /* renamed from: b */
    public int f100011b;

    static {
        C37641gt gtVar = new C37641gt();
        f100008c = gtVar;
        C62942bv.registerDefaultInstance(C37641gt.class, gtVar);
    }

    private C37641gt() {
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
                return newMessageInfo(f100008c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C37642gu.f100012a});
            case 3:
                return new C37641gt();
            case 4:
                return new C37640gs();
            case 5:
                return f100008c;
            case 6:
                C63010eb ebVar = f100009d;
                if (ebVar == null) {
                    synchronized (C37641gt.class) {
                        ebVar = f100009d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f100008c);
                            f100009d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
