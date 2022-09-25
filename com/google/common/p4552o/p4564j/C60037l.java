package com.google.common.p4552o.p4564j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.j.l */
/* compiled from: PG */
public final class C60037l extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C60037l f162275c;

    /* renamed from: d */
    private static volatile C63010eb f162276d;

    /* renamed from: a */
    public int f162277a;

    /* renamed from: b */
    public int f162278b;

    static {
        C60037l lVar = new C60037l();
        f162275c = lVar;
        C62942bv.registerDefaultInstance(C60037l.class, lVar);
    }

    private C60037l() {
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
                return newMessageInfo(f162275c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C60037l();
            case 4:
                return new C60036k();
            case 5:
                return f162275c;
            case 6:
                C63010eb ebVar = f162276d;
                if (ebVar == null) {
                    synchronized (C60037l.class) {
                        ebVar = f162276d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162275c);
                            f162276d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
