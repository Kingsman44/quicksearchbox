package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8219f;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.f.d */
/* compiled from: PG */
public final class C106555d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C106555d f297129b;

    /* renamed from: d */
    private static volatile C63010eb f297130d;

    /* renamed from: a */
    public int f297131a;

    /* renamed from: c */
    private int f297132c;

    static {
        C106555d dVar = new C106555d();
        f297129b = dVar;
        C62942bv.registerDefaultInstance(C106555d.class, dVar);
    }

    private C106555d() {
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
                return newMessageInfo(f297129b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C106553b.f297128a});
            case 3:
                return new C106555d();
            case 4:
                return new C106552a();
            case 5:
                return f297129b;
            case 6:
                C63010eb ebVar = f297130d;
                if (ebVar == null) {
                    synchronized (C106555d.class) {
                        ebVar = f297130d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f297129b);
                            f297130d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
