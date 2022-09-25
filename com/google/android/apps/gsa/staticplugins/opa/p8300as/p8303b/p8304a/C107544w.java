package com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.as.b.a.w */
/* compiled from: PG */
public final class C107544w extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C107544w f299193a;

    /* renamed from: b */
    private static volatile C63010eb f299194b;

    static {
        C107544w wVar = new C107544w();
        f299193a = wVar;
        C62942bv.registerDefaultInstance(C107544w.class, wVar);
    }

    private C107544w() {
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
                return newMessageInfo(f299193a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C107544w();
            case 4:
                return new C107543v();
            case 5:
                return f299193a;
            case 6:
                C63010eb ebVar = f299194b;
                if (ebVar == null) {
                    synchronized (C107544w.class) {
                        ebVar = f299194b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f299193a);
                            f299194b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
