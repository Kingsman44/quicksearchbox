package com.google.protos.p4963bf.p4964a.p4965a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.bf.a.a.ak */
/* compiled from: PG */
public final class C64562ak extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64562ak f175064a;

    /* renamed from: b */
    private static volatile C63010eb f175065b;

    static {
        C64562ak akVar = new C64562ak();
        f175064a = akVar;
        C62942bv.registerDefaultInstance(C64562ak.class, akVar);
    }

    private C64562ak() {
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
                return newMessageInfo(f175064a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C64562ak();
            case 4:
                return new C64561aj();
            case 5:
                return f175064a;
            case 6:
                C63010eb ebVar = f175065b;
                if (ebVar == null) {
                    synchronized (C64562ak.class) {
                        ebVar = f175065b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175064a);
                            f175065b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
