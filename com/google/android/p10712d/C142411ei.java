package com.google.android.p10712d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.ei */
/* compiled from: PG */
public final class C142411ei extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C142411ei f386423a;

    /* renamed from: b */
    private static volatile C63010eb f386424b;

    static {
        C142411ei eiVar = new C142411ei();
        f386423a = eiVar;
        C62942bv.registerDefaultInstance(C142411ei.class, eiVar);
    }

    private C142411ei() {
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
                return newMessageInfo(f386423a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C142411ei();
            case 4:
                return new C142410eh();
            case 5:
                return f386423a;
            case 6:
                C63010eb ebVar = f386424b;
                if (ebVar == null) {
                    synchronized (C142411ei.class) {
                        ebVar = f386424b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386423a);
                            f386424b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
