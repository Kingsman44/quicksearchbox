package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.ad */
/* compiled from: PG */
public final class C138169ad extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C138169ad f375936a;

    /* renamed from: b */
    private static volatile C63010eb f375937b;

    static {
        C138169ad adVar = new C138169ad();
        f375936a = adVar;
        C62942bv.registerDefaultInstance(C138169ad.class, adVar);
    }

    private C138169ad() {
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
                return newMessageInfo(f375936a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C138169ad();
            case 4:
                return new C138168ac();
            case 5:
                return f375936a;
            case 6:
                C63010eb ebVar = f375937b;
                if (ebVar == null) {
                    synchronized (C138169ad.class) {
                        ebVar = f375937b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f375936a);
                            f375937b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
