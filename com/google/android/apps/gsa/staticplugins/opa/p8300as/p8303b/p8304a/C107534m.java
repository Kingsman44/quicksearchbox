package com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.as.b.a.m */
/* compiled from: PG */
public final class C107534m extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C107534m f299168d;

    /* renamed from: e */
    private static volatile C63010eb f299169e;

    /* renamed from: a */
    public int f299170a;

    /* renamed from: b */
    public String f299171b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f299172c = BuildConfig.FLAVOR;

    static {
        C107534m mVar = new C107534m();
        f299168d = mVar;
        C62942bv.registerDefaultInstance(C107534m.class, mVar);
    }

    private C107534m() {
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
                return newMessageInfo(f299168d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C107534m();
            case 4:
                return new C107533l();
            case 5:
                return f299168d;
            case 6:
                C63010eb ebVar = f299169e;
                if (ebVar == null) {
                    synchronized (C107534m.class) {
                        ebVar = f299169e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f299168d);
                            f299169e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
