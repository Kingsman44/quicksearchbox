package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bz */
/* compiled from: PG */
public final class C138218bz extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C138218bz f376064a;

    /* renamed from: b */
    private static volatile C63010eb f376065b;

    static {
        C138218bz bzVar = new C138218bz();
        f376064a = bzVar;
        C62942bv.registerDefaultInstance(C138218bz.class, bzVar);
    }

    private C138218bz() {
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
                return newMessageInfo(f376064a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C138218bz();
            case 4:
                return new C138217by();
            case 5:
                return f376064a;
            case 6:
                C63010eb ebVar = f376065b;
                if (ebVar == null) {
                    synchronized (C138218bz.class) {
                        ebVar = f376065b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f376064a);
                            f376065b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
