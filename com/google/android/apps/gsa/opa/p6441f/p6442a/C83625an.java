package com.google.android.apps.gsa.opa.p6441f.p6442a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opa.f.a.an */
/* compiled from: PG */
public final class C83625an extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C83625an f227974a;

    /* renamed from: b */
    private static volatile C63010eb f227975b;

    static {
        C83625an anVar = new C83625an();
        f227974a = anVar;
        C62942bv.registerDefaultInstance(C83625an.class, anVar);
    }

    private C83625an() {
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
                return newMessageInfo(f227974a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C83625an();
            case 4:
                return new C83624am();
            case 5:
                return f227974a;
            case 6:
                C63010eb ebVar = f227975b;
                if (ebVar == null) {
                    synchronized (C83625an.class) {
                        ebVar = f227975b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f227974a);
                            f227975b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
