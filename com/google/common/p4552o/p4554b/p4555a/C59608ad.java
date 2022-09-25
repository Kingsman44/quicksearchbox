package com.google.common.p4552o.p4554b.p4555a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.b.a.ad */
/* compiled from: PG */
public final class C59608ad extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C59608ad f159827a;

    /* renamed from: b */
    private static volatile C63010eb f159828b;

    static {
        C59608ad adVar = new C59608ad();
        f159827a = adVar;
        C62942bv.registerDefaultInstance(C59608ad.class, adVar);
    }

    private C59608ad() {
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
                return newMessageInfo(f159827a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C59608ad();
            case 4:
                return new C59607ac();
            case 5:
                return f159827a;
            case 6:
                C63010eb ebVar = f159828b;
                if (ebVar == null) {
                    synchronized (C59608ad.class) {
                        ebVar = f159828b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159827a);
                            f159828b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
