package com.google.p4479cg;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.cg.d */
/* compiled from: PG */
public final class C58072d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C58072d f155218d;

    /* renamed from: e */
    private static volatile C63010eb f155219e;

    /* renamed from: a */
    public int f155220a;

    /* renamed from: b */
    public int f155221b;

    /* renamed from: c */
    public int f155222c;

    static {
        C58072d dVar = new C58072d();
        f155218d = dVar;
        C62942bv.registerDefaultInstance(C58072d.class, dVar);
    }

    private C58072d() {
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
                return newMessageInfo(f155218d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C58072d();
            case 4:
                return new C58071c();
            case 5:
                return f155218d;
            case 6:
                C63010eb ebVar = f155219e;
                if (ebVar == null) {
                    synchronized (C58072d.class) {
                        ebVar = f155219e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f155218d);
                            f155219e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
