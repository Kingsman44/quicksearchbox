package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8219f.C106555d;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8225l.C106586c;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.k */
/* compiled from: PG */
public final class C106599k extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C106599k f297221e;

    /* renamed from: f */
    private static volatile C63010eb f297222f;

    /* renamed from: a */
    public int f297223a;

    /* renamed from: b */
    public int f297224b = 0;

    /* renamed from: c */
    public Object f297225c;

    /* renamed from: d */
    public long f297226d;

    static {
        C106599k kVar = new C106599k();
        f297221e = kVar;
        C62942bv.registerDefaultInstance(C106599k.class, kVar);
    }

    private C106599k() {
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
                return newMessageInfo(f297221e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C106555d.class, C106586c.class});
            case 3:
                return new C106599k();
            case 4:
                return new C106598j();
            case 5:
                return f297221e;
            case 6:
                C63010eb ebVar = f297222f;
                if (ebVar == null) {
                    synchronized (C106599k.class) {
                        ebVar = f297222f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f297221e);
                            f297222f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
