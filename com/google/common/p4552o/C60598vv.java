package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.vv */
/* compiled from: PG */
public final class C60598vv extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C60598vv f164388a;

    /* renamed from: e */
    private static volatile C63010eb f164389e;

    /* renamed from: b */
    private int f164390b;

    /* renamed from: c */
    private C60220t f164391c;

    /* renamed from: d */
    private byte f164392d = 2;

    static {
        C60598vv vvVar = new C60598vv();
        f164388a = vvVar;
        C62942bv.registerDefaultInstance(C60598vv.class, vvVar);
    }

    private C60598vv() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f164392d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f164392d = b;
                return null;
            case 2:
                return newMessageInfo(f164388a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᐉ\u0002", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C60598vv();
            case 4:
                return new C60597vu();
            case 5:
                return f164388a;
            case 6:
                C63010eb ebVar = f164389e;
                if (ebVar == null) {
                    synchronized (C60598vv.class) {
                        ebVar = f164389e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f164388a);
                            f164389e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
