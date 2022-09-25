package com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.as.a.a.af */
/* compiled from: PG */
public final class C107467af extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C107467af f299043c;

    /* renamed from: d */
    private static volatile C63010eb f299044d;

    /* renamed from: a */
    public int f299045a;

    /* renamed from: b */
    public int f299046b;

    static {
        C107467af afVar = new C107467af();
        f299043c = afVar;
        C62942bv.registerDefaultInstance(C107467af.class, afVar);
    }

    private C107467af() {
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
                return newMessageInfo(f299043c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C107465ad.f299042a});
            case 3:
                return new C107467af();
            case 4:
                return new C107464ac();
            case 5:
                return f299043c;
            case 6:
                C63010eb ebVar = f299044d;
                if (ebVar == null) {
                    synchronized (C107467af.class) {
                        ebVar = f299044d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f299043c);
                            f299044d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
