package com.google.android.libraries.lens.ondevice.p2037n;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.ondevice.n.ap */
/* compiled from: PG */
public final class C24783ap extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C24783ap f67719a;

    /* renamed from: b */
    private static volatile C63010eb f67720b;

    static {
        C24783ap apVar = new C24783ap();
        f67719a = apVar;
        C62942bv.registerDefaultInstance(C24783ap.class, apVar);
    }

    private C24783ap() {
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
                return newMessageInfo(f67719a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C24783ap();
            case 4:
                return new C24782ao();
            case 5:
                return f67719a;
            case 6:
                C63010eb ebVar = f67720b;
                if (ebVar == null) {
                    synchronized (C24783ap.class) {
                        ebVar = f67720b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f67719a);
                            f67720b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
