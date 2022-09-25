package com.google.android.libraries.logging.p2185ve.p2193e.p2195b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.logging.ve.e.b.ao */
/* compiled from: PG */
public final class C28379ao extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C28379ao f77115a;

    /* renamed from: b */
    private static volatile C63010eb f77116b;

    static {
        C28379ao aoVar = new C28379ao();
        f77115a = aoVar;
        C62942bv.registerDefaultInstance(C28379ao.class, aoVar);
    }

    private C28379ao() {
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
                return newMessageInfo(f77115a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C28379ao();
            case 4:
                return new C28378an();
            case 5:
                return f77115a;
            case 6:
                C63010eb ebVar = f77116b;
                if (ebVar == null) {
                    synchronized (C28379ao.class) {
                        ebVar = f77116b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f77115a);
                            f77116b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
