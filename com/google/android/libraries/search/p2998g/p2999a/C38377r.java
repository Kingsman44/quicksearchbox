package com.google.android.libraries.search.p2998g.p2999a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.g.a.r */
/* compiled from: PG */
public final class C38377r extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C38377r f101613e;

    /* renamed from: f */
    private static volatile C63010eb f101614f;

    /* renamed from: a */
    public int f101615a;

    /* renamed from: b */
    public C38343ac f101616b;

    /* renamed from: c */
    public boolean f101617c;

    /* renamed from: d */
    public String f101618d = BuildConfig.FLAVOR;

    static {
        C38377r rVar = new C38377r();
        f101613e = rVar;
        C62942bv.registerDefaultInstance(C38377r.class, rVar);
    }

    private C38377r() {
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
                return newMessageInfo(f101613e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C38377r();
            case 4:
                return new C38376q();
            case 5:
                return f101613e;
            case 6:
                C63010eb ebVar = f101614f;
                if (ebVar == null) {
                    synchronized (C38377r.class) {
                        ebVar = f101614f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f101613e);
                            f101614f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
