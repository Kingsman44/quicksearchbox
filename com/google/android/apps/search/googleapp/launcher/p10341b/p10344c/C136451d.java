package com.google.android.apps.search.googleapp.launcher.p10341b.p10344c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.c.d */
/* compiled from: PG */
public final class C136451d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C136451d f371493e;

    /* renamed from: f */
    private static volatile C63010eb f371494f;

    /* renamed from: a */
    public int f371495a;

    /* renamed from: b */
    public int f371496b;

    /* renamed from: c */
    public int f371497c;

    /* renamed from: d */
    public boolean f371498d;

    static {
        C136451d dVar = new C136451d();
        f371493e = dVar;
        C62942bv.registerDefaultInstance(C136451d.class, dVar);
    }

    private C136451d() {
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
                return newMessageInfo(f371493e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C136451d();
            case 4:
                return new C136450c();
            case 5:
                return f371493e;
            case 6:
                C63010eb ebVar = f371494f;
                if (ebVar == null) {
                    synchronized (C136451d.class) {
                        ebVar = f371494f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f371493e);
                            f371494f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
