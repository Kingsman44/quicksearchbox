package com.google.android.libraries.search.p2904c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.v */
/* compiled from: PG */
public final class C38119v extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C38119v f100992c;

    /* renamed from: d */
    private static volatile C63010eb f100993d;

    /* renamed from: a */
    public int f100994a = 0;

    /* renamed from: b */
    public Object f100995b;

    static {
        C38119v vVar = new C38119v();
        f100992c = vVar;
        C62942bv.registerDefaultInstance(C38119v.class, vVar);
    }

    private C38119v() {
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
                return newMessageInfo(f100992c, "\u0001\u0003\u0001\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0003ြ\u0000\u0004ြ\u0000", new Object[]{"b", "a", C37967s.class, C37945q.class, C37903o.class});
            case 3:
                return new C38119v();
            case 4:
                return new C37825m();
            case 5:
                return f100992c;
            case 6:
                C63010eb ebVar = f100993d;
                if (ebVar == null) {
                    synchronized (C38119v.class) {
                        ebVar = f100993d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f100992c);
                            f100993d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
