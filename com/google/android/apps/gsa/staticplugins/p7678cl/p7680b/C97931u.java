package com.google.android.apps.gsa.staticplugins.p7678cl.p7680b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.cl.b.u */
/* compiled from: PG */
public final class C97931u extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C97931u f273470a;

    /* renamed from: b */
    private static volatile C63010eb f273471b;

    static {
        C97931u uVar = new C97931u();
        f273470a = uVar;
        C62942bv.registerDefaultInstance(C97931u.class, uVar);
    }

    private C97931u() {
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
                return newMessageInfo(f273470a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C97931u();
            case 4:
                return new C97930t();
            case 5:
                return f273470a;
            case 6:
                C63010eb ebVar = f273471b;
                if (ebVar == null) {
                    synchronized (C97931u.class) {
                        ebVar = f273471b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f273470a);
                            f273471b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
