package com.google.protos.p4850an;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.an */
/* compiled from: PG */
public final class C63343an extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63343an f171180a;

    /* renamed from: b */
    private static volatile C63010eb f171181b;

    static {
        C63343an anVar = new C63343an();
        f171180a = anVar;
        C62942bv.registerDefaultInstance(C63343an.class, anVar);
    }

    private C63343an() {
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
                return newMessageInfo(f171180a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C63343an();
            case 4:
                return new C63342am();
            case 5:
                return f171180a;
            case 6:
                C63010eb ebVar = f171181b;
                if (ebVar == null) {
                    synchronized (C63343an.class) {
                        ebVar = f171181b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171180a);
                            f171181b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
