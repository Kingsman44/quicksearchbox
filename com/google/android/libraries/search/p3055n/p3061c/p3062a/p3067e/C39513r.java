package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3067e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.n.c.a.e.r */
/* compiled from: PG */
public final class C39513r extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C39513r f104037e;

    /* renamed from: f */
    private static volatile C63010eb f104038f;

    /* renamed from: a */
    public int f104039a;

    /* renamed from: b */
    public int f104040b;

    /* renamed from: c */
    public String f104041c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f104042d;

    static {
        C39513r rVar = new C39513r();
        f104037e = rVar;
        C62942bv.registerDefaultInstance(C39513r.class, rVar);
    }

    private C39513r() {
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
                return newMessageInfo(f104037e, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ለ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C39513r();
            case 4:
                return new C39511p();
            case 5:
                return f104037e;
            case 6:
                C63010eb ebVar = f104038f;
                if (ebVar == null) {
                    synchronized (C39513r.class) {
                        ebVar = f104038f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f104037e);
                            f104038f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
