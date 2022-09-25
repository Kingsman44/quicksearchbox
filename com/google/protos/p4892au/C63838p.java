package com.google.protos.p4892au;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.au.p */
/* compiled from: PG */
public final class C63838p extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63838p f172632a;

    /* renamed from: b */
    private static volatile C63010eb f172633b;

    static {
        C63838p pVar = new C63838p();
        f172632a = pVar;
        C62942bv.registerDefaultInstance(C63838p.class, pVar);
    }

    private C63838p() {
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
                return newMessageInfo(f172632a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C63838p();
            case 4:
                return new C63837o();
            case 5:
                return f172632a;
            case 6:
                C63010eb ebVar = f172633b;
                if (ebVar == null) {
                    synchronized (C63838p.class) {
                        ebVar = f172633b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172632a);
                            f172633b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
