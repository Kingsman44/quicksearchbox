package com.google.protos.p4959be.p4960a.p4961a.p4962a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.protos.be.a.a.a.n */
/* compiled from: PG */
public final class C64538n extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C64538n f175027e;

    /* renamed from: f */
    private static volatile C63010eb f175028f;

    /* renamed from: a */
    public C63042fg f175029a;

    /* renamed from: b */
    public C62910ar f175030b;

    /* renamed from: c */
    public C64524dd f175031c;

    /* renamed from: d */
    public C64536l f175032d;

    static {
        C64538n nVar = new C64538n();
        f175027e = nVar;
        C62942bv.registerDefaultInstance(C64538n.class, nVar);
    }

    private C64538n() {
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
                return newMessageInfo(f175027e, "\u0000\u0004\u0000\u0000\u0001\u0007\u0004\u0000\u0000\u0000\u0001\t\u0002\t\u0004\t\u0007\t", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C64538n();
            case 4:
                return new C64537m();
            case 5:
                return f175027e;
            case 6:
                C63010eb ebVar = f175028f;
                if (ebVar == null) {
                    synchronized (C64538n.class) {
                        ebVar = f175028f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175027e);
                            f175028f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
