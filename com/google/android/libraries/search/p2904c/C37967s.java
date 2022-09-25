package com.google.android.libraries.search.p2904c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.s */
/* compiled from: PG */
public final class C37967s extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C37967s f100592e;

    /* renamed from: f */
    private static volatile C63010eb f100593f;

    /* renamed from: a */
    public int f100594a;

    /* renamed from: b */
    public long f100595b;

    /* renamed from: c */
    public long f100596c;

    /* renamed from: d */
    public int f100597d;

    static {
        C37967s sVar = new C37967s();
        f100592e = sVar;
        C62942bv.registerDefaultInstance(C37967s.class, sVar);
    }

    private C37967s() {
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
                return newMessageInfo(f100592e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", C38112u.m67286b()});
            case 3:
                return new C37967s();
            case 4:
                return new C37956r();
            case 5:
                return f100592e;
            case 6:
                C63010eb ebVar = f100593f;
                if (ebVar == null) {
                    synchronized (C37967s.class) {
                        ebVar = f100593f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f100592e);
                            f100593f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
