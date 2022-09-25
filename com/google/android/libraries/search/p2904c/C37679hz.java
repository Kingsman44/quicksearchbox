package com.google.android.libraries.search.p2904c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.hz */
/* compiled from: PG */
public final class C37679hz extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C37679hz f100067c;

    /* renamed from: d */
    private static volatile C63010eb f100068d;

    /* renamed from: a */
    public int f100069a;

    /* renamed from: b */
    public int f100070b;

    static {
        C37679hz hzVar = new C37679hz();
        f100067c = hzVar;
        C62942bv.registerDefaultInstance(C37679hz.class, hzVar);
    }

    private C37679hz() {
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
                return newMessageInfo(f100067c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C37679hz();
            case 4:
                return new C37678hy();
            case 5:
                return f100067c;
            case 6:
                C63010eb ebVar = f100068d;
                if (ebVar == null) {
                    synchronized (C37679hz.class) {
                        ebVar = f100068d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f100067c);
                            f100068d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
