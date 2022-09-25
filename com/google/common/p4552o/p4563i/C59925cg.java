package com.google.common.p4552o.p4563i;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.i.cg */
/* compiled from: PG */
public final class C59925cg extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C59925cg f161965c;

    /* renamed from: d */
    private static volatile C63010eb f161966d;

    /* renamed from: a */
    public int f161967a;

    /* renamed from: b */
    public int f161968b;

    static {
        C59925cg cgVar = new C59925cg();
        f161965c = cgVar;
        C62942bv.registerDefaultInstance(C59925cg.class, cgVar);
    }

    private C59925cg() {
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
                return newMessageInfo(f161965c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C59924cf.f161964a});
            case 3:
                return new C59925cg();
            case 4:
                return new C59923ce();
            case 5:
                return f161965c;
            case 6:
                C63010eb ebVar = f161966d;
                if (ebVar == null) {
                    synchronized (C59925cg.class) {
                        ebVar = f161966d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161965c);
                            f161966d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
