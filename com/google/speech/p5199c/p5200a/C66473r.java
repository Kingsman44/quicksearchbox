package com.google.speech.p5199c.p5200a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.c.a.r */
/* compiled from: PG */
public final class C66473r extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C66473r f180744a;

    /* renamed from: b */
    private static volatile C63010eb f180745b;

    static {
        C66473r rVar = new C66473r();
        f180744a = rVar;
        C62942bv.registerDefaultInstance(C66473r.class, rVar);
    }

    private C66473r() {
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
                return newMessageInfo(f180744a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C66473r();
            case 4:
                return new C66472q();
            case 5:
                return f180744a;
            case 6:
                C63010eb ebVar = f180745b;
                if (ebVar == null) {
                    synchronized (C66473r.class) {
                        ebVar = f180745b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180744a);
                            f180745b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
