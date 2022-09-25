package com.google.protos.p4895aw.p4902b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.b.eo */
/* compiled from: PG */
public final class C64086eo extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C64086eo f173252d;

    /* renamed from: f */
    private static volatile C63010eb f173253f;

    /* renamed from: a */
    public int f173254a = 0;

    /* renamed from: b */
    public Object f173255b;

    /* renamed from: c */
    public int f173256c;

    /* renamed from: e */
    private int f173257e;

    static {
        C64086eo eoVar = new C64086eo();
        f173252d = eoVar;
        C62942bv.registerDefaultInstance(C64086eo.class, eoVar);
    }

    private C64086eo() {
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
                return newMessageInfo(f173252d, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ြ\u0000", new Object[]{"b", "a", "e", C45240c.f118157a, C64085en.m96349b(), C63975al.class});
            case 3:
                return new C64086eo();
            case 4:
                return new C64083el();
            case 5:
                return f173252d;
            case 6:
                C63010eb ebVar = f173253f;
                if (ebVar == null) {
                    synchronized (C64086eo.class) {
                        ebVar = f173253f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173252d);
                            f173253f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
