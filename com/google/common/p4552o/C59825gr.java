package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.gr */
/* compiled from: PG */
public final class C59825gr extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C59825gr f161654e;

    /* renamed from: f */
    private static volatile C63010eb f161655f;

    /* renamed from: a */
    public int f161656a;

    /* renamed from: b */
    public int f161657b;

    /* renamed from: c */
    public int f161658c;

    /* renamed from: d */
    public int f161659d;

    static {
        C59825gr grVar = new C59825gr();
        f161654e = grVar;
        C62942bv.registerDefaultInstance(C59825gr.class, grVar);
    }

    private C59825gr() {
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
                return newMessageInfo(f161654e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", C59819gl.f161651a, C45240c.f118157a, C59821gn.f161652a, "d", C59823gp.f161653a});
            case 3:
                return new C59825gr();
            case 4:
                return new C59818gk();
            case 5:
                return f161654e;
            case 6:
                C63010eb ebVar = f161655f;
                if (ebVar == null) {
                    synchronized (C59825gr.class) {
                        ebVar = f161655f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161654e);
                            f161655f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
