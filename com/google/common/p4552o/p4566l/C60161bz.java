package com.google.common.p4552o.p4566l;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.l.bz */
/* compiled from: PG */
public final class C60161bz extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C60161bz f162749c;

    /* renamed from: d */
    private static volatile C63010eb f162750d;

    /* renamed from: a */
    public int f162751a = 0;

    /* renamed from: b */
    public Object f162752b;

    static {
        C60161bz bzVar = new C60161bz();
        f162749c = bzVar;
        C62942bv.registerDefaultInstance(C60161bz.class, bzVar);
    }

    private C60161bz() {
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
                return newMessageInfo(f162749c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", C60164cb.class, C60172cj.class});
            case 3:
                return new C60161bz();
            case 4:
                return new C60160by();
            case 5:
                return f162749c;
            case 6:
                C63010eb ebVar = f162750d;
                if (ebVar == null) {
                    synchronized (C60161bz.class) {
                        ebVar = f162750d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162749c);
                            f162750d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
