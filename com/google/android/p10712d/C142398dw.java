package com.google.android.p10712d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.dw */
/* compiled from: PG */
public final class C142398dw extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C142398dw f386403a;

    /* renamed from: b */
    private static volatile C63010eb f386404b;

    static {
        C142398dw dwVar = new C142398dw();
        f386403a = dwVar;
        C62942bv.registerDefaultInstance(C142398dw.class, dwVar);
    }

    private C142398dw() {
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
                return newMessageInfo(f386403a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C142398dw();
            case 4:
                return new C142397dv();
            case 5:
                return f386403a;
            case 6:
                C63010eb ebVar = f386404b;
                if (ebVar == null) {
                    synchronized (C142398dw.class) {
                        ebVar = f386404b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386403a);
                            f386404b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
