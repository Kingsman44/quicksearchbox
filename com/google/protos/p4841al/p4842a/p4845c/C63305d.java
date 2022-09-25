package com.google.protos.p4841al.p4842a.p4845c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.al.a.c.d */
/* compiled from: PG */
public final class C63305d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63305d f171092a;

    /* renamed from: b */
    private static volatile C63010eb f171093b;

    static {
        C63305d dVar = new C63305d();
        f171092a = dVar;
        C62942bv.registerDefaultInstance(C63305d.class, dVar);
    }

    private C63305d() {
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
                return newMessageInfo(f171092a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C63305d();
            case 4:
                return new C63304c();
            case 5:
                return f171092a;
            case 6:
                C63010eb ebVar = f171093b;
                if (ebVar == null) {
                    synchronized (C63305d.class) {
                        ebVar = f171093b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171092a);
                            f171093b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
