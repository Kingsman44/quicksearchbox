package com.google.android.p10712d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.hj */
/* compiled from: PG */
public final class C142493hj extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C142493hj f386682b;

    /* renamed from: d */
    private static volatile C63010eb f386683d;

    /* renamed from: a */
    public int f386684a = 0;

    /* renamed from: c */
    private Object f386685c;

    static {
        C142493hj hjVar = new C142493hj();
        f386682b = hjVar;
        C62942bv.registerDefaultInstance(C142493hj.class, hjVar);
    }

    private C142493hj() {
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
                return newMessageInfo(f386682b, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{C45240c.f118157a, "a", C142485hb.class, C142497hn.class, C142476gt.class});
            case 3:
                return new C142493hj();
            case 4:
                return new C142492hi();
            case 5:
                return f386682b;
            case 6:
                C63010eb ebVar = f386683d;
                if (ebVar == null) {
                    synchronized (C142493hj.class) {
                        ebVar = f386683d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386682b);
                            f386683d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
