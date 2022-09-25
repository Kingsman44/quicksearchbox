package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.id */
/* compiled from: PG */
public final class C7739id extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C7739id f27046a;

    /* renamed from: b */
    private static volatile C63010eb f27047b;

    static {
        C7739id idVar = new C7739id();
        f27046a = idVar;
        C62942bv.registerDefaultInstance(C7739id.class, idVar);
    }

    private C7739id() {
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
                return newMessageInfo(f27046a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C7739id();
            case 4:
                return new C7738ic();
            case 5:
                return f27046a;
            case 6:
                C63010eb ebVar = f27047b;
                if (ebVar == null) {
                    synchronized (C7739id.class) {
                        ebVar = f27047b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27046a);
                            f27047b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
