package com.google.p427am.p438d.p439a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.d.a.ar */
/* compiled from: PG */
public final class C8717ar extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8717ar f30048a;

    /* renamed from: b */
    private static volatile C63010eb f30049b;

    static {
        C8717ar arVar = new C8717ar();
        f30048a = arVar;
        C62942bv.registerDefaultInstance(C8717ar.class, arVar);
    }

    private C8717ar() {
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
                return newMessageInfo(f30048a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C8717ar();
            case 4:
                return new C8716aq();
            case 5:
                return f30048a;
            case 6:
                C63010eb ebVar = f30049b;
                if (ebVar == null) {
                    synchronized (C8717ar.class) {
                        ebVar = f30049b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30048a);
                            f30049b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
