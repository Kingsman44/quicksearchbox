package com.google.common.p4552o.p4570p;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.p.an */
/* compiled from: PG */
public final class C60358an extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C60358an f163360d;

    /* renamed from: e */
    private static volatile C63010eb f163361e;

    /* renamed from: a */
    public int f163362a;

    /* renamed from: b */
    public boolean f163363b;

    /* renamed from: c */
    public int f163364c;

    static {
        C60358an anVar = new C60358an();
        f163360d = anVar;
        C62942bv.registerDefaultInstance(C60358an.class, anVar);
    }

    private C60358an() {
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
                return newMessageInfo(f163360d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C60356al.f163359a});
            case 3:
                return new C60358an();
            case 4:
                return new C60355ak();
            case 5:
                return f163360d;
            case 6:
                C63010eb ebVar = f163361e;
                if (ebVar == null) {
                    synchronized (C60358an.class) {
                        ebVar = f163361e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163360d);
                            f163361e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
