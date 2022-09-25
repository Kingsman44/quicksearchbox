package com.google.p4283bv.p4412k.p4415c.p4416a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.k.c.a.n */
/* compiled from: PG */
public final class C57856n extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57856n f154566c;

    /* renamed from: d */
    private static volatile C63010eb f154567d;

    /* renamed from: a */
    public boolean f154568a;

    /* renamed from: b */
    public boolean f154569b;

    static {
        C57856n nVar = new C57856n();
        f154566c = nVar;
        C62942bv.registerDefaultInstance(C57856n.class, nVar);
    }

    private C57856n() {
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
                return newMessageInfo(f154566c, "\u0000\u0002\u0000\u0000\u0001\u0004\u0002\u0000\u0000\u0000\u0001\u0007\u0004\u0007", new Object[]{"a", "b"});
            case 3:
                return new C57856n();
            case 4:
                return new C57855m();
            case 5:
                return f154566c;
            case 6:
                C63010eb ebVar = f154567d;
                if (ebVar == null) {
                    synchronized (C57856n.class) {
                        ebVar = f154567d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154566c);
                            f154567d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
