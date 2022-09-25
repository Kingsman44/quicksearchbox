package com.google.android.apps.p489g.p494d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.d.af */
/* compiled from: PG */
public final class C9143af extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C9143af f31561a;

    /* renamed from: e */
    private static volatile C63010eb f31562e;

    /* renamed from: b */
    private int f31563b;

    /* renamed from: c */
    private C9141ad f31564c;

    /* renamed from: d */
    private byte f31565d = 2;

    static {
        C9143af afVar = new C9143af();
        f31561a = afVar;
        C62942bv.registerDefaultInstance(C9143af.class, afVar);
    }

    private C9143af() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f31565d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f31565d = b;
                return null;
            case 2:
                return newMessageInfo(f31561a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004ᐉ\u0003", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C9143af();
            case 4:
                return new C9142ae();
            case 5:
                return f31561a;
            case 6:
                C63010eb ebVar = f31562e;
                if (ebVar == null) {
                    synchronized (C9143af.class) {
                        ebVar = f31562e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31561a);
                            f31562e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
