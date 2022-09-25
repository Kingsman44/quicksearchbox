package com.google.android.apps.gsa.assistant.settings.features.appactions.p567c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.c.x */
/* compiled from: PG */
public final class C10279x extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C10279x f34833d;

    /* renamed from: e */
    private static volatile C63010eb f34834e;

    /* renamed from: a */
    public int f34835a;

    /* renamed from: b */
    public String f34836b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f34837c;

    static {
        C10279x xVar = new C10279x();
        f34833d = xVar;
        C62942bv.registerDefaultInstance(C10279x.class, xVar);
    }

    private C10279x() {
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
                return newMessageInfo(f34833d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C10279x();
            case 4:
                return new C10278w();
            case 5:
                return f34833d;
            case 6:
                C63010eb ebVar = f34834e;
                if (ebVar == null) {
                    synchronized (C10279x.class) {
                        ebVar = f34834e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f34833d);
                            f34834e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
