package com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8199c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ak.c.c.e */
/* compiled from: PG */
public final class C106277e extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C106277e f296504a;

    /* renamed from: b */
    private static volatile C63010eb f296505b;

    static {
        C106277e eVar = new C106277e();
        f296504a = eVar;
        C62942bv.registerDefaultInstance(C106277e.class, eVar);
    }

    private C106277e() {
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
                return newMessageInfo(f296504a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C106277e();
            case 4:
                return new C106276d();
            case 5:
                return f296504a;
            case 6:
                C63010eb ebVar = f296505b;
                if (ebVar == null) {
                    synchronized (C106277e.class) {
                        ebVar = f296505b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f296504a);
                            f296505b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
