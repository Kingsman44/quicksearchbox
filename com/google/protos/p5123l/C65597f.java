package com.google.protos.p5123l;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.l.f */
/* compiled from: PG */
public final class C65597f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65597f f178293a;

    /* renamed from: f */
    private static volatile C63010eb f178294f;

    /* renamed from: b */
    private int f178295b;

    /* renamed from: c */
    private C60220t f178296c;

    /* renamed from: d */
    private C65595d f178297d;

    /* renamed from: e */
    private byte f178298e = 2;

    static {
        C65597f fVar = new C65597f();
        f178293a = fVar;
        C62942bv.registerDefaultInstance(C65597f.class, fVar);
    }

    private C65597f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f178298e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f178298e = b;
                return null;
            case 2:
                return newMessageInfo(f178293a, "\u0001\u0002\u0000\u0001\u0006\u0007\u0002\u0000\u0000\u0002\u0006ᐉ\u0007\u0007ᐉ\b", new Object[]{"b", C45240c.f118157a, "d"});
            case 3:
                return new C65597f();
            case 4:
                return new C65596e();
            case 5:
                return f178293a;
            case 6:
                C63010eb ebVar = f178294f;
                if (ebVar == null) {
                    synchronized (C65597f.class) {
                        ebVar = f178294f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178293a);
                            f178294f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
