package com.google.android.apps.gsa.shared.p6995aq;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.aq.j */
/* compiled from: PG */
public final class C89267j extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C89267j f242039f;

    /* renamed from: g */
    private static volatile C63010eb f242040g;

    /* renamed from: a */
    public int f242041a;

    /* renamed from: b */
    public int f242042b;

    /* renamed from: c */
    public String f242043c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f242044d;

    /* renamed from: e */
    public int f242045e;

    static {
        C89267j jVar = new C89267j();
        f242039f = jVar;
        C62942bv.registerDefaultInstance(C89267j.class, jVar);
    }

    private C89267j() {
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
                return newMessageInfo(f242039f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဋ\u0003", new Object[]{"a", "b", C89265h.f242038a, C45240c.f118157a, "d", C89263f.f242037a, "e"});
            case 3:
                return new C89267j();
            case 4:
                return new C89262e();
            case 5:
                return f242039f;
            case 6:
                C63010eb ebVar = f242040g;
                if (ebVar == null) {
                    synchronized (C89267j.class) {
                        ebVar = f242040g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f242039f);
                            f242040g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
