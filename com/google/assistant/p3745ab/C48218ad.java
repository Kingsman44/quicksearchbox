package com.google.assistant.p3745ab;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.ad */
/* compiled from: PG */
public final class C48218ad extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C48218ad f124749f;

    /* renamed from: g */
    private static volatile C63010eb f124750g;

    /* renamed from: a */
    public int f124751a = 0;

    /* renamed from: b */
    public Object f124752b;

    /* renamed from: c */
    public int f124753c;

    /* renamed from: d */
    public C48234at f124754d;

    /* renamed from: e */
    public long f124755e;

    static {
        C48218ad adVar = new C48218ad();
        f124749f = adVar;
        C62942bv.registerDefaultInstance(C48218ad.class, adVar);
    }

    private C48218ad() {
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
                return newMessageInfo(f124749f, "\u0000\u0005\u0001\u0000\u0001\u0006\u0005\u0000\u0000\u0000\u0001\u0004\u0003\t\u0004<\u0000\u0005<\u0000\u0006\u0002", new Object[]{"b", "a", C45240c.f118157a, "d", C48230ap.class, C48232ar.class, "e"});
            case 3:
                return new C48218ad();
            case 4:
                return new C48211ac();
            case 5:
                return f124749f;
            case 6:
                C63010eb ebVar = f124750g;
                if (ebVar == null) {
                    synchronized (C48218ad.class) {
                        ebVar = f124750g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124749f);
                            f124750g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
