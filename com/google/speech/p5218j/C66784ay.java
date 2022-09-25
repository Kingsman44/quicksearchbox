package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.ay */
/* compiled from: PG */
public final class C66784ay extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C66784ay f181622a;

    /* renamed from: b */
    private static volatile C63010eb f181623b;

    static {
        C66784ay ayVar = new C66784ay();
        f181622a = ayVar;
        C62942bv.registerDefaultInstance(C66784ay.class, ayVar);
    }

    private C66784ay() {
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
                return newMessageInfo(f181622a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C66784ay();
            case 4:
                return new C66783ax();
            case 5:
                return f181622a;
            case 6:
                C63010eb ebVar = f181623b;
                if (ebVar == null) {
                    synchronized (C66784ay.class) {
                        ebVar = f181623b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181622a);
                            f181623b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
