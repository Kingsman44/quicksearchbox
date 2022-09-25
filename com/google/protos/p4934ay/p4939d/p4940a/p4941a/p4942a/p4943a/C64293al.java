package com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ay.d.a.a.a.a.al */
/* compiled from: PG */
public final class C64293al extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64293al f173838a;

    /* renamed from: b */
    private static volatile C63010eb f173839b;

    static {
        C64293al alVar = new C64293al();
        f173838a = alVar;
        C62942bv.registerDefaultInstance(C64293al.class, alVar);
    }

    private C64293al() {
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
                return newMessageInfo(f173838a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C64293al();
            case 4:
                return new C64292ak();
            case 5:
                return f173838a;
            case 6:
                C63010eb ebVar = f173839b;
                if (ebVar == null) {
                    synchronized (C64293al.class) {
                        ebVar = f173839b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173838a);
                            f173839b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
