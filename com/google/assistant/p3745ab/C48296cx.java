package com.google.assistant.p3745ab;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.cx */
/* compiled from: PG */
public final class C48296cx extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C48296cx f124910d;

    /* renamed from: e */
    private static volatile C63010eb f124911e;

    /* renamed from: a */
    public boolean f124912a;

    /* renamed from: b */
    public boolean f124913b;

    /* renamed from: c */
    public boolean f124914c;

    static {
        C48296cx cxVar = new C48296cx();
        f124910d = cxVar;
        C62942bv.registerDefaultInstance(C48296cx.class, cxVar);
    }

    private C48296cx() {
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
                return newMessageInfo(f124910d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C48296cx();
            case 4:
                return new C48295cw();
            case 5:
                return f124910d;
            case 6:
                C63010eb ebVar = f124911e;
                if (ebVar == null) {
                    synchronized (C48296cx.class) {
                        ebVar = f124911e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124910d);
                            f124911e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
