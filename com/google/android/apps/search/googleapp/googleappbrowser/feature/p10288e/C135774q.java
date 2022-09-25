package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10288e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.e.q */
/* compiled from: PG */
public final class C135774q extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C135774q f369833d;

    /* renamed from: e */
    private static volatile C63010eb f369834e;

    /* renamed from: a */
    public int f369835a;

    /* renamed from: b */
    public String f369836b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f369837c;

    static {
        C135774q qVar = new C135774q();
        f369833d = qVar;
        C62942bv.registerDefaultInstance(C135774q.class, qVar);
    }

    private C135774q() {
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
                return newMessageInfo(f369833d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C135774q();
            case 4:
                return new C135773p();
            case 5:
                return f369833d;
            case 6:
                C63010eb ebVar = f369834e;
                if (ebVar == null) {
                    synchronized (C135774q.class) {
                        ebVar = f369834e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f369833d);
                            f369834e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
