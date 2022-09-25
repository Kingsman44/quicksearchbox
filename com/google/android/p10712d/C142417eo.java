package com.google.android.p10712d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.eo */
/* compiled from: PG */
public final class C142417eo extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C142417eo f386441a;

    /* renamed from: b */
    private static volatile C63010eb f386442b;

    static {
        C142417eo eoVar = new C142417eo();
        f386441a = eoVar;
        C62942bv.registerDefaultInstance(C142417eo.class, eoVar);
    }

    private C142417eo() {
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
                return newMessageInfo(f386441a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C142417eo();
            case 4:
                return new C142416en();
            case 5:
                return f386441a;
            case 6:
                C63010eb ebVar = f386442b;
                if (ebVar == null) {
                    synchronized (C142417eo.class) {
                        ebVar = f386442b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386441a);
                            f386442b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
