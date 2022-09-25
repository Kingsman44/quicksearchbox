package com.google.android.libraries.search.p2904c.p2982x;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.x.p */
/* compiled from: PG */
public final class C38257p extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C38257p f101364a;

    /* renamed from: b */
    private static volatile C63010eb f101365b;

    static {
        C38257p pVar = new C38257p();
        f101364a = pVar;
        C62942bv.registerDefaultInstance(C38257p.class, pVar);
    }

    private C38257p() {
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
                return newMessageInfo(f101364a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C38257p();
            case 4:
                return new C38256o();
            case 5:
                return f101364a;
            case 6:
                C63010eb ebVar = f101365b;
                if (ebVar == null) {
                    synchronized (C38257p.class) {
                        ebVar = f101365b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f101364a);
                            f101365b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
