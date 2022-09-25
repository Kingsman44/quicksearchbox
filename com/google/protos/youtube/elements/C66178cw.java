package com.google.protos.youtube.elements;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.elements.cw */
/* compiled from: PG */
public final class C66178cw extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C66178cw f179954a;

    /* renamed from: b */
    private static volatile C63010eb f179955b;

    static {
        C66178cw cwVar = new C66178cw();
        f179954a = cwVar;
        C62942bv.registerDefaultInstance(C66178cw.class, cwVar);
    }

    private C66178cw() {
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
                return newMessageInfo(f179954a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C66178cw();
            case 4:
                return new C66177cv();
            case 5:
                return f179954a;
            case 6:
                C63010eb ebVar = f179955b;
                if (ebVar == null) {
                    synchronized (C66178cw.class) {
                        ebVar = f179955b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179954a);
                            f179955b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
