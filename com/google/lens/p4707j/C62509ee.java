package com.google.lens.p4707j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.ee */
/* compiled from: PG */
public final class C62509ee extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62509ee f168773a;

    /* renamed from: b */
    private static volatile C63010eb f168774b;

    static {
        C62509ee eeVar = new C62509ee();
        f168773a = eeVar;
        C62942bv.registerDefaultInstance(C62509ee.class, eeVar);
    }

    private C62509ee() {
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
                return newMessageInfo(f168773a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62509ee();
            case 4:
                return new C62508ed();
            case 5:
                return f168773a;
            case 6:
                C63010eb ebVar = f168774b;
                if (ebVar == null) {
                    synchronized (C62509ee.class) {
                        ebVar = f168774b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168773a);
                            f168774b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
