package com.google.speech.p5208h;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.h.dk */
/* compiled from: PG */
public final class C66644dk extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C66644dk f181310a;

    /* renamed from: b */
    private static volatile C63010eb f181311b;

    static {
        C66644dk dkVar = new C66644dk();
        f181310a = dkVar;
        C62942bv.registerDefaultInstance(C66644dk.class, dkVar);
    }

    private C66644dk() {
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
                return newMessageInfo(f181310a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C66644dk();
            case 4:
                return new C66643dj();
            case 5:
                return f181310a;
            case 6:
                C63010eb ebVar = f181311b;
                if (ebVar == null) {
                    synchronized (C66644dk.class) {
                        ebVar = f181311b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181310a);
                            f181311b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
