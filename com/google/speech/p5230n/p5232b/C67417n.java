package com.google.speech.p5230n.p5232b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.n.b.n */
/* compiled from: PG */
public final class C67417n extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C67417n f183227a;

    /* renamed from: b */
    private static volatile C63010eb f183228b;

    static {
        C67417n nVar = new C67417n();
        f183227a = nVar;
        C62942bv.registerDefaultInstance(C67417n.class, nVar);
    }

    private C67417n() {
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
                return newMessageInfo(f183227a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C67417n();
            case 4:
                return new C67416m();
            case 5:
                return f183227a;
            case 6:
                C63010eb ebVar = f183228b;
                if (ebVar == null) {
                    synchronized (C67417n.class) {
                        ebVar = f183228b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183227a);
                            f183228b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
