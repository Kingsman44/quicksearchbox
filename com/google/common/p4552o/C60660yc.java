package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.yc */
/* compiled from: PG */
public final class C60660yc extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C60660yc f164559c;

    /* renamed from: d */
    private static volatile C63010eb f164560d;

    /* renamed from: a */
    public int f164561a;

    /* renamed from: b */
    public int f164562b;

    static {
        C60660yc ycVar = new C60660yc();
        f164559c = ycVar;
        C62942bv.registerDefaultInstance(C60660yc.class, ycVar);
    }

    private C60660yc() {
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
                return newMessageInfo(f164559c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C60659yb.f164558a});
            case 3:
                return new C60660yc();
            case 4:
                return new C60658ya();
            case 5:
                return f164559c;
            case 6:
                C63010eb ebVar = f164560d;
                if (ebVar == null) {
                    synchronized (C60660yc.class) {
                        ebVar = f164560d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f164559c);
                            f164560d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
