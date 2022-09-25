package com.google.p4184bj.p4189b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4184bj.p4189b.p4191b.C55884a;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bj.b.u */
/* compiled from: PG */
public final class C55904u extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C55904u f148756e;

    /* renamed from: f */
    private static volatile C63010eb f148757f;

    /* renamed from: a */
    public int f148758a;

    /* renamed from: b */
    public int f148759b;

    /* renamed from: c */
    public long f148760c;

    /* renamed from: d */
    public int f148761d;

    static {
        C55904u uVar = new C55904u();
        f148756e = uVar;
        C62942bv.registerDefaultInstance(C55904u.class, uVar);
    }

    private C55904u() {
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
                return newMessageInfo(f148756e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", C55903t.f148755a, C45240c.f118157a, "d", C55884a.f148714a});
            case 3:
                return new C55904u();
            case 4:
                return new C55902s();
            case 5:
                return f148756e;
            case 6:
                C63010eb ebVar = f148757f;
                if (ebVar == null) {
                    synchronized (C55904u.class) {
                        ebVar = f148757f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f148756e);
                            f148757f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
