package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.pe */
/* compiled from: PG */
public final class C7929pe extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C7929pe f27862a;

    /* renamed from: b */
    private static volatile C63010eb f27863b;

    static {
        C7929pe peVar = new C7929pe();
        f27862a = peVar;
        C62942bv.registerDefaultInstance(C7929pe.class, peVar);
    }

    private C7929pe() {
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
                return newMessageInfo(f27862a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C7929pe();
            case 4:
                return new C7928pd();
            case 5:
                return f27862a;
            case 6:
                C63010eb ebVar = f27863b;
                if (ebVar == null) {
                    synchronized (C7929pe.class) {
                        ebVar = f27863b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27862a);
                            f27863b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
