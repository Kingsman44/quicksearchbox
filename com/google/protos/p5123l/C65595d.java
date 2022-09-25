package com.google.protos.p5123l;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.l.d */
/* compiled from: PG */
public final class C65595d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65595d f178288a;

    /* renamed from: e */
    private static volatile C63010eb f178289e;

    /* renamed from: b */
    private int f178290b;

    /* renamed from: c */
    private C60220t f178291c;

    /* renamed from: d */
    private byte f178292d = 2;

    static {
        C65595d dVar = new C65595d();
        f178288a = dVar;
        C62942bv.registerDefaultInstance(C65595d.class, dVar);
    }

    private C65595d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f178292d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f178292d = b;
                return null;
            case 2:
                return newMessageInfo(f178288a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C65595d();
            case 4:
                return new C65594c();
            case 5:
                return f178288a;
            case 6:
                C63010eb ebVar = f178289e;
                if (ebVar == null) {
                    synchronized (C65595d.class) {
                        ebVar = f178289e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178288a);
                            f178289e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
