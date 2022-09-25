package com.google.android.apps.auto.p450a.p452b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.auto.a.b.t */
/* compiled from: PG */
public final class C8954t extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C8954t f31027d;

    /* renamed from: f */
    private static volatile C63010eb f31028f;

    /* renamed from: a */
    public String f31029a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C63042fg f31030b;

    /* renamed from: c */
    public int f31031c;

    /* renamed from: e */
    private int f31032e;

    static {
        C8954t tVar = new C8954t();
        f31027d = tVar;
        C62942bv.registerDefaultInstance(C8954t.class, tVar);
    }

    private C8954t() {
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
                return newMessageInfo(f31027d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဌ\u0002", new Object[]{"e", "a", "b", C45240c.f118157a, C8952r.f31026a});
            case 3:
                return new C8954t();
            case 4:
                return new C8951q();
            case 5:
                return f31027d;
            case 6:
                C63010eb ebVar = f31028f;
                if (ebVar == null) {
                    synchronized (C8954t.class) {
                        ebVar = f31028f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31027d);
                            f31028f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
