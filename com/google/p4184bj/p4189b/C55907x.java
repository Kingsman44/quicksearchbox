package com.google.p4184bj.p4189b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4184bj.p4189b.p4192c.C55886a;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bj.b.x */
/* compiled from: PG */
public final class C55907x extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C55907x f148763e;

    /* renamed from: f */
    private static volatile C63010eb f148764f;

    /* renamed from: a */
    public int f148765a;

    /* renamed from: b */
    public int f148766b;

    /* renamed from: c */
    public long f148767c;

    /* renamed from: d */
    public int f148768d;

    static {
        C55907x xVar = new C55907x();
        f148763e = xVar;
        C62942bv.registerDefaultInstance(C55907x.class, xVar);
    }

    private C55907x() {
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
                return newMessageInfo(f148763e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", C55906w.f148762a, C45240c.f118157a, "d", C55886a.f148715a});
            case 3:
                return new C55907x();
            case 4:
                return new C55905v();
            case 5:
                return f148763e;
            case 6:
                C63010eb ebVar = f148764f;
                if (ebVar == null) {
                    synchronized (C55907x.class) {
                        ebVar = f148764f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f148763e);
                            f148764f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
