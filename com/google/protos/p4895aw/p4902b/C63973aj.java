package com.google.protos.p4895aw.p4902b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.protos.aw.b.aj */
/* compiled from: PG */
public final class C63973aj extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C63973aj f173010d;

    /* renamed from: e */
    private static volatile C63010eb f173011e;

    /* renamed from: a */
    public int f173012a;

    /* renamed from: b */
    public C63088z f173013b = C63088z.f170246b;

    /* renamed from: c */
    public C63088z f173014c = C63088z.f170246b;

    static {
        C63973aj ajVar = new C63973aj();
        f173010d = ajVar;
        C62942bv.registerDefaultInstance(C63973aj.class, ajVar);
    }

    private C63973aj() {
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
                return newMessageInfo(f173010d, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ည\u0002\u0004ည\u0003", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C63973aj();
            case 4:
                return new C63972ai();
            case 5:
                return f173010d;
            case 6:
                C63010eb ebVar = f173011e;
                if (ebVar == null) {
                    synchronized (C63973aj.class) {
                        ebVar = f173011e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173010d);
                            f173011e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
