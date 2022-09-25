package com.google.p4184bj.p4189b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bj.b.n */
/* compiled from: PG */
public final class C55897n extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C55897n f148738b;

    /* renamed from: d */
    private static volatile C63010eb f148739d;

    /* renamed from: a */
    public int f148740a;

    /* renamed from: c */
    private int f148741c;

    static {
        C55897n nVar = new C55897n();
        f148738b = nVar;
        C62942bv.registerDefaultInstance(C55897n.class, nVar);
    }

    private C55897n() {
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
                return newMessageInfo(f148738b, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003င\u0002", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C55897n();
            case 4:
                return new C55896m();
            case 5:
                return f148738b;
            case 6:
                C63010eb ebVar = f148739d;
                if (ebVar == null) {
                    synchronized (C55897n.class) {
                        ebVar = f148739d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f148738b);
                            f148739d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
