package com.google.protos.p5127o.p5128a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4152bb.p4153a.C55089fl;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.o.a.l */
/* compiled from: PG */
public final class C65631l extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C65631l f178346e;

    /* renamed from: f */
    private static volatile C63010eb f178347f;

    /* renamed from: a */
    public int f178348a;

    /* renamed from: b */
    public int f178349b;

    /* renamed from: c */
    public C55089fl f178350c;

    /* renamed from: d */
    public boolean f178351d;

    static {
        C65631l lVar = new C65631l();
        f178346e = lVar;
        C62942bv.registerDefaultInstance(C65631l.class, lVar);
    }

    private C65631l() {
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
                return newMessageInfo(f178346e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C65631l();
            case 4:
                return new C65630k();
            case 5:
                return f178346e;
            case 6:
                C63010eb ebVar = f178347f;
                if (ebVar == null) {
                    synchronized (C65631l.class) {
                        ebVar = f178347f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178346e);
                            f178347f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
