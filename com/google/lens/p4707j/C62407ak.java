package com.google.lens.p4707j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.ak */
/* compiled from: PG */
public final class C62407ak extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62407ak f168463a;

    /* renamed from: b */
    private static volatile C63010eb f168464b;

    static {
        C62407ak akVar = new C62407ak();
        f168463a = akVar;
        C62942bv.registerDefaultInstance(C62407ak.class, akVar);
    }

    private C62407ak() {
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
                return newMessageInfo(f168463a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62407ak();
            case 4:
                return new C62406aj();
            case 5:
                return f168463a;
            case 6:
                C63010eb ebVar = f168464b;
                if (ebVar == null) {
                    synchronized (C62407ak.class) {
                        ebVar = f168464b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168463a);
                            f168464b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
