package com.google.android.apps.search.fedora.p10099e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.fedora.e.ad */
/* compiled from: PG */
public final class C132773ad extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C132773ad f362225e;

    /* renamed from: f */
    private static volatile C63010eb f362226f;

    /* renamed from: a */
    public int f362227a;

    /* renamed from: b */
    public C132775af f362228b;

    /* renamed from: c */
    public C132779aj f362229c;

    /* renamed from: d */
    public C132771ab f362230d;

    static {
        C132773ad adVar = new C132773ad();
        f362225e = adVar;
        C62942bv.registerDefaultInstance(C132773ad.class, adVar);
    }

    private C132773ad() {
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
                return newMessageInfo(f362225e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C132773ad();
            case 4:
                return new C132772ac();
            case 5:
                return f362225e;
            case 6:
                C63010eb ebVar = f362226f;
                if (ebVar == null) {
                    synchronized (C132773ad.class) {
                        ebVar = f362226f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f362225e);
                            f362226f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
