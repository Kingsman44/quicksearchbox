package com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.as.a.a.ak */
/* compiled from: PG */
public final class C107472ak extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C107472ak f299049c;

    /* renamed from: d */
    private static volatile C63010eb f299050d;

    /* renamed from: a */
    public int f299051a;

    /* renamed from: b */
    public int f299052b;

    static {
        C107472ak akVar = new C107472ak();
        f299049c = akVar;
        C62942bv.registerDefaultInstance(C107472ak.class, akVar);
    }

    private C107472ak() {
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
                return newMessageInfo(f299049c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C107470ai.f299048a});
            case 3:
                return new C107472ak();
            case 4:
                return new C107469ah();
            case 5:
                return f299049c;
            case 6:
                C63010eb ebVar = f299050d;
                if (ebVar == null) {
                    synchronized (C107472ak.class) {
                        ebVar = f299050d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f299049c);
                            f299050d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
