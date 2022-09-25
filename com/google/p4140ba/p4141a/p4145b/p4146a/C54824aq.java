package com.google.p4140ba.p4141a.p4145b.p4146a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.b.a.aq */
/* compiled from: PG */
public final class C54824aq extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C54824aq f143861a;

    /* renamed from: b */
    private static volatile C63010eb f143862b;

    static {
        C54824aq aqVar = new C54824aq();
        f143861a = aqVar;
        C62942bv.registerDefaultInstance(C54824aq.class, aqVar);
    }

    private C54824aq() {
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
                return newMessageInfo(f143861a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C54824aq();
            case 4:
                return new C54823ap();
            case 5:
                return f143861a;
            case 6:
                C63010eb ebVar = f143862b;
                if (ebVar == null) {
                    synchronized (C54824aq.class) {
                        ebVar = f143862b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143861a);
                            f143862b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
