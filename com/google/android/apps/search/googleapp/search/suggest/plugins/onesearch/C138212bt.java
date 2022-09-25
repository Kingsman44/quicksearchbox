package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bt */
/* compiled from: PG */
public final class C138212bt extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C138212bt f376049a;

    /* renamed from: b */
    private static volatile C63010eb f376050b;

    static {
        C138212bt btVar = new C138212bt();
        f376049a = btVar;
        C62942bv.registerDefaultInstance(C138212bt.class, btVar);
    }

    private C138212bt() {
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
                return newMessageInfo(f376049a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C138212bt();
            case 4:
                return new C138211bs();
            case 5:
                return f376049a;
            case 6:
                C63010eb ebVar = f376050b;
                if (ebVar == null) {
                    synchronized (C138212bt.class) {
                        ebVar = f376050b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f376049a);
                            f376050b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
