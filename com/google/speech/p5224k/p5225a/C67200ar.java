package com.google.speech.p5224k.p5225a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.k.a.ar */
/* compiled from: PG */
public final class C67200ar extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C67200ar f182653a;

    /* renamed from: b */
    private static volatile C63010eb f182654b;

    static {
        C67200ar arVar = new C67200ar();
        f182653a = arVar;
        C62942bv.registerDefaultInstance(C67200ar.class, arVar);
    }

    private C67200ar() {
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
                return newMessageInfo(f182653a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C67200ar();
            case 4:
                return new C67199aq();
            case 5:
                return f182653a;
            case 6:
                C63010eb ebVar = f182654b;
                if (ebVar == null) {
                    synchronized (C67200ar.class) {
                        ebVar = f182654b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182653a);
                            f182654b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
