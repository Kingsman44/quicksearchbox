package com.google.android.p10712d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.cx */
/* compiled from: PG */
public final class C142372cx extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C142372cx f386324d;

    /* renamed from: e */
    private static volatile C63010eb f386325e;

    /* renamed from: a */
    public int f386326a;

    /* renamed from: b */
    public int f386327b;

    /* renamed from: c */
    public int f386328c;

    static {
        C142372cx cxVar = new C142372cx();
        f386324d = cxVar;
        C62942bv.registerDefaultInstance(C142372cx.class, cxVar);
    }

    private C142372cx() {
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
                return newMessageInfo(f386324d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"a", "b", C142371cw.m231071b(), C45240c.f118157a});
            case 3:
                return new C142372cx();
            case 4:
                return new C142369cu();
            case 5:
                return f386324d;
            case 6:
                C63010eb ebVar = f386325e;
                if (ebVar == null) {
                    synchronized (C142372cx.class) {
                        ebVar = f386325e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386324d);
                            f386325e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
