package com.google.assistant.p3781ad.p3789d.p3790a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.a.d */
/* compiled from: PG */
public final class C48551d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C48551d f125425e;

    /* renamed from: f */
    private static volatile C63010eb f125426f;

    /* renamed from: a */
    public int f125427a;

    /* renamed from: b */
    public String f125428b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f125429c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f125430d = BuildConfig.FLAVOR;

    static {
        C48551d dVar = new C48551d();
        f125425e = dVar;
        C62942bv.registerDefaultInstance(C48551d.class, dVar);
    }

    private C48551d() {
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
                return newMessageInfo(f125425e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C48551d();
            case 4:
                return new C48550c();
            case 5:
                return f125425e;
            case 6:
                C63010eb ebVar = f125426f;
                if (ebVar == null) {
                    synchronized (C48551d.class) {
                        ebVar = f125426f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125425e);
                            f125426f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
