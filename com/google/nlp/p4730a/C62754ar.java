package com.google.nlp.p4730a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.nlp.a.ar */
/* compiled from: PG */
public final class C62754ar extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62754ar f169480a;

    /* renamed from: b */
    private static volatile C63010eb f169481b;

    static {
        C62754ar arVar = new C62754ar();
        f169480a = arVar;
        C62942bv.registerDefaultInstance(C62754ar.class, arVar);
    }

    private C62754ar() {
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
                return newMessageInfo(f169480a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62754ar();
            case 4:
                return new C62753aq();
            case 5:
                return f169480a;
            case 6:
                C63010eb ebVar = f169481b;
                if (ebVar == null) {
                    synchronized (C62754ar.class) {
                        ebVar = f169481b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169480a);
                            f169481b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
