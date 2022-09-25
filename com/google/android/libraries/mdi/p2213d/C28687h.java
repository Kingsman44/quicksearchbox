package com.google.android.libraries.mdi.p2213d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.mdi.d.h */
/* compiled from: PG */
public final class C28687h extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C28687h f77954a;

    /* renamed from: b */
    private static volatile C63010eb f77955b;

    static {
        C28687h hVar = new C28687h();
        f77954a = hVar;
        C62942bv.registerDefaultInstance(C28687h.class, hVar);
    }

    private C28687h() {
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
                return newMessageInfo(f77954a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C28687h();
            case 4:
                return new C28686g();
            case 5:
                return f77954a;
            case 6:
                C63010eb ebVar = f77955b;
                if (ebVar == null) {
                    synchronized (C28687h.class) {
                        ebVar = f77955b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f77954a);
                            f77955b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
