package com.google.common.p4552o.p4566l;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.l.t */
/* compiled from: PG */
public final class C60220t extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C60220t f162931e;

    /* renamed from: g */
    private static volatile C63010eb f162932g;

    /* renamed from: a */
    public int f162933a;

    /* renamed from: b */
    public long f162934b;

    /* renamed from: c */
    public int f162935c;

    /* renamed from: d */
    public int f162936d;

    /* renamed from: f */
    private byte f162937f = 2;

    static {
        C60220t tVar = new C60220t();
        f162931e = tVar;
        C62942bv.registerDefaultInstance(C60220t.class, tVar);
    }

    private C60220t() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f162937f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f162937f = b;
                return null;
            case 2:
                return newMessageInfo(f162931e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔂ\u0000\u0002ᔆ\u0001\u0003ᔆ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C60220t();
            case 4:
                return new C60219s();
            case 5:
                return f162931e;
            case 6:
                C63010eb ebVar = f162932g;
                if (ebVar == null) {
                    synchronized (C60220t.class) {
                        ebVar = f162932g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162931e);
                            f162932g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
