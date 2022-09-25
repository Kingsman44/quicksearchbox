package com.google.android.libraries.search.p3055n;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.n.bf */
/* compiled from: PG */
public final class C39357bf extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C39357bf f103644d;

    /* renamed from: e */
    private static volatile C63010eb f103645e;

    /* renamed from: a */
    public int f103646a;

    /* renamed from: b */
    public int f103647b;

    /* renamed from: c */
    public C39677db f103648c;

    static {
        C39357bf bfVar = new C39357bf();
        f103644d = bfVar;
        C62942bv.registerDefaultInstance(C39357bf.class, bfVar);
    }

    private C39357bf() {
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
                return newMessageInfo(f103644d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C39356be.m68762b(), C45240c.f118157a});
            case 3:
                return new C39357bf();
            case 4:
                return new C39354bc();
            case 5:
                return f103644d;
            case 6:
                C63010eb ebVar = f103645e;
                if (ebVar == null) {
                    synchronized (C39357bf.class) {
                        ebVar = f103645e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f103644d);
                            f103645e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
