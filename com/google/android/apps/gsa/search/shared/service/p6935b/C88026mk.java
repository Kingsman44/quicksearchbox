package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.mk */
/* compiled from: PG */
public final class C88026mk extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C88026mk f238032d;

    /* renamed from: e */
    private static volatile C63010eb f238033e;

    /* renamed from: a */
    public int f238034a;

    /* renamed from: b */
    public int f238035b;

    /* renamed from: c */
    public boolean f238036c;

    static {
        C88026mk mkVar = new C88026mk();
        f238032d = mkVar;
        C62942bv.registerDefaultInstance(C88026mk.class, mkVar);
    }

    private C88026mk() {
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
                return newMessageInfo(f238032d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C88026mk();
            case 4:
                return new C88025mj();
            case 5:
                return f238032d;
            case 6:
                C63010eb ebVar = f238033e;
                if (ebVar == null) {
                    synchronized (C88026mk.class) {
                        ebVar = f238033e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238032d);
                            f238033e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
