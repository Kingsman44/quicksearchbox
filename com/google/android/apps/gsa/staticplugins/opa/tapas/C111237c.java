package com.google.android.apps.gsa.staticplugins.opa.tapas;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.c */
/* compiled from: PG */
public final class C111237c extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C111237c f309550d;

    /* renamed from: e */
    private static volatile C63010eb f309551e;

    /* renamed from: a */
    public int f309552a;

    /* renamed from: b */
    public String f309553b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f309554c;

    static {
        C111237c cVar = new C111237c();
        f309550d = cVar;
        C62942bv.registerDefaultInstance(C111237c.class, cVar);
    }

    private C111237c() {
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
                return newMessageInfo(f309550d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C110959a.f309118a});
            case 3:
                return new C111237c();
            case 4:
                return new C111077b();
            case 5:
                return f309550d;
            case 6:
                C63010eb ebVar = f309551e;
                if (ebVar == null) {
                    synchronized (C111237c.class) {
                        ebVar = f309551e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f309550d);
                            f309551e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
