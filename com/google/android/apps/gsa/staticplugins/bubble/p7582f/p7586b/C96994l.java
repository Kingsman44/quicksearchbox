package com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7586b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.f.b.l */
/* compiled from: PG */
public final class C96994l extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C96994l f271061e;

    /* renamed from: f */
    private static volatile C63010eb f271062f;

    /* renamed from: a */
    public int f271063a;

    /* renamed from: b */
    public int f271064b;

    /* renamed from: c */
    public int f271065c;

    /* renamed from: d */
    public int f271066d;

    static {
        C96994l lVar = new C96994l();
        f271061e = lVar;
        C62942bv.registerDefaultInstance(C96994l.class, lVar);
    }

    private C96994l() {
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
                return newMessageInfo(f271061e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C96994l();
            case 4:
                return new C96993k();
            case 5:
                return f271061e;
            case 6:
                C63010eb ebVar = f271062f;
                if (ebVar == null) {
                    synchronized (C96994l.class) {
                        ebVar = f271062f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f271061e);
                            f271062f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
