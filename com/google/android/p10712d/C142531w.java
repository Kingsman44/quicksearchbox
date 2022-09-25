package com.google.android.p10712d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.d.w */
/* compiled from: PG */
public final class C142531w extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C142531w f386756d;

    /* renamed from: e */
    private static volatile C63010eb f386757e;

    /* renamed from: a */
    public int f386758a;

    /* renamed from: b */
    public C63088z f386759b = C63088z.f170246b;

    /* renamed from: c */
    public C63088z f386760c = C63088z.f170246b;

    static {
        C142531w wVar = new C142531w();
        f386756d = wVar;
        C62942bv.registerDefaultInstance(C142531w.class, wVar);
    }

    private C142531w() {
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
                return newMessageInfo(f386756d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C142531w();
            case 4:
                return new C142530v();
            case 5:
                return f386756d;
            case 6:
                C63010eb ebVar = f386757e;
                if (ebVar == null) {
                    synchronized (C142531w.class) {
                        ebVar = f386757e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386756d);
                            f386757e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
