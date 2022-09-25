package com.google.android.apps.gsa.nga.shared.p6345h;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.bm */
/* compiled from: PG */
public final class C81282bm extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C81282bm f222509e;

    /* renamed from: f */
    private static volatile C63010eb f222510f;

    /* renamed from: a */
    public int f222511a;

    /* renamed from: b */
    public long f222512b;

    /* renamed from: c */
    public int f222513c;

    /* renamed from: d */
    public boolean f222514d;

    static {
        C81282bm bmVar = new C81282bm();
        f222509e = bmVar;
        C62942bv.registerDefaultInstance(C81282bm.class, bmVar);
    }

    private C81282bm() {
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
                return newMessageInfo(f222509e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C81282bm();
            case 4:
                return new C81281bl();
            case 5:
                return f222509e;
            case 6:
                C63010eb ebVar = f222510f;
                if (ebVar == null) {
                    synchronized (C81282bm.class) {
                        ebVar = f222510f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f222509e);
                            f222510f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
