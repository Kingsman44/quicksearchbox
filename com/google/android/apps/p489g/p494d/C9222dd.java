package com.google.android.apps.p489g.p494d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.d.dd */
/* compiled from: PG */
public final class C9222dd extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C9222dd f31875c;

    /* renamed from: d */
    private static volatile C63010eb f31876d;

    /* renamed from: a */
    public int f31877a = 0;

    /* renamed from: b */
    public Object f31878b;

    static {
        C9222dd ddVar = new C9222dd();
        f31875c = ddVar;
        C62942bv.registerDefaultInstance(C9222dd.class, ddVar);
    }

    private C9222dd() {
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
                return newMessageInfo(f31875c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ြ\u0000", new Object[]{"b", "a", C9221dc.class});
            case 3:
                return new C9222dd();
            case 4:
                return new C9219da();
            case 5:
                return f31875c;
            case 6:
                C63010eb ebVar = f31876d;
                if (ebVar == null) {
                    synchronized (C9222dd.class) {
                        ebVar = f31876d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31875c);
                            f31876d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
