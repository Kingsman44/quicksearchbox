package com.google.android.apps.gsa.nga.shared.p6345h;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.bc */
/* compiled from: PG */
public final class C81272bc extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C81272bc f222473e;

    /* renamed from: f */
    private static volatile C63010eb f222474f;

    /* renamed from: a */
    public int f222475a;

    /* renamed from: b */
    public int f222476b;

    /* renamed from: c */
    public int f222477c;

    /* renamed from: d */
    public int f222478d;

    static {
        C81272bc bcVar = new C81272bc();
        f222473e = bcVar;
        C62942bv.registerDefaultInstance(C81272bc.class, bcVar);
    }

    private C81272bc() {
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
                return newMessageInfo(f222473e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001င\u0000\u0003င\u0001\u0004င\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C81272bc();
            case 4:
                return new C81271bb();
            case 5:
                return f222473e;
            case 6:
                C63010eb ebVar = f222474f;
                if (ebVar == null) {
                    synchronized (C81272bc.class) {
                        ebVar = f222474f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f222473e);
                            f222474f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
