package com.google.p4152bb.p4153a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.iq */
/* compiled from: PG */
public final class C55175iq extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C55175iq f145251b;

    /* renamed from: d */
    private static volatile C63010eb f145252d;

    /* renamed from: a */
    public boolean f145253a;

    /* renamed from: c */
    private int f145254c;

    static {
        C55175iq iqVar = new C55175iq();
        f145251b = iqVar;
        C62942bv.registerDefaultInstance(C55175iq.class, iqVar);
    }

    private C55175iq() {
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
                return newMessageInfo(f145251b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C55175iq();
            case 4:
                return new C55174ip();
            case 5:
                return f145251b;
            case 6:
                C63010eb ebVar = f145252d;
                if (ebVar == null) {
                    synchronized (C55175iq.class) {
                        ebVar = f145252d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145251b);
                            f145252d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
