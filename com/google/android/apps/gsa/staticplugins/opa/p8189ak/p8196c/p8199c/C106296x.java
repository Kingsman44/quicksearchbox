package com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8199c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ak.c.c.x */
/* compiled from: PG */
public final class C106296x extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C106296x f296565a;

    /* renamed from: b */
    private static volatile C63010eb f296566b;

    static {
        C106296x xVar = new C106296x();
        f296565a = xVar;
        C62942bv.registerDefaultInstance(C106296x.class, xVar);
    }

    private C106296x() {
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
                return newMessageInfo(f296565a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C106296x();
            case 4:
                return new C106295w();
            case 5:
                return f296565a;
            case 6:
                C63010eb ebVar = f296566b;
                if (ebVar == null) {
                    synchronized (C106296x.class) {
                        ebVar = f296566b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f296565a);
                            f296566b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
