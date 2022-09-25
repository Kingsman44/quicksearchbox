package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.px */
/* compiled from: PG */
public final class C88120px extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C88120px f238222d;

    /* renamed from: e */
    private static volatile C63010eb f238223e;

    /* renamed from: a */
    public int f238224a;

    /* renamed from: b */
    public int f238225b;

    /* renamed from: c */
    public int f238226c;

    static {
        C88120px pxVar = new C88120px();
        f238222d = pxVar;
        C62942bv.registerDefaultInstance(C88120px.class, pxVar);
    }

    private C88120px() {
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
                return newMessageInfo(f238222d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C88118pv.f238221a});
            case 3:
                return new C88120px();
            case 4:
                return new C88117pu();
            case 5:
                return f238222d;
            case 6:
                C63010eb ebVar = f238223e;
                if (ebVar == null) {
                    synchronized (C88120px.class) {
                        ebVar = f238223e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238222d);
                            f238223e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
