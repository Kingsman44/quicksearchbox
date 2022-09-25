package com.google.common.p4552o.p4563i;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56306df;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.i.k */
/* compiled from: PG */
public final class C59961k extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C59961k f162053f;

    /* renamed from: g */
    private static volatile C63010eb f162054g;

    /* renamed from: a */
    public int f162055a;

    /* renamed from: b */
    public int f162056b = 0;

    /* renamed from: c */
    public Object f162057c;

    /* renamed from: d */
    public int f162058d;

    /* renamed from: e */
    public int f162059e;

    static {
        C59961k kVar = new C59961k();
        f162053f = kVar;
        C62942bv.registerDefaultInstance(C59961k.class, kVar);
    }

    private C59961k() {
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
                return newMessageInfo(f162053f, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ဌ\u0004", new Object[]{C45240c.f118157a, "b", "a", "d", C56306df.m87965b(), C59960j.class, C59956f.class, C59958h.class, "e", C59945d.f162010a});
            case 3:
                return new C59961k();
            case 4:
                return new C59918c();
            case 5:
                return f162053f;
            case 6:
                C63010eb ebVar = f162054g;
                if (ebVar == null) {
                    synchronized (C59961k.class) {
                        ebVar = f162054g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162053f);
                            f162054g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
