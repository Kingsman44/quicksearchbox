package com.google.assistant.p3803ag.p3809c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.ck */
/* compiled from: PG */
public final class C48991ck extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48991ck f126736b;

    /* renamed from: d */
    private static volatile C63010eb f126737d;

    /* renamed from: a */
    public int f126738a;

    /* renamed from: c */
    private int f126739c;

    static {
        C48991ck ckVar = new C48991ck();
        f126736b = ckVar;
        C62942bv.registerDefaultInstance(C48991ck.class, ckVar);
    }

    private C48991ck() {
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
                return newMessageInfo(f126736b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C48990cj.m85335b()});
            case 3:
                return new C48991ck();
            case 4:
                return new C48988ch();
            case 5:
                return f126736b;
            case 6:
                C63010eb ebVar = f126737d;
                if (ebVar == null) {
                    synchronized (C48991ck.class) {
                        ebVar = f126737d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126736b);
                            f126737d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
