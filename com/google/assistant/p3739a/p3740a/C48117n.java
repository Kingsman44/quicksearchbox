package com.google.assistant.p3739a.p3740a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.a.a.n */
/* compiled from: PG */
public final class C48117n extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48117n f124533a;

    /* renamed from: b */
    private static volatile C63010eb f124534b;

    static {
        C48117n nVar = new C48117n();
        f124533a = nVar;
        C62942bv.registerDefaultInstance(C48117n.class, nVar);
    }

    private C48117n() {
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
                return newMessageInfo(f124533a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C48117n();
            case 4:
                return new C48116m();
            case 5:
                return f124533a;
            case 6:
                C63010eb ebVar = f124534b;
                if (ebVar == null) {
                    synchronized (C48117n.class) {
                        ebVar = f124534b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124533a);
                            f124534b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
