package com.google.protos.p5129p.p5131b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.p.b.bv */
/* compiled from: PG */
public final class C65791bv extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65791bv f178840b;

    /* renamed from: d */
    private static volatile C63010eb f178841d;

    /* renamed from: a */
    public boolean f178842a;

    /* renamed from: c */
    private int f178843c;

    static {
        C65791bv bvVar = new C65791bv();
        f178840b = bvVar;
        C62942bv.registerDefaultInstance(C65791bv.class, bvVar);
    }

    private C65791bv() {
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
                return newMessageInfo(f178840b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C65791bv();
            case 4:
                return new C65790bu();
            case 5:
                return f178840b;
            case 6:
                C63010eb ebVar = f178841d;
                if (ebVar == null) {
                    synchronized (C65791bv.class) {
                        ebVar = f178841d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178840b);
                            f178841d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
