package com.google.android.apps.gsa.staticplugins.deeplink.p7790c.p7791a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.deeplink.c.a.d */
/* compiled from: PG */
public final class C99480d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C99480d f278374b;

    /* renamed from: d */
    private static volatile C63010eb f278375d;

    /* renamed from: a */
    public String f278376a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f278377c;

    static {
        C99480d dVar = new C99480d();
        f278374b = dVar;
        C62942bv.registerDefaultInstance(C99480d.class, dVar);
    }

    private C99480d() {
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
                return newMessageInfo(f278374b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C99480d();
            case 4:
                return new C99479c();
            case 5:
                return f278374b;
            case 6:
                C63010eb ebVar = f278375d;
                if (ebVar == null) {
                    synchronized (C99480d.class) {
                        ebVar = f278375d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f278374b);
                            f278375d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
