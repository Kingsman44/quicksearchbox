package com.google.protos.p4850an;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.ah */
/* compiled from: PG */
public final class C63337ah extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63337ah f171173a;

    /* renamed from: b */
    private static volatile C63010eb f171174b;

    static {
        C63337ah ahVar = new C63337ah();
        f171173a = ahVar;
        C62942bv.registerDefaultInstance(C63337ah.class, ahVar);
    }

    private C63337ah() {
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
                return newMessageInfo(f171173a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C63337ah();
            case 4:
                return new C63336ag();
            case 5:
                return f171173a;
            case 6:
                C63010eb ebVar = f171174b;
                if (ebVar == null) {
                    synchronized (C63337ah.class) {
                        ebVar = f171174b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171173a);
                            f171174b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
