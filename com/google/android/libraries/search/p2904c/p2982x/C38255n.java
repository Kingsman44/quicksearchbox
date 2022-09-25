package com.google.android.libraries.search.p2904c.p2982x;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.x.n */
/* compiled from: PG */
public final class C38255n extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C38255n f101362a;

    /* renamed from: b */
    private static volatile C63010eb f101363b;

    static {
        C38255n nVar = new C38255n();
        f101362a = nVar;
        C62942bv.registerDefaultInstance(C38255n.class, nVar);
    }

    private C38255n() {
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
                return newMessageInfo(f101362a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C38255n();
            case 4:
                return new C38254m();
            case 5:
                return f101362a;
            case 6:
                C63010eb ebVar = f101363b;
                if (ebVar == null) {
                    synchronized (C38255n.class) {
                        ebVar = f101363b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f101362a);
                            f101363b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
