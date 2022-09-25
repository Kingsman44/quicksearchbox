package com.google.android.apps.gsa.opa.p6441f.p6442a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opa.f.a.bd */
/* compiled from: PG */
public final class C83642bd extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C83642bd f228007a;

    /* renamed from: b */
    private static volatile C63010eb f228008b;

    static {
        C83642bd bdVar = new C83642bd();
        f228007a = bdVar;
        C62942bv.registerDefaultInstance(C83642bd.class, bdVar);
    }

    private C83642bd() {
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
                return newMessageInfo(f228007a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C83642bd();
            case 4:
                return new C83641bc();
            case 5:
                return f228007a;
            case 6:
                C63010eb ebVar = f228008b;
                if (ebVar == null) {
                    synchronized (C83642bd.class) {
                        ebVar = f228008b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228007a);
                            f228008b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
