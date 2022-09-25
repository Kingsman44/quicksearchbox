package com.google.speech.p5218j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.t */
/* compiled from: PG */
public final class C67175t extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C67175t f182588e;

    /* renamed from: f */
    private static volatile C63010eb f182589f;

    /* renamed from: a */
    public int f182590a;

    /* renamed from: b */
    public int f182591b = 1;

    /* renamed from: c */
    public int f182592c;

    /* renamed from: d */
    public int f182593d;

    static {
        C67175t tVar = new C67175t();
        f182588e = tVar;
        C62942bv.registerDefaultInstance(C67175t.class, tVar);
    }

    private C67175t() {
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
                return newMessageInfo(f182588e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဌ\u0000\u0003င\u0001\u0004င\u0002", new Object[]{"a", "b", C67174s.m97432b(), C45240c.f118157a, "d"});
            case 3:
                return new C67175t();
            case 4:
                return new C67172q();
            case 5:
                return f182588e;
            case 6:
                C63010eb ebVar = f182589f;
                if (ebVar == null) {
                    synchronized (C67175t.class) {
                        ebVar = f182589f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182588e);
                            f182589f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
