package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cf */
/* compiled from: PG */
public final class C138250cf extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C138250cf f376143a;

    /* renamed from: b */
    private static volatile C63010eb f376144b;

    static {
        C138250cf cfVar = new C138250cf();
        f376143a = cfVar;
        C62942bv.registerDefaultInstance(C138250cf.class, cfVar);
    }

    private C138250cf() {
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
                return newMessageInfo(f376143a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C138250cf();
            case 4:
                return new C138249ce();
            case 5:
                return f376143a;
            case 6:
                C63010eb ebVar = f376144b;
                if (ebVar == null) {
                    synchronized (C138250cf.class) {
                        ebVar = f376144b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f376143a);
                            f376144b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
