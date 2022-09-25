package com.google.protos.p4850an;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.ab */
/* compiled from: PG */
public final class C63331ab extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63331ab f171164a;

    /* renamed from: b */
    private static volatile C63010eb f171165b;

    static {
        C63331ab abVar = new C63331ab();
        f171164a = abVar;
        C62942bv.registerDefaultInstance(C63331ab.class, abVar);
    }

    private C63331ab() {
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
                return newMessageInfo(f171164a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C63331ab();
            case 4:
                return new C63330aa();
            case 5:
                return f171164a;
            case 6:
                C63010eb ebVar = f171165b;
                if (ebVar == null) {
                    synchronized (C63331ab.class) {
                        ebVar = f171165b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171164a);
                            f171165b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
