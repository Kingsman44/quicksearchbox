package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bo */
/* compiled from: PG */
public final class C138207bo extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C138207bo f376034c;

    /* renamed from: d */
    private static volatile C63010eb f376035d;

    /* renamed from: a */
    public int f376036a = 0;

    /* renamed from: b */
    public Object f376037b;

    static {
        C138207bo boVar = new C138207bo();
        f376034c = boVar;
        C62942bv.registerDefaultInstance(C138207bo.class, boVar);
    }

    private C138207bo() {
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
                return newMessageInfo(f376034c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", C138204bl.class, C138206bn.class});
            case 3:
                return new C138207bo();
            case 4:
                return new C138202bj();
            case 5:
                return f376034c;
            case 6:
                C63010eb ebVar = f376035d;
                if (ebVar == null) {
                    synchronized (C138207bo.class) {
                        ebVar = f376035d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f376034c);
                            f376035d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
