package com.google.p381aj.p382a.p383a.p384a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.aj.a.a.a.l */
/* compiled from: PG */
public final class C8232l extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8232l f28897a;

    /* renamed from: e */
    private static volatile C63010eb f28898e;

    /* renamed from: b */
    private int f28899b;

    /* renamed from: c */
    private double f28900c;

    /* renamed from: d */
    private byte f28901d = 2;

    static {
        C8232l lVar = new C8232l();
        f28897a = lVar;
        C62942bv.registerDefaultInstance(C8232l.class, lVar);
    }

    private C8232l() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28901d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28901d = b;
                return null;
            case 2:
                return newMessageInfo(f28897a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔀ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C8232l();
            case 4:
                return new C8231k();
            case 5:
                return f28897a;
            case 6:
                C63010eb ebVar = f28898e;
                if (ebVar == null) {
                    synchronized (C8232l.class) {
                        ebVar = f28898e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28897a);
                            f28898e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
