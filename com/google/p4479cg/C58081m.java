package com.google.p4479cg;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.cg.m */
/* compiled from: PG */
public final class C58081m extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C58081m f155254e;

    /* renamed from: f */
    private static volatile C63010eb f155255f;

    /* renamed from: a */
    public int f155256a;

    /* renamed from: b */
    public int f155257b;

    /* renamed from: c */
    public int f155258c;

    /* renamed from: d */
    public int f155259d;

    static {
        C58081m mVar = new C58081m();
        f155254e = mVar;
        C62942bv.registerDefaultInstance(C58081m.class, mVar);
    }

    private C58081m() {
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
                return newMessageInfo(f155254e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C58081m();
            case 4:
                return new C58080l();
            case 5:
                return f155254e;
            case 6:
                C63010eb ebVar = f155255f;
                if (ebVar == null) {
                    synchronized (C58081m.class) {
                        ebVar = f155255f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f155254e);
                            f155255f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
