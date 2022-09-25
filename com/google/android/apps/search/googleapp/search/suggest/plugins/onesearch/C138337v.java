package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.v */
/* compiled from: PG */
public final class C138337v extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C138337v f376370a;

    /* renamed from: b */
    private static volatile C63010eb f376371b;

    static {
        C138337v vVar = new C138337v();
        f376370a = vVar;
        C62942bv.registerDefaultInstance(C138337v.class, vVar);
    }

    private C138337v() {
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
                return newMessageInfo(f376370a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C138337v();
            case 4:
                return new C138336u();
            case 5:
                return f376370a;
            case 6:
                C63010eb ebVar = f376371b;
                if (ebVar == null) {
                    synchronized (C138337v.class) {
                        ebVar = f376371b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f376370a);
                            f376371b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
