package com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.as.a.a.q */
/* compiled from: PG */
public final class C107491q extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C107491q f299084d;

    /* renamed from: e */
    private static volatile C63010eb f299085e;

    /* renamed from: a */
    public int f299086a;

    /* renamed from: b */
    public int f299087b;

    /* renamed from: c */
    public String f299088c = BuildConfig.FLAVOR;

    static {
        C107491q qVar = new C107491q();
        f299084d = qVar;
        C62942bv.registerDefaultInstance(C107491q.class, qVar);
    }

    private C107491q() {
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
                return newMessageInfo(f299084d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C107492r.f299089a, C45240c.f118157a});
            case 3:
                return new C107491q();
            case 4:
                return new C107490p();
            case 5:
                return f299084d;
            case 6:
                C63010eb ebVar = f299085e;
                if (ebVar == null) {
                    synchronized (C107491q.class) {
                        ebVar = f299085e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f299084d);
                            f299085e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
