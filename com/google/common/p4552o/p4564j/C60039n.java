package com.google.common.p4552o.p4564j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.j.n */
/* compiled from: PG */
public final class C60039n extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C60039n f162279d;

    /* renamed from: e */
    private static volatile C63010eb f162280e;

    /* renamed from: a */
    public int f162281a;

    /* renamed from: b */
    public int f162282b;

    /* renamed from: c */
    public int f162283c;

    static {
        C60039n nVar = new C60039n();
        f162279d = nVar;
        C62942bv.registerDefaultInstance(C60039n.class, nVar);
    }

    private C60039n() {
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
                return newMessageInfo(f162279d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C60039n();
            case 4:
                return new C60038m();
            case 5:
                return f162279d;
            case 6:
                C63010eb ebVar = f162280e;
                if (ebVar == null) {
                    synchronized (C60039n.class) {
                        ebVar = f162280e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162279d);
                            f162280e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
