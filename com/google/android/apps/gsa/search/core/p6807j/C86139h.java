package com.google.android.apps.gsa.search.core.p6807j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.core.j.h */
/* compiled from: PG */
public final class C86139h extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C86139h f232811d;

    /* renamed from: e */
    private static volatile C63010eb f232812e;

    /* renamed from: a */
    public int f232813a;

    /* renamed from: b */
    public int f232814b;

    /* renamed from: c */
    public C86137f f232815c;

    static {
        C86139h hVar = new C86139h();
        f232811d = hVar;
        C62942bv.registerDefaultInstance(C86139h.class, hVar);
    }

    private C86139h() {
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
                return newMessageInfo(f232811d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C86139h();
            case 4:
                return new C86138g();
            case 5:
                return f232811d;
            case 6:
                C63010eb ebVar = f232812e;
                if (ebVar == null) {
                    synchronized (C86139h.class) {
                        ebVar = f232812e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f232811d);
                            f232812e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
