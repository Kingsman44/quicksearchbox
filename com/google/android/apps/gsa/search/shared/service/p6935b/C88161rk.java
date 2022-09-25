package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.rk */
/* compiled from: PG */
public final class C88161rk extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C88161rk f238326e;

    /* renamed from: f */
    private static volatile C63010eb f238327f;

    /* renamed from: a */
    public int f238328a;

    /* renamed from: b */
    public int f238329b;

    /* renamed from: c */
    public int f238330c;

    /* renamed from: d */
    public int f238331d;

    static {
        C88161rk rkVar = new C88161rk();
        f238326e = rkVar;
        C62942bv.registerDefaultInstance(C88161rk.class, rkVar);
    }

    private C88161rk() {
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
                return newMessageInfo(f238326e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C88161rk();
            case 4:
                return new C88160rj();
            case 5:
                return f238326e;
            case 6:
                C63010eb ebVar = f238327f;
                if (ebVar == null) {
                    synchronized (C88161rk.class) {
                        ebVar = f238327f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238326e);
                            f238327f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
