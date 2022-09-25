package com.google.lens.p4707j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.gk */
/* compiled from: PG */
public final class C62569gk extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62569gk f168922e;

    /* renamed from: f */
    private static volatile C63010eb f168923f;

    /* renamed from: a */
    public int f168924a;

    /* renamed from: b */
    public int f168925b;

    /* renamed from: c */
    public C62571gm f168926c;

    /* renamed from: d */
    public C62567gi f168927d;

    static {
        C62569gk gkVar = new C62569gk();
        f168922e = gkVar;
        C62942bv.registerDefaultInstance(C62569gk.class, gkVar);
    }

    private C62569gk() {
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
                return newMessageInfo(f168922e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C62541fj.f168853a, C45240c.f118157a, "d"});
            case 3:
                return new C62569gk();
            case 4:
                return new C62568gj();
            case 5:
                return f168922e;
            case 6:
                C63010eb ebVar = f168923f;
                if (ebVar == null) {
                    synchronized (C62569gk.class) {
                        ebVar = f168923f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168922e);
                            f168923f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
