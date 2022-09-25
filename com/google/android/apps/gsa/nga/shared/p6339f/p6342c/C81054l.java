package com.google.android.apps.gsa.nga.shared.p6339f.p6342c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.f.c.l */
/* compiled from: PG */
public final class C81054l extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C81054l f222161d;

    /* renamed from: e */
    private static volatile C63010eb f222162e;

    /* renamed from: a */
    public int f222163a;

    /* renamed from: b */
    public boolean f222164b;

    /* renamed from: c */
    public boolean f222165c;

    static {
        C81054l lVar = new C81054l();
        f222161d = lVar;
        C62942bv.registerDefaultInstance(C81054l.class, lVar);
    }

    private C81054l() {
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
                return newMessageInfo(f222161d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0003ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C81054l();
            case 4:
                return new C81053k();
            case 5:
                return f222161d;
            case 6:
                C63010eb ebVar = f222162e;
                if (ebVar == null) {
                    synchronized (C81054l.class) {
                        ebVar = f222162e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f222161d);
                            f222162e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
