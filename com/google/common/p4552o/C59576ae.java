package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.ae */
/* compiled from: PG */
public final class C59576ae extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C59576ae f158430c;

    /* renamed from: d */
    private static volatile C63010eb f158431d;

    /* renamed from: a */
    public int f158432a;

    /* renamed from: b */
    public int f158433b;

    static {
        C59576ae aeVar = new C59576ae();
        f158430c = aeVar;
        C62942bv.registerDefaultInstance(C59576ae.class, aeVar);
    }

    private C59576ae() {
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
                return newMessageInfo(f158430c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C59576ae();
            case 4:
                return new C59574ad();
            case 5:
                return f158430c;
            case 6:
                C63010eb ebVar = f158431d;
                if (ebVar == null) {
                    synchronized (C59576ae.class) {
                        ebVar = f158431d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158430c);
                            f158431d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
