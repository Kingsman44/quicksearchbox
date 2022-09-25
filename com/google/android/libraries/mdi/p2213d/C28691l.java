package com.google.android.libraries.mdi.p2213d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.mdi.d.l */
/* compiled from: PG */
public final class C28691l extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C28691l f77961a;

    /* renamed from: b */
    private static volatile C63010eb f77962b;

    static {
        C28691l lVar = new C28691l();
        f77961a = lVar;
        C62942bv.registerDefaultInstance(C28691l.class, lVar);
    }

    private C28691l() {
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
                return newMessageInfo(f77961a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C28691l();
            case 4:
                return new C28690k();
            case 5:
                return f77961a;
            case 6:
                C63010eb ebVar = f77962b;
                if (ebVar == null) {
                    synchronized (C28691l.class) {
                        ebVar = f77962b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f77961a);
                            f77962b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
