package com.google.protos.p4895aw.p4902b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.b.ed */
/* compiled from: PG */
public final class C64075ed extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64075ed f173226a;

    /* renamed from: b */
    private static volatile C63010eb f173227b;

    static {
        C64075ed edVar = new C64075ed();
        f173226a = edVar;
        C62942bv.registerDefaultInstance(C64075ed.class, edVar);
    }

    private C64075ed() {
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
                return newMessageInfo(f173226a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C64075ed();
            case 4:
                return new C64074ec();
            case 5:
                return f173226a;
            case 6:
                C63010eb ebVar = f173227b;
                if (ebVar == null) {
                    synchronized (C64075ed.class) {
                        ebVar = f173227b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173226a);
                            f173227b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
