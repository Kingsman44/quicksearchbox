package com.google.android.apps.search.assistant.platform.pcp.p9329f;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.f.br */
/* compiled from: PG */
public final class C123751br extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C123751br f341826e;

    /* renamed from: f */
    private static volatile C63010eb f341827f;

    /* renamed from: a */
    public int f341828a;

    /* renamed from: b */
    public long f341829b;

    /* renamed from: c */
    public String f341830c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f341831d = BuildConfig.FLAVOR;

    static {
        C123751br brVar = new C123751br();
        f341826e = brVar;
        C62942bv.registerDefaultInstance(C123751br.class, brVar);
    }

    private C123751br() {
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
                return newMessageInfo(f341826e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0004ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C123751br();
            case 4:
                return new C123750bq();
            case 5:
                return f341826e;
            case 6:
                C63010eb ebVar = f341827f;
                if (ebVar == null) {
                    synchronized (C123751br.class) {
                        ebVar = f341827f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f341826e);
                            f341827f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
