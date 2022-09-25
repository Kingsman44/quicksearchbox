package com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8402a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.omniconsent.a.l */
/* compiled from: PG */
public final class C109780l extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C109780l f305895d;

    /* renamed from: e */
    private static volatile C63010eb f305896e;

    /* renamed from: a */
    public int f305897a;

    /* renamed from: b */
    public String f305898b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f305899c = BuildConfig.FLAVOR;

    static {
        C109780l lVar = new C109780l();
        f305895d = lVar;
        C62942bv.registerDefaultInstance(C109780l.class, lVar);
    }

    private C109780l() {
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
                return newMessageInfo(f305895d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C109780l();
            case 4:
                return new C109779k();
            case 5:
                return f305895d;
            case 6:
                C63010eb ebVar = f305896e;
                if (ebVar == null) {
                    synchronized (C109780l.class) {
                        ebVar = f305896e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f305895d);
                            f305896e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
