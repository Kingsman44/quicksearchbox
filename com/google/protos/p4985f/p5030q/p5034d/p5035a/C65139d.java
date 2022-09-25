package com.google.protos.p4985f.p5030q.p5034d.p5035a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.d.a.d */
/* compiled from: PG */
public final class C65139d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C65139d f176307e;

    /* renamed from: f */
    private static volatile C63010eb f176308f;

    /* renamed from: a */
    public int f176309a;

    /* renamed from: b */
    public long f176310b;

    /* renamed from: c */
    public int f176311c;

    /* renamed from: d */
    public int f176312d;

    static {
        C65139d dVar = new C65139d();
        f176307e = dVar;
        C62942bv.registerDefaultInstance(C65139d.class, dVar);
    }

    private C65139d() {
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
                return newMessageInfo(f176307e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဆ\u0001\u0003ဆ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C65139d();
            case 4:
                return new C65138c();
            case 5:
                return f176307e;
            case 6:
                C63010eb ebVar = f176308f;
                if (ebVar == null) {
                    synchronized (C65139d.class) {
                        ebVar = f176308f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176307e);
                            f176308f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
