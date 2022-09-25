package com.google.lens.p4707j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.ds */
/* compiled from: PG */
public final class C62496ds extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62496ds f168723e;

    /* renamed from: f */
    private static volatile C63010eb f168724f;

    /* renamed from: a */
    public int f168725a;

    /* renamed from: b */
    public int f168726b;

    /* renamed from: c */
    public boolean f168727c;

    /* renamed from: d */
    public boolean f168728d;

    static {
        C62496ds dsVar = new C62496ds();
        f168723e = dsVar;
        C62942bv.registerDefaultInstance(C62496ds.class, dsVar);
    }

    private C62496ds() {
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
                return newMessageInfo(f168723e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C62495dr.f168722a, C45240c.f118157a, "d"});
            case 3:
                return new C62496ds();
            case 4:
                return new C62494dq();
            case 5:
                return f168723e;
            case 6:
                C63010eb ebVar = f168724f;
                if (ebVar == null) {
                    synchronized (C62496ds.class) {
                        ebVar = f168724f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168723e);
                            f168724f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
