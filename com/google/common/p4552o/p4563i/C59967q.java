package com.google.common.p4552o.p4563i;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.i.q */
/* compiled from: PG */
public final class C59967q extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C59967q f162073a;

    /* renamed from: b */
    private static volatile C63010eb f162074b;

    static {
        C59967q qVar = new C59967q();
        f162073a = qVar;
        C62942bv.registerDefaultInstance(C59967q.class, qVar);
    }

    private C59967q() {
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
                return newMessageInfo(f162073a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C59967q();
            case 4:
                return new C59966p();
            case 5:
                return f162073a;
            case 6:
                C63010eb ebVar = f162074b;
                if (ebVar == null) {
                    synchronized (C59967q.class) {
                        ebVar = f162074b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162073a);
                            f162074b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
