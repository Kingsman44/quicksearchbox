package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.ams */
/* compiled from: PG */
public final class ams extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final ams f159243c;

    /* renamed from: d */
    private static volatile C63010eb f159244d;

    /* renamed from: a */
    public int f159245a;

    /* renamed from: b */
    public int f159246b;

    static {
        ams ams = new ams();
        f159243c = ams;
        C62942bv.registerDefaultInstance(ams.class, ams);
    }

    private ams() {
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
                return newMessageInfo(f159243c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new ams();
            case 4:
                return new amr();
            case 5:
                return f159243c;
            case 6:
                C63010eb ebVar = f159244d;
                if (ebVar == null) {
                    synchronized (ams.class) {
                        ebVar = f159244d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159243c);
                            f159244d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
