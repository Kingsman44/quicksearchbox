package com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7587c;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7583a.p7584a.C96981d;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.f.c.k */
/* compiled from: PG */
public final class C97006k extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C97006k f271091e;

    /* renamed from: f */
    private static volatile C63010eb f271092f;

    /* renamed from: a */
    public int f271093a;

    /* renamed from: b */
    public C96981d f271094b;

    /* renamed from: c */
    public String f271095c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f271096d = BuildConfig.FLAVOR;

    static {
        C97006k kVar = new C97006k();
        f271091e = kVar;
        C62942bv.registerDefaultInstance(C97006k.class, kVar);
    }

    private C97006k() {
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
                return newMessageInfo(f271091e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C97006k();
            case 4:
                return new C97005j();
            case 5:
                return f271091e;
            case 6:
                C63010eb ebVar = f271092f;
                if (ebVar == null) {
                    synchronized (C97006k.class) {
                        ebVar = f271092f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f271091e);
                            f271092f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
