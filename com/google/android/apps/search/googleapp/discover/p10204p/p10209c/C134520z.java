package com.google.android.apps.search.googleapp.discover.p10204p.p10209c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.discover.p.c.z */
/* compiled from: PG */
public final class C134520z extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C134520z f366333e;

    /* renamed from: f */
    private static volatile C63010eb f366334f;

    /* renamed from: a */
    public int f366335a;

    /* renamed from: b */
    public int f366336b;

    /* renamed from: c */
    public C134496b f366337c;

    /* renamed from: d */
    public String f366338d = BuildConfig.FLAVOR;

    static {
        C134520z zVar = new C134520z();
        f366333e = zVar;
        C62942bv.registerDefaultInstance(C134520z.class, zVar);
    }

    private C134520z() {
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
                return newMessageInfo(f366333e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C134520z();
            case 4:
                return new C134519y();
            case 5:
                return f366333e;
            case 6:
                C63010eb ebVar = f366334f;
                if (ebVar == null) {
                    synchronized (C134520z.class) {
                        ebVar = f366334f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f366333e);
                            f366334f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
