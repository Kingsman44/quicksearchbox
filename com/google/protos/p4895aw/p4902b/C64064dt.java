package com.google.protos.p4895aw.p4902b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.b.dt */
/* compiled from: PG */
public final class C64064dt extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C64064dt f173207e;

    /* renamed from: f */
    private static volatile C63010eb f173208f;

    /* renamed from: a */
    public int f173209a;

    /* renamed from: b */
    public int f173210b;

    /* renamed from: c */
    public long f173211c;

    /* renamed from: d */
    public long f173212d;

    static {
        C64064dt dtVar = new C64064dt();
        f173207e = dtVar;
        C62942bv.registerDefaultInstance(C64064dt.class, dtVar);
    }

    private C64064dt() {
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
                return newMessageInfo(f173207e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C64064dt();
            case 4:
                return new C64063ds();
            case 5:
                return f173207e;
            case 6:
                C63010eb ebVar = f173208f;
                if (ebVar == null) {
                    synchronized (C64064dt.class) {
                        ebVar = f173208f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173207e);
                            f173208f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
