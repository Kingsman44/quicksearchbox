package com.google.p4152bb.p4153a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.bb.a.qp */
/* compiled from: PG */
public final class C55390qp extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C55390qp f145945a;

    /* renamed from: e */
    private static volatile C63010eb f145946e;

    /* renamed from: b */
    private int f145947b;

    /* renamed from: c */
    private C55380qf f145948c;

    /* renamed from: d */
    private byte f145949d = 2;

    static {
        C55390qp qpVar = new C55390qp();
        f145945a = qpVar;
        C62942bv.registerDefaultInstance(C55390qp.class, qpVar);
    }

    private C55390qp() {
        C63088z zVar = C63088z.f170246b;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145949d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145949d = b;
                return null;
            case 2:
                return newMessageInfo(f145945a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C55390qp();
            case 4:
                return new C55389qo();
            case 5:
                return f145945a;
            case 6:
                C63010eb ebVar = f145946e;
                if (ebVar == null) {
                    synchronized (C55390qp.class) {
                        ebVar = f145946e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145945a);
                            f145946e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
