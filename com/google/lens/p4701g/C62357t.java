package com.google.lens.p4701g;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.g.t */
/* compiled from: PG */
public final class C62357t extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62357t f168340e;

    /* renamed from: f */
    private static volatile C63010eb f168341f;

    /* renamed from: a */
    public int f168342a;

    /* renamed from: b */
    public String f168343b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f168344c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f168345d;

    static {
        C62357t tVar = new C62357t();
        f168340e = tVar;
        C62942bv.registerDefaultInstance(C62357t.class, tVar);
    }

    private C62357t() {
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
                return newMessageInfo(f168340e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C62357t();
            case 4:
                return new C62356s();
            case 5:
                return f168340e;
            case 6:
                C63010eb ebVar = f168341f;
                if (ebVar == null) {
                    synchronized (C62357t.class) {
                        ebVar = f168341f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168340e);
                            f168341f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
