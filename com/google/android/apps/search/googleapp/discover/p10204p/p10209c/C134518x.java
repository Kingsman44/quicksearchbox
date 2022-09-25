package com.google.android.apps.search.googleapp.discover.p10204p.p10209c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.discover.p.c.x */
/* compiled from: PG */
public final class C134518x extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C134518x f366331a;

    /* renamed from: b */
    private static volatile C63010eb f366332b;

    static {
        C134518x xVar = new C134518x();
        f366331a = xVar;
        C62942bv.registerDefaultInstance(C134518x.class, xVar);
    }

    private C134518x() {
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
                return newMessageInfo(f366331a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C134518x();
            case 4:
                return new C134517w();
            case 5:
                return f366331a;
            case 6:
                C63010eb ebVar = f366332b;
                if (ebVar == null) {
                    synchronized (C134518x.class) {
                        ebVar = f366332b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f366331a);
                            f366332b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
