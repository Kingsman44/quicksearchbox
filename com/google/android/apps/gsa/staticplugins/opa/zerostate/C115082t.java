package com.google.android.apps.gsa.staticplugins.opa.zerostate;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.t */
/* compiled from: PG */
public final class C115082t extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C115082t f319452d;

    /* renamed from: e */
    private static volatile C63010eb f319453e;

    /* renamed from: a */
    public int f319454a;

    /* renamed from: b */
    public long f319455b;

    /* renamed from: c */
    public String f319456c = BuildConfig.FLAVOR;

    static {
        C115082t tVar = new C115082t();
        f319452d = tVar;
        C62942bv.registerDefaultInstance(C115082t.class, tVar);
    }

    private C115082t() {
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
                return newMessageInfo(f319452d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C115082t();
            case 4:
                return new C114968s();
            case 5:
                return f319452d;
            case 6:
                C63010eb ebVar = f319453e;
                if (ebVar == null) {
                    synchronized (C115082t.class) {
                        ebVar = f319453e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f319452d);
                            f319453e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
