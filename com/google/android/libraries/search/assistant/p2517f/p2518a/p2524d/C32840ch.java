package com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.f.a.d.ch */
/* compiled from: PG */
public final class C32840ch extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C32840ch f88047e;

    /* renamed from: f */
    private static volatile C63010eb f88048f;

    /* renamed from: a */
    public int f88049a;

    /* renamed from: b */
    public C32858d f88050b;

    /* renamed from: c */
    public C32805b f88051c;

    /* renamed from: d */
    public long f88052d;

    static {
        C32840ch chVar = new C32840ch();
        f88047e = chVar;
        C62942bv.registerDefaultInstance(C32840ch.class, chVar);
    }

    private C32840ch() {
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
                return newMessageInfo(f88047e, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002ဉ\u0000\u0003\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C32840ch();
            case 4:
                return new C32839cg();
            case 5:
                return f88047e;
            case 6:
                C63010eb ebVar = f88048f;
                if (ebVar == null) {
                    synchronized (C32840ch.class) {
                        ebVar = f88048f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f88047e);
                            f88048f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
