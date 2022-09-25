package com.google.protos.p4985f.p5036r;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.r.l */
/* compiled from: PG */
public final class C65326l extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C65326l f176660e;

    /* renamed from: f */
    private static volatile C63010eb f176661f;

    /* renamed from: a */
    public int f176662a;

    /* renamed from: b */
    public boolean f176663b;

    /* renamed from: c */
    public boolean f176664c;

    /* renamed from: d */
    public boolean f176665d;

    static {
        C65326l lVar = new C65326l();
        f176660e = lVar;
        C62942bv.registerDefaultInstance(C65326l.class, lVar);
    }

    private C65326l() {
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
                return newMessageInfo(f176660e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C65326l();
            case 4:
                return new C65325k();
            case 5:
                return f176660e;
            case 6:
                C63010eb ebVar = f176661f;
                if (ebVar == null) {
                    synchronized (C65326l.class) {
                        ebVar = f176661f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176660e);
                            f176661f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
