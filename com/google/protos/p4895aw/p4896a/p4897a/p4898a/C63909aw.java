package com.google.protos.p4895aw.p4896a.p4897a.p4898a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.a.a.a.aw */
/* compiled from: PG */
public final class C63909aw extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C63909aw f172816e;

    /* renamed from: f */
    private static volatile C63010eb f172817f;

    /* renamed from: a */
    public int f172818a;

    /* renamed from: b */
    public int f172819b;

    /* renamed from: c */
    public int f172820c;

    /* renamed from: d */
    public int f172821d;

    static {
        C63909aw awVar = new C63909aw();
        f172816e = awVar;
        C62942bv.registerDefaultInstance(C63909aw.class, awVar);
    }

    private C63909aw() {
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
                return newMessageInfo(f172816e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C63909aw();
            case 4:
                return new C63908av();
            case 5:
                return f172816e;
            case 6:
                C63010eb ebVar = f172817f;
                if (ebVar == null) {
                    synchronized (C63909aw.class) {
                        ebVar = f172817f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172816e);
                            f172817f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
