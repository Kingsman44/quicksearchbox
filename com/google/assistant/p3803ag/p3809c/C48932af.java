package com.google.assistant.p3803ag.p3809c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.af */
/* compiled from: PG */
public final class C48932af extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C48932af f126610e;

    /* renamed from: f */
    private static volatile C63010eb f126611f;

    /* renamed from: a */
    public int f126612a = 0;

    /* renamed from: b */
    public Object f126613b;

    /* renamed from: c */
    public int f126614c = 0;

    /* renamed from: d */
    public Object f126615d;

    static {
        C48932af afVar = new C48932af();
        f126610e = afVar;
        C62942bv.registerDefaultInstance(C48932af.class, afVar);
    }

    private C48932af() {
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
                return newMessageInfo(f126610e, "\u0001\u0004\u0002\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001ျ\u0000\u0002်\u0000\u0003ဿ\u0001\u0004ဿ\u0001", new Object[]{"b", "a", "d", C45240c.f118157a, C48931ae.f126609a, C48929ac.f126608a});
            case 3:
                return new C48932af();
            case 4:
                return new C48928ab();
            case 5:
                return f126610e;
            case 6:
                C63010eb ebVar = f126611f;
                if (ebVar == null) {
                    synchronized (C48932af.class) {
                        ebVar = f126611f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126610e);
                            f126611f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
