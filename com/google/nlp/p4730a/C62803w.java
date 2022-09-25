package com.google.nlp.p4730a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.nlp.a.w */
/* compiled from: PG */
public final class C62803w extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62803w f169605a;

    /* renamed from: b */
    private static volatile C63010eb f169606b;

    static {
        C62803w wVar = new C62803w();
        f169605a = wVar;
        C62942bv.registerDefaultInstance(C62803w.class, wVar);
    }

    private C62803w() {
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
                return newMessageInfo(f169605a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62803w();
            case 4:
                return new C62802v();
            case 5:
                return f169605a;
            case 6:
                C63010eb ebVar = f169606b;
                if (ebVar == null) {
                    synchronized (C62803w.class) {
                        ebVar = f169606b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169605a);
                            f169606b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
