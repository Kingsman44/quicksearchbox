package com.google.common.p4552o.p4563i;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.i.h */
/* compiled from: PG */
public final class C59958h extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C59958h f162044a;

    /* renamed from: b */
    private static volatile C63010eb f162045b;

    static {
        C59958h hVar = new C59958h();
        f162044a = hVar;
        C62942bv.registerDefaultInstance(C59958h.class, hVar);
    }

    private C59958h() {
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
                return newMessageInfo(f162044a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C59958h();
            case 4:
                return new C59957g();
            case 5:
                return f162044a;
            case 6:
                C63010eb ebVar = f162045b;
                if (ebVar == null) {
                    synchronized (C59958h.class) {
                        ebVar = f162045b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162044a);
                            f162045b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
