package com.google.android.p10712d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.gx */
/* compiled from: PG */
public final class C142480gx extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C142480gx f386654b;

    /* renamed from: c */
    private static volatile C63010eb f386655c;

    /* renamed from: a */
    public int f386656a;

    static {
        C142480gx gxVar = new C142480gx();
        f386654b = gxVar;
        C62942bv.registerDefaultInstance(C142480gx.class, gxVar);
    }

    private C142480gx() {
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
                return newMessageInfo(f386654b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            case 3:
                return new C142480gx();
            case 4:
                return new C142479gw();
            case 5:
                return f386654b;
            case 6:
                C63010eb ebVar = f386655c;
                if (ebVar == null) {
                    synchronized (C142480gx.class) {
                        ebVar = f386655c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386654b);
                            f386655c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
