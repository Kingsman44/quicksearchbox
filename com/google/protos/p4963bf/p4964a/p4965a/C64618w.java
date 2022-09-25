package com.google.protos.p4963bf.p4964a.p4965a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.bf.a.a.w */
/* compiled from: PG */
public final class C64618w extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64618w f175167a;

    /* renamed from: b */
    private static volatile C63010eb f175168b;

    static {
        C64618w wVar = new C64618w();
        f175167a = wVar;
        C62942bv.registerDefaultInstance(C64618w.class, wVar);
    }

    private C64618w() {
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
                return newMessageInfo(f175167a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C64618w();
            case 4:
                return new C64617v();
            case 5:
                return f175167a;
            case 6:
                C63010eb ebVar = f175168b;
                if (ebVar == null) {
                    synchronized (C64618w.class) {
                        ebVar = f175168b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175167a);
                            f175168b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
