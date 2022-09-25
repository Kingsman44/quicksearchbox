package com.google.common.p4552o.p4553a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.a.cm */
/* compiled from: PG */
public final class C59516cm extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C59516cm f157913c;

    /* renamed from: d */
    private static volatile C63010eb f157914d;

    /* renamed from: a */
    public int f157915a;

    /* renamed from: b */
    public double f157916b;

    static {
        C59516cm cmVar = new C59516cm();
        f157913c = cmVar;
        C62942bv.registerDefaultInstance(C59516cm.class, cmVar);
    }

    private C59516cm() {
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
                return newMessageInfo(f157913c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001က\u0000", new Object[]{"a", "b"});
            case 3:
                return new C59516cm();
            case 4:
                return new C59515cl();
            case 5:
                return f157913c;
            case 6:
                C63010eb ebVar = f157914d;
                if (ebVar == null) {
                    synchronized (C59516cm.class) {
                        ebVar = f157914d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f157913c);
                            f157914d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
