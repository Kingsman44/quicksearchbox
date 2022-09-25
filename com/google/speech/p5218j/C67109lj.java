package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.lj */
/* compiled from: PG */
public final class C67109lj extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C67109lj f182438a;

    /* renamed from: b */
    private static volatile C63010eb f182439b;

    static {
        C67109lj ljVar = new C67109lj();
        f182438a = ljVar;
        C62942bv.registerDefaultInstance(C67109lj.class, ljVar);
    }

    private C67109lj() {
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
                return newMessageInfo(f182438a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C67109lj();
            case 4:
                return new C67108li();
            case 5:
                return f182438a;
            case 6:
                C63010eb ebVar = f182439b;
                if (ebVar == null) {
                    synchronized (C67109lj.class) {
                        ebVar = f182439b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182438a);
                            f182439b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
