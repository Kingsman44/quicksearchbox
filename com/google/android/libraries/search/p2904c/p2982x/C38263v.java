package com.google.android.libraries.search.p2904c.p2982x;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.x.v */
/* compiled from: PG */
public final class C38263v extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C38263v f101372a;

    /* renamed from: b */
    private static volatile C63010eb f101373b;

    static {
        C38263v vVar = new C38263v();
        f101372a = vVar;
        C62942bv.registerDefaultInstance(C38263v.class, vVar);
    }

    private C38263v() {
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
                return newMessageInfo(f101372a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C38263v();
            case 4:
                return new C38262u();
            case 5:
                return f101372a;
            case 6:
                C63010eb ebVar = f101373b;
                if (ebVar == null) {
                    synchronized (C38263v.class) {
                        ebVar = f101373b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f101372a);
                            f101373b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
