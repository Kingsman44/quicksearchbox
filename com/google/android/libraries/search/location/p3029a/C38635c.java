package com.google.android.libraries.search.location.p3029a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.location.a.c */
/* compiled from: PG */
public final class C38635c extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C38635c f102089e;

    /* renamed from: f */
    private static volatile C63010eb f102090f;

    /* renamed from: a */
    public int f102091a;

    /* renamed from: b */
    public int f102092b;

    /* renamed from: c */
    public boolean f102093c;

    /* renamed from: d */
    public long f102094d;

    static {
        C38635c cVar = new C38635c();
        f102089e = cVar;
        C62942bv.registerDefaultInstance(C38635c.class, cVar);
    }

    private C38635c() {
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
                return newMessageInfo(f102089e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", C38590aj.m67897b(), C45240c.f118157a, "d"});
            case 3:
                return new C38635c();
            case 4:
                return new C38607b();
            case 5:
                return f102089e;
            case 6:
                C63010eb ebVar = f102090f;
                if (ebVar == null) {
                    synchronized (C38635c.class) {
                        ebVar = f102090f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f102089e);
                            f102090f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
