package com.google.android.libraries.logging.p2185ve.p2201h;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.logging.ve.h.k */
/* compiled from: PG */
public final class C28438k extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C28438k f77209d;

    /* renamed from: f */
    private static volatile C63010eb f77210f;

    /* renamed from: a */
    public int f77211a;

    /* renamed from: b */
    public int f77212b = 250;

    /* renamed from: c */
    public C28429b f77213c;

    /* renamed from: e */
    private int f77214e;

    static {
        C28438k kVar = new C28438k();
        f77209d = kVar;
        C62942bv.registerDefaultInstance(C28438k.class, kVar);
    }

    private C28438k() {
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
                return newMessageInfo(f77209d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003ဉ\u0002", new Object[]{"e", "a", C28436i.f77208a, "b", C45240c.f118157a});
            case 3:
                return new C28438k();
            case 4:
                return new C28435h();
            case 5:
                return f77209d;
            case 6:
                C63010eb ebVar = f77210f;
                if (ebVar == null) {
                    synchronized (C28438k.class) {
                        ebVar = f77210f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f77209d);
                            f77210f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
