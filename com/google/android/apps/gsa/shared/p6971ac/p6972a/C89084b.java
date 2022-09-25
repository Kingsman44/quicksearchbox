package com.google.android.apps.gsa.shared.p6971ac.p6972a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4479cg.C58075g;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.ac.a.b */
/* compiled from: PG */
public final class C89084b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C89084b f241419e;

    /* renamed from: f */
    private static volatile C63010eb f241420f;

    /* renamed from: a */
    public int f241421a;

    /* renamed from: b */
    public boolean f241422b;

    /* renamed from: c */
    public int f241423c;

    /* renamed from: d */
    public C58075g f241424d;

    static {
        C89084b bVar = new C89084b();
        f241419e = bVar;
        C62942bv.registerDefaultInstance(C89084b.class, bVar);
    }

    private C89084b() {
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
                return newMessageInfo(f241419e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C89084b();
            case 4:
                return new C89083a();
            case 5:
                return f241419e;
            case 6:
                C63010eb ebVar = f241420f;
                if (ebVar == null) {
                    synchronized (C89084b.class) {
                        ebVar = f241420f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f241419e);
                            f241420f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
