package com.google.android.libraries.search.p2904c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.hm */
/* compiled from: PG */
public final class C37666hm extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C37666hm f100042d;

    /* renamed from: e */
    private static volatile C63010eb f100043e;

    /* renamed from: a */
    public int f100044a;

    /* renamed from: b */
    public C37514du f100045b;

    /* renamed from: c */
    public int f100046c;

    static {
        C37666hm hmVar = new C37666hm();
        f100042d = hmVar;
        C62942bv.registerDefaultInstance(C37666hm.class, hmVar);
    }

    private C37666hm() {
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
                return newMessageInfo(f100042d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C37565ef.m66574b()});
            case 3:
                return new C37666hm();
            case 4:
                return new C37665hl();
            case 5:
                return f100042d;
            case 6:
                C63010eb ebVar = f100043e;
                if (ebVar == null) {
                    synchronized (C37666hm.class) {
                        ebVar = f100043e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f100042d);
                            f100043e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
