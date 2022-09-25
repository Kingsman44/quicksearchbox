package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bn */
/* compiled from: PG */
public final class C138206bn extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C138206bn f376032a;

    /* renamed from: b */
    private static volatile C63010eb f376033b;

    static {
        C138206bn bnVar = new C138206bn();
        f376032a = bnVar;
        C62942bv.registerDefaultInstance(C138206bn.class, bnVar);
    }

    private C138206bn() {
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
                return newMessageInfo(f376032a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C138206bn();
            case 4:
                return new C138205bm();
            case 5:
                return f376032a;
            case 6:
                C63010eb ebVar = f376033b;
                if (ebVar == null) {
                    synchronized (C138206bn.class) {
                        ebVar = f376033b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f376032a);
                            f376033b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
