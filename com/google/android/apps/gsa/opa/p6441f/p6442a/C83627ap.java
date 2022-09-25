package com.google.android.apps.gsa.opa.p6441f.p6442a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opa.f.a.ap */
/* compiled from: PG */
public final class C83627ap extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C83627ap f227976a;

    /* renamed from: b */
    private static volatile C63010eb f227977b;

    static {
        C83627ap apVar = new C83627ap();
        f227976a = apVar;
        C62942bv.registerDefaultInstance(C83627ap.class, apVar);
    }

    private C83627ap() {
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
                return newMessageInfo(f227976a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C83627ap();
            case 4:
                return new C83626ao();
            case 5:
                return f227976a;
            case 6:
                C63010eb ebVar = f227977b;
                if (ebVar == null) {
                    synchronized (C83627ap.class) {
                        ebVar = f227977b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f227976a);
                            f227977b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
