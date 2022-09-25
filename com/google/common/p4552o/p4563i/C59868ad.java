package com.google.common.p4552o.p4563i;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4963bf.p4964a.p4965a.C64594bp;

/* renamed from: com.google.common.o.i.ad */
/* compiled from: PG */
public final class C59868ad extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C59868ad f161796c;

    /* renamed from: d */
    private static volatile C63010eb f161797d;

    /* renamed from: a */
    public int f161798a;

    /* renamed from: b */
    public int f161799b;

    static {
        C59868ad adVar = new C59868ad();
        f161796c = adVar;
        C62942bv.registerDefaultInstance(C59868ad.class, adVar);
    }

    private C59868ad() {
        emptyIntList();
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
                return newMessageInfo(f161796c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဌ\u0000", new Object[]{"a", "b", C64594bp.f175134a});
            case 3:
                return new C59868ad();
            case 4:
                return new C59867ac();
            case 5:
                return f161796c;
            case 6:
                C63010eb ebVar = f161797d;
                if (ebVar == null) {
                    synchronized (C59868ad.class) {
                        ebVar = f161797d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161796c);
                            f161797d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
