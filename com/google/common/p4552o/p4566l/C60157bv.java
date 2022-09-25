package com.google.common.p4552o.p4566l;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.l.bv */
/* compiled from: PG */
public final class C60157bv extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C60157bv f162741c;

    /* renamed from: d */
    private static volatile C63010eb f162742d;

    /* renamed from: a */
    public int f162743a;

    /* renamed from: b */
    public int f162744b;

    static {
        C60157bv bvVar = new C60157bv();
        f162741c = bvVar;
        C62942bv.registerDefaultInstance(C60157bv.class, bvVar);
    }

    private C60157bv() {
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
                return newMessageInfo(f162741c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဌ\u0003", new Object[]{"a", "b", C60190da.m92536b()});
            case 3:
                return new C60157bv();
            case 4:
                return new C60156bu();
            case 5:
                return f162741c;
            case 6:
                C63010eb ebVar = f162742d;
                if (ebVar == null) {
                    synchronized (C60157bv.class) {
                        ebVar = f162742d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162741c);
                            f162742d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
