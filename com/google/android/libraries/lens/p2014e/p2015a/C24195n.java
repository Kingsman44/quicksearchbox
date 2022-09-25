package com.google.android.libraries.lens.p2014e.p2015a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.e.a.n */
/* compiled from: PG */
public final class C24195n extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C24195n f66127f;

    /* renamed from: g */
    private static volatile C63010eb f66128g;

    /* renamed from: a */
    public float f66129a;

    /* renamed from: b */
    public float f66130b;

    /* renamed from: c */
    public float f66131c;

    /* renamed from: d */
    public float f66132d;

    /* renamed from: e */
    public float f66133e;

    static {
        C24195n nVar = new C24195n();
        f66127f = nVar;
        C62942bv.registerDefaultInstance(C24195n.class, nVar);
    }

    private C24195n() {
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
                return newMessageInfo(f66127f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0001\u0002\u0001\u0003\u0001\u0004\u0001\u0005\u0001", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C24195n();
            case 4:
                return new C24194m();
            case 5:
                return f66127f;
            case 6:
                C63010eb ebVar = f66128g;
                if (ebVar == null) {
                    synchronized (C24195n.class) {
                        ebVar = f66128g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f66127f);
                            f66128g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
