package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8224k;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.k.b */
/* compiled from: PG */
public final class C106575b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C106575b f297162e;

    /* renamed from: f */
    private static volatile C63010eb f297163f;

    /* renamed from: a */
    public int f297164a;

    /* renamed from: b */
    public boolean f297165b;

    /* renamed from: c */
    public boolean f297166c;

    /* renamed from: d */
    public boolean f297167d;

    static {
        C106575b bVar = new C106575b();
        f297162e = bVar;
        C62942bv.registerDefaultInstance(C106575b.class, bVar);
    }

    private C106575b() {
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
                return newMessageInfo(f297162e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C106575b();
            case 4:
                return new C106574a();
            case 5:
                return f297162e;
            case 6:
                C63010eb ebVar = f297163f;
                if (ebVar == null) {
                    synchronized (C106575b.class) {
                        ebVar = f297163f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f297162e);
                            f297163f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
