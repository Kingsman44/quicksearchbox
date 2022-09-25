package com.google.protos.p4963bf.p4964a.p4965a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.bf.a.a.am */
/* compiled from: PG */
public final class C64564am extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64564am f175066a;

    /* renamed from: b */
    private static volatile C63010eb f175067b;

    static {
        C64564am amVar = new C64564am();
        f175066a = amVar;
        C62942bv.registerDefaultInstance(C64564am.class, amVar);
    }

    private C64564am() {
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
                return newMessageInfo(f175066a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C64564am();
            case 4:
                return new C64563al();
            case 5:
                return f175066a;
            case 6:
                C63010eb ebVar = f175067b;
                if (ebVar == null) {
                    synchronized (C64564am.class) {
                        ebVar = f175067b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175066a);
                            f175067b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
