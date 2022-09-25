package com.google.android.p10712d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.be */
/* compiled from: PG */
public final class C142326be extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C142326be f386133e;

    /* renamed from: f */
    private static volatile C63010eb f386134f;

    /* renamed from: a */
    public int f386135a;

    /* renamed from: b */
    public C142355cg f386136b;

    /* renamed from: c */
    public C142355cg f386137c;

    /* renamed from: d */
    public C142328bg f386138d;

    static {
        C142326be beVar = new C142326be();
        f386133e = beVar;
        C62942bv.registerDefaultInstance(C142326be.class, beVar);
    }

    private C142326be() {
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
                return newMessageInfo(f386133e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C142326be();
            case 4:
                return new C142325bd();
            case 5:
                return f386133e;
            case 6:
                C63010eb ebVar = f386134f;
                if (ebVar == null) {
                    synchronized (C142326be.class) {
                        ebVar = f386134f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386133e);
                            f386134f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
