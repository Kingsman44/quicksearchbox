package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.acv */
/* compiled from: PG */
public final class acv extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final acv f158332d;

    /* renamed from: e */
    private static volatile C63010eb f158333e;

    /* renamed from: a */
    public int f158334a;

    /* renamed from: b */
    public int f158335b;

    /* renamed from: c */
    public int f158336c;

    static {
        acv acv = new acv();
        f158332d = acv;
        C62942bv.registerDefaultInstance(acv.class, acv);
    }

    private acv() {
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
                return newMessageInfo(f158332d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new acv();
            case 4:
                return new acu();
            case 5:
                return f158332d;
            case 6:
                C63010eb ebVar = f158333e;
                if (ebVar == null) {
                    synchronized (acv.class) {
                        ebVar = f158333e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158332d);
                            f158333e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
