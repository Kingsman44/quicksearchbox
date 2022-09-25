package com.google.android.apps.search.googleapp.search.suggest;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ab */
/* compiled from: PG */
public final class C138010ab extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C138010ab f375456d;

    /* renamed from: e */
    private static volatile C63010eb f375457e;

    /* renamed from: a */
    public int f375458a;

    /* renamed from: b */
    public String f375459b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f375460c;

    static {
        C138010ab abVar = new C138010ab();
        f375456d = abVar;
        C62942bv.registerDefaultInstance(C138010ab.class, abVar);
    }

    private C138010ab() {
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
                return newMessageInfo(f375456d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C138011ac.f375461a});
            case 3:
                return new C138010ab();
            case 4:
                return new C138009aa();
            case 5:
                return f375456d;
            case 6:
                C63010eb ebVar = f375457e;
                if (ebVar == null) {
                    synchronized (C138010ab.class) {
                        ebVar = f375457e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f375456d);
                            f375457e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
