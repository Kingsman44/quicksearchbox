package com.google.android.apps.gsa.staticplugins.opa.setupwizard;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.setupwizard.m */
/* compiled from: PG */
public final class C110489m extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C110489m f308025c;

    /* renamed from: d */
    private static volatile C63010eb f308026d;

    /* renamed from: a */
    public int f308027a;

    /* renamed from: b */
    public int f308028b;

    static {
        C110489m mVar = new C110489m();
        f308025c = mVar;
        C62942bv.registerDefaultInstance(C110489m.class, mVar);
    }

    private C110489m() {
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
                return newMessageInfo(f308025c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C110488l.f308024a});
            case 3:
                return new C110489m();
            case 4:
                return new C110487k();
            case 5:
                return f308025c;
            case 6:
                C63010eb ebVar = f308026d;
                if (ebVar == null) {
                    synchronized (C110489m.class) {
                        ebVar = f308026d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f308025c);
                            f308026d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
