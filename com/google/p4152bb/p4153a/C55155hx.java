package com.google.p4152bb.p4153a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.hx */
/* compiled from: PG */
public final class C55155hx extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C55155hx f145193b;

    /* renamed from: d */
    private static volatile C63010eb f145194d;

    /* renamed from: a */
    public int f145195a;

    /* renamed from: c */
    private int f145196c;

    static {
        C55155hx hxVar = new C55155hx();
        f145193b = hxVar;
        C62942bv.registerDefaultInstance(C55155hx.class, hxVar);
    }

    private C55155hx() {
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
                return newMessageInfo(f145193b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C55166ih.f145240a});
            case 3:
                return new C55155hx();
            case 4:
                return new C55154hw();
            case 5:
                return f145193b;
            case 6:
                C63010eb ebVar = f145194d;
                if (ebVar == null) {
                    synchronized (C55155hx.class) {
                        ebVar = f145194d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145193b);
                            f145194d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
