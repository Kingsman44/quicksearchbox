package com.google.p363ad.p364a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ad.a.w */
/* compiled from: PG */
public final class C6699w extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C6699w f20003a;

    /* renamed from: b */
    private static volatile C63010eb f20004b;

    static {
        C6699w wVar = new C6699w();
        f20003a = wVar;
        C62942bv.registerDefaultInstance(C6699w.class, wVar);
    }

    private C6699w() {
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
                return newMessageInfo(f20003a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C6699w();
            case 4:
                return new C6698v();
            case 5:
                return f20003a;
            case 6:
                C63010eb ebVar = f20004b;
                if (ebVar == null) {
                    synchronized (C6699w.class) {
                        ebVar = f20004b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f20003a);
                            f20004b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
