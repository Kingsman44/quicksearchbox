package com.google.p4152bb.p4153a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.qd */
/* compiled from: PG */
public final class C55378qd extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C55378qd f145922a;

    /* renamed from: d */
    private static volatile C63010eb f145923d;

    /* renamed from: b */
    private C62995dn f145924b = C62995dn.f170057a;

    /* renamed from: c */
    private C62995dn f145925c = C62995dn.f170057a;

    static {
        C55378qd qdVar = new C55378qd();
        f145922a = qdVar;
        C62942bv.registerDefaultInstance(C55378qd.class, qdVar);
    }

    private C55378qd() {
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
                return newMessageInfo(f145922a, "\u0001\u0002\u0000\u0000\u0002\u0003\u0002\u0002\u0000\u0000\u00022\u00032", new Object[]{"b", C55376qb.f145920a, C45240c.f118157a, C55377qc.f145921a});
            case 3:
                return new C55378qd();
            case 4:
                return new C55375qa();
            case 5:
                return f145922a;
            case 6:
                C63010eb ebVar = f145923d;
                if (ebVar == null) {
                    synchronized (C55378qd.class) {
                        ebVar = f145923d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145922a);
                            f145923d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
