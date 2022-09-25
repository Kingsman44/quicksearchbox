package com.google.android.apps.gsa.shared.p7023bg.p7024a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4479cg.C58075g;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.bg.a.d */
/* compiled from: PG */
public final class C89428d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C89428d f242417e;

    /* renamed from: f */
    private static volatile C63010eb f242418f;

    /* renamed from: a */
    public int f242419a;

    /* renamed from: b */
    public boolean f242420b;

    /* renamed from: c */
    public int f242421c;

    /* renamed from: d */
    public C58075g f242422d;

    static {
        C89428d dVar = new C89428d();
        f242417e = dVar;
        C62942bv.registerDefaultInstance(C89428d.class, dVar);
    }

    private C89428d() {
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
                return newMessageInfo(f242417e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C89428d();
            case 4:
                return new C89427c();
            case 5:
                return f242417e;
            case 6:
                C63010eb ebVar = f242418f;
                if (ebVar == null) {
                    synchronized (C89428d.class) {
                        ebVar = f242418f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f242417e);
                            f242418f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
