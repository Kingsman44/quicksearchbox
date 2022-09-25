package com.google.android.libraries.search.p3055n.p3085h;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.n.h.d */
/* compiled from: PG */
public final class C39771d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C39771d f104606e;

    /* renamed from: f */
    private static volatile C63010eb f104607f;

    /* renamed from: a */
    public int f104608a;

    /* renamed from: b */
    public String f104609b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f104610c;

    /* renamed from: d */
    public String f104611d = BuildConfig.FLAVOR;

    static {
        C39771d dVar = new C39771d();
        f104606e = dVar;
        C62942bv.registerDefaultInstance(C39771d.class, dVar);
    }

    private C39771d() {
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
                return newMessageInfo(f104606e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C39771d();
            case 4:
                return new C39770c();
            case 5:
                return f104606e;
            case 6:
                C63010eb ebVar = f104607f;
                if (ebVar == null) {
                    synchronized (C39771d.class) {
                        ebVar = f104607f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f104606e);
                            f104607f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
