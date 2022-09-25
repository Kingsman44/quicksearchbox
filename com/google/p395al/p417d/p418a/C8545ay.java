package com.google.p395al.p417d.p418a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.d.a.ay */
/* compiled from: PG */
public final class C8545ay extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8545ay f29638a;

    /* renamed from: d */
    private static volatile C63010eb f29639d;

    /* renamed from: b */
    private C62995dn f29640b = C62995dn.f170057a;

    /* renamed from: c */
    private C62995dn f29641c = C62995dn.f170057a;

    static {
        C8545ay ayVar = new C8545ay();
        f29638a = ayVar;
        C62942bv.registerDefaultInstance(C8545ay.class, ayVar);
    }

    private C8545ay() {
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
                return newMessageInfo(f29638a, "\u0001\u0002\u0000\u0000\u0015\u0016\u0002\u0002\u0000\u0000\u00152\u00162", new Object[]{"b", C8543aw.f29636a, C45240c.f118157a, C8544ax.f29637a});
            case 3:
                return new C8545ay();
            case 4:
                return new C8542av();
            case 5:
                return f29638a;
            case 6:
                C63010eb ebVar = f29639d;
                if (ebVar == null) {
                    synchronized (C8545ay.class) {
                        ebVar = f29639d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29638a);
                            f29639d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
