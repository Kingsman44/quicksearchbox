package com.google.android.apps.gsa.search.shared.service.p6936c.p6938b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.c.b.an */
/* compiled from: PG */
public final class C88416an extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C88416an f239062a;

    /* renamed from: b */
    private static volatile C63010eb f239063b;

    static {
        C88416an anVar = new C88416an();
        f239062a = anVar;
        C62942bv.registerDefaultInstance(C88416an.class, anVar);
    }

    private C88416an() {
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
                return newMessageInfo(f239062a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C88416an();
            case 4:
                return new C88415am();
            case 5:
                return f239062a;
            case 6:
                C63010eb ebVar = f239063b;
                if (ebVar == null) {
                    synchronized (C88416an.class) {
                        ebVar = f239063b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f239062a);
                            f239063b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
