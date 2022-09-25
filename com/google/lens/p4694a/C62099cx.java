package com.google.lens.p4694a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.cx */
/* compiled from: PG */
public final class C62099cx extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62099cx f167713a;

    /* renamed from: b */
    private static volatile C63010eb f167714b;

    static {
        C62099cx cxVar = new C62099cx();
        f167713a = cxVar;
        C62942bv.registerDefaultInstance(C62099cx.class, cxVar);
    }

    private C62099cx() {
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
                return newMessageInfo(f167713a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62099cx();
            case 4:
                return new C62098cw();
            case 5:
                return f167713a;
            case 6:
                C63010eb ebVar = f167714b;
                if (ebVar == null) {
                    synchronized (C62099cx.class) {
                        ebVar = f167714b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167713a);
                            f167714b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
