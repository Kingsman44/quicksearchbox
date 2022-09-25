package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3067e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.n.c.a.e.d */
/* compiled from: PG */
public final class C39499d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C39499d f104022e;

    /* renamed from: f */
    private static volatile C63010eb f104023f;

    /* renamed from: a */
    public int f104024a;

    /* renamed from: b */
    public boolean f104025b;

    /* renamed from: c */
    public boolean f104026c;

    /* renamed from: d */
    public boolean f104027d;

    static {
        C39499d dVar = new C39499d();
        f104022e = dVar;
        C62942bv.registerDefaultInstance(C39499d.class, dVar);
    }

    private C39499d() {
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
                return newMessageInfo(f104022e, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C39499d();
            case 4:
                return new C39498c();
            case 5:
                return f104022e;
            case 6:
                C63010eb ebVar = f104023f;
                if (ebVar == null) {
                    synchronized (C39499d.class) {
                        ebVar = f104023f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f104022e);
                            f104023f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
