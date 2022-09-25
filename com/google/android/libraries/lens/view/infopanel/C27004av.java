package com.google.android.libraries.lens.view.infopanel;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.view.infopanel.av */
/* compiled from: PG */
public final class C27004av extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C27004av f73627e;

    /* renamed from: f */
    private static volatile C63010eb f73628f;

    /* renamed from: a */
    public int f73629a;

    /* renamed from: b */
    public int f73630b;

    /* renamed from: c */
    public int f73631c;

    /* renamed from: d */
    public int f73632d;

    static {
        C27004av avVar = new C27004av();
        f73627e = avVar;
        C62942bv.registerDefaultInstance(C27004av.class, avVar);
    }

    private C27004av() {
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
                return newMessageInfo(f73627e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C27004av();
            case 4:
                return new C27003au();
            case 5:
                return f73627e;
            case 6:
                C63010eb ebVar = f73628f;
                if (ebVar == null) {
                    synchronized (C27004av.class) {
                        ebVar = f73628f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f73627e);
                            f73628f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
