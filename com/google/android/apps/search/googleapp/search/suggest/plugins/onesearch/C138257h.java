package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.h */
/* compiled from: PG */
public final class C138257h extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C138257h f376156a;

    /* renamed from: b */
    private static volatile C63010eb f376157b;

    static {
        C138257h hVar = new C138257h();
        f376156a = hVar;
        C62942bv.registerDefaultInstance(C138257h.class, hVar);
    }

    private C138257h() {
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
                return newMessageInfo(f376156a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C138257h();
            case 4:
                return new C138256g();
            case 5:
                return f376156a;
            case 6:
                C63010eb ebVar = f376157b;
                if (ebVar == null) {
                    synchronized (C138257h.class) {
                        ebVar = f376157b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f376156a);
                            f376157b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
