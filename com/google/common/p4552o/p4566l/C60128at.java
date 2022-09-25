package com.google.common.p4552o.p4566l;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.l.at */
/* compiled from: PG */
public final class C60128at extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C60128at f162623c;

    /* renamed from: d */
    private static volatile C63010eb f162624d;

    /* renamed from: a */
    public int f162625a;

    /* renamed from: b */
    public boolean f162626b;

    static {
        C60128at atVar = new C60128at();
        f162623c = atVar;
        C62942bv.registerDefaultInstance(C60128at.class, atVar);
    }

    private C60128at() {
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
                return newMessageInfo(f162623c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C60128at();
            case 4:
                return new C60127as();
            case 5:
                return f162623c;
            case 6:
                C63010eb ebVar = f162624d;
                if (ebVar == null) {
                    synchronized (C60128at.class) {
                        ebVar = f162624d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162623c);
                            f162624d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
