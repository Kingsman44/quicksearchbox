package com.google.common.p4552o.p4566l;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.l.bx */
/* compiled from: PG */
public final class C60159bx extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C60159bx f162745c;

    /* renamed from: d */
    private static volatile C63010eb f162746d;

    /* renamed from: a */
    public int f162747a;

    /* renamed from: b */
    public C60161bz f162748b;

    static {
        C60159bx bxVar = new C60159bx();
        f162745c = bxVar;
        C62942bv.registerDefaultInstance(C60159bx.class, bxVar);
    }

    private C60159bx() {
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
                return newMessageInfo(f162745c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C60159bx();
            case 4:
                return new C60158bw();
            case 5:
                return f162745c;
            case 6:
                C63010eb ebVar = f162746d;
                if (ebVar == null) {
                    synchronized (C60159bx.class) {
                        ebVar = f162746d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162745c);
                            f162746d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
