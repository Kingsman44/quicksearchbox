package com.google.lens.p4708k;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.lens.p4707j.C62493dp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.k.p */
/* compiled from: PG */
public final class C62608p extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62608p f169027e;

    /* renamed from: f */
    private static volatile C63010eb f169028f;

    /* renamed from: a */
    public int f169029a;

    /* renamed from: b */
    public C62493dp f169030b;

    /* renamed from: c */
    public float f169031c = 1.0f;

    /* renamed from: d */
    public float f169032d = 1.0f;

    static {
        C62608p pVar = new C62608p();
        f169027e = pVar;
        C62942bv.registerDefaultInstance(C62608p.class, pVar);
    }

    private C62608p() {
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
                return newMessageInfo(f169027e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ခ\u0001\u0003ခ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C62608p();
            case 4:
                return new C62607o();
            case 5:
                return f169027e;
            case 6:
                C63010eb ebVar = f169028f;
                if (ebVar == null) {
                    synchronized (C62608p.class) {
                        ebVar = f169028f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169027e);
                            f169028f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
