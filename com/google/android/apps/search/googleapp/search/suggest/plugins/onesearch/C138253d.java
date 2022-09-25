package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.d */
/* compiled from: PG */
public final class C138253d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C138253d f376150a;

    /* renamed from: b */
    private static volatile C63010eb f376151b;

    static {
        C138253d dVar = new C138253d();
        f376150a = dVar;
        C62942bv.registerDefaultInstance(C138253d.class, dVar);
    }

    private C138253d() {
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
                return newMessageInfo(f376150a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C138253d();
            case 4:
                return new C138219c();
            case 5:
                return f376150a;
            case 6:
                C63010eb ebVar = f376151b;
                if (ebVar == null) {
                    synchronized (C138253d.class) {
                        ebVar = f376151b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f376150a);
                            f376151b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
