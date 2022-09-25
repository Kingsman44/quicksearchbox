package com.google.lens.p4707j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.au */
/* compiled from: PG */
public final class C62417au extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62417au f168485e;

    /* renamed from: f */
    private static volatile C63010eb f168486f;

    /* renamed from: a */
    public int f168487a;

    /* renamed from: b */
    public int f168488b = 0;

    /* renamed from: c */
    public Object f168489c;

    /* renamed from: d */
    public int f168490d;

    static {
        C62417au auVar = new C62417au();
        f168485e = auVar;
        C62942bv.registerDefaultInstance(C62417au.class, auVar);
    }

    private C62417au() {
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
                return newMessageInfo(f168485e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002်\u0000\u0003ဿ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C62428be.f168520a, C62564gf.f168917a});
            case 3:
                return new C62417au();
            case 4:
                return new C62416at();
            case 5:
                return f168485e;
            case 6:
                C63010eb ebVar = f168486f;
                if (ebVar == null) {
                    synchronized (C62417au.class) {
                        ebVar = f168486f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168485e);
                            f168486f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
