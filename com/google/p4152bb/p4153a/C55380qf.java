package com.google.p4152bb.p4153a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.qf */
/* compiled from: PG */
public final class C55380qf extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C55380qf f145926a;

    /* renamed from: g */
    private static volatile C63010eb f145927g;

    /* renamed from: b */
    private int f145928b;

    /* renamed from: c */
    private C55378qd f145929c;

    /* renamed from: d */
    private C55388qn f145930d;

    /* renamed from: e */
    private C55384qj f145931e;

    /* renamed from: f */
    private byte f145932f = 2;

    static {
        C55380qf qfVar = new C55380qf();
        f145926a = qfVar;
        C62942bv.registerDefaultInstance(C55380qf.class, qfVar);
    }

    private C55380qf() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145932f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145932f = b;
                return null;
            case 2:
                return newMessageInfo(f145926a, "\u0001\u0003\u0000\u0001\u0003\t\u0003\u0000\u0000\u0000\u0003ဉ\u0002\u0004ဉ\u0003\tဉ\b", new Object[]{"b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C55380qf();
            case 4:
                return new C55379qe();
            case 5:
                return f145926a;
            case 6:
                C63010eb ebVar = f145927g;
                if (ebVar == null) {
                    synchronized (C55380qf.class) {
                        ebVar = f145927g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145926a);
                            f145927g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
