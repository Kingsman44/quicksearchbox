package com.google.common.p4552o.p4566l;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.l.az */
/* compiled from: PG */
public final class C60134az extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C60134az f162663e;

    /* renamed from: f */
    private static volatile C63010eb f162664f;

    /* renamed from: a */
    public int f162665a;

    /* renamed from: b */
    public int f162666b;

    /* renamed from: c */
    public long f162667c;

    /* renamed from: d */
    public long f162668d;

    static {
        C60134az azVar = new C60134az();
        f162663e = azVar;
        C62942bv.registerDefaultInstance(C60134az.class, azVar);
    }

    private C60134az() {
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
                return newMessageInfo(f162663e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C60134az();
            case 4:
                return new C60133ay();
            case 5:
                return f162663e;
            case 6:
                C63010eb ebVar = f162664f;
                if (ebVar == null) {
                    synchronized (C60134az.class) {
                        ebVar = f162664f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162663e);
                            f162664f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
