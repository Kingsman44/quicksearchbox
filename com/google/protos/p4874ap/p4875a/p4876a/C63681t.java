package com.google.protos.p4874ap.p4875a.p4876a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.protos.ap.a.a.t */
/* compiled from: PG */
public final class C63681t extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C63681t f172185d;

    /* renamed from: e */
    private static volatile C63010eb f172186e;

    /* renamed from: a */
    public int f172187a;

    /* renamed from: b */
    public int f172188b;

    /* renamed from: c */
    public C63678q f172189c;

    static {
        C63681t tVar = new C63681t();
        f172185d = tVar;
        C62942bv.registerDefaultInstance(C63681t.class, tVar);
    }

    private C63681t() {
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
                return newMessageInfo(f172185d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C65753ak.m96798c(), C45240c.f118157a});
            case 3:
                return new C63681t();
            case 4:
                return new C63680s();
            case 5:
                return f172185d;
            case 6:
                C63010eb ebVar = f172186e;
                if (ebVar == null) {
                    synchronized (C63681t.class) {
                        ebVar = f172186e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172185d);
                            f172186e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
