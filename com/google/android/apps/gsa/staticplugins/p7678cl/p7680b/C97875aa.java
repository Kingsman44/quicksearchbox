package com.google.android.apps.gsa.staticplugins.p7678cl.p7680b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.cl.b.aa */
/* compiled from: PG */
public final class C97875aa extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C97875aa f273287b;

    /* renamed from: d */
    private static volatile C63010eb f273288d;

    /* renamed from: a */
    public int f273289a = 0;

    /* renamed from: c */
    private Object f273290c;

    static {
        C97875aa aaVar = new C97875aa();
        f273287b = aaVar;
        C62942bv.registerDefaultInstance(C97875aa.class, aaVar);
    }

    private C97875aa() {
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
                return newMessageInfo(f273287b, "\u0001\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000", new Object[]{C45240c.f118157a, "a", C97931u.class, C97879ae.class, C97933w.class, C97935y.class, C97877ac.class});
            case 3:
                return new C97875aa();
            case 4:
                return new C97936z();
            case 5:
                return f273287b;
            case 6:
                C63010eb ebVar = f273288d;
                if (ebVar == null) {
                    synchronized (C97875aa.class) {
                        ebVar = f273288d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f273287b);
                            f273288d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
