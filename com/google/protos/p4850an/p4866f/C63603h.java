package com.google.protos.p4850an.p4866f;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.f.h */
/* compiled from: PG */
public final class C63603h extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C63603h f172030e;

    /* renamed from: f */
    private static volatile C63010eb f172031f;

    /* renamed from: a */
    public int f172032a;

    /* renamed from: b */
    public int f172033b = 0;

    /* renamed from: c */
    public Object f172034c;

    /* renamed from: d */
    public boolean f172035d;

    static {
        C63603h hVar = new C63603h();
        f172030e = hVar;
        C62942bv.registerDefaultInstance(C63603h.class, hVar);
    }

    private C63603h() {
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
                return newMessageInfo(f172030e, "\u0001\u0004\u0001\u0001\u0001\t\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0005ြ\u0000\u0006ြ\u0000\tြ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C63602g.class, C63600e.class, C63597b.class});
            case 3:
                return new C63603h();
            case 4:
                return new C63598c();
            case 5:
                return f172030e;
            case 6:
                C63010eb ebVar = f172031f;
                if (ebVar == null) {
                    synchronized (C63603h.class) {
                        ebVar = f172031f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172030e);
                            f172031f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
