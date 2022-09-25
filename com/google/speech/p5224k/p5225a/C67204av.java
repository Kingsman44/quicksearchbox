package com.google.speech.p5224k.p5225a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.k.a.av */
/* compiled from: PG */
public final class C67204av extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C67204av f182659a;

    /* renamed from: b */
    private static volatile C63010eb f182660b;

    static {
        C67204av avVar = new C67204av();
        f182659a = avVar;
        C62942bv.registerDefaultInstance(C67204av.class, avVar);
    }

    private C67204av() {
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
                return newMessageInfo(f182659a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C67204av();
            case 4:
                return new C67203au();
            case 5:
                return f182659a;
            case 6:
                C63010eb ebVar = f182660b;
                if (ebVar == null) {
                    synchronized (C67204av.class) {
                        ebVar = f182660b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182659a);
                            f182660b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
