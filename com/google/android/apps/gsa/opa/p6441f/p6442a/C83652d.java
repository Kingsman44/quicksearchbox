package com.google.android.apps.gsa.opa.p6441f.p6442a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.amo;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opa.f.a.d */
/* compiled from: PG */
public final class C83652d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C83652d f228026e;

    /* renamed from: f */
    private static volatile C63010eb f228027f;

    /* renamed from: a */
    public int f228028a;

    /* renamed from: b */
    public long f228029b;

    /* renamed from: c */
    public int f228030c;

    /* renamed from: d */
    public C83651c f228031d;

    static {
        C83652d dVar = new C83652d();
        f228026e = dVar;
        C62942bv.registerDefaultInstance(C83652d.class, dVar);
    }

    private C83652d() {
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
                return newMessageInfo(f228026e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, amo.m92436b(), "d"});
            case 3:
                return new C83652d();
            case 4:
                return new C83611a();
            case 5:
                return f228026e;
            case 6:
                C63010eb ebVar = f228027f;
                if (ebVar == null) {
                    synchronized (C83652d.class) {
                        ebVar = f228027f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228026e);
                            f228027f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
