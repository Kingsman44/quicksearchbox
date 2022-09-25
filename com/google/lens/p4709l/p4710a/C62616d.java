package com.google.lens.p4709l.p4710a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.lens.p4701g.C62250a;
import com.google.lens.p4701g.C62331d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.l.a.d */
/* compiled from: PG */
public final class C62616d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62616d f169059e;

    /* renamed from: f */
    private static volatile C63010eb f169060f;

    /* renamed from: a */
    public int f169061a;

    /* renamed from: b */
    public int f169062b;

    /* renamed from: c */
    public int f169063c;

    /* renamed from: d */
    public int f169064d;

    static {
        C62616d dVar = new C62616d();
        f169059e = dVar;
        C62942bv.registerDefaultInstance(C62616d.class, dVar);
    }

    private C62616d() {
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
                return newMessageInfo(f169059e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", C62614b.m94807b(), C45240c.f118157a, C62331d.m94768b(), "d", C62250a.f168059a});
            case 3:
                return new C62616d();
            case 4:
                return new C62615c();
            case 5:
                return f169059e;
            case 6:
                C63010eb ebVar = f169060f;
                if (ebVar == null) {
                    synchronized (C62616d.class) {
                        ebVar = f169060f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169059e);
                            f169060f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
