package com.google.android.libraries.lens.view.p2067ak;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.view.ak.cp */
/* compiled from: PG */
public final class C25264cp extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C25264cp f68730a;

    /* renamed from: b */
    private static volatile C63010eb f68731b;

    static {
        C25264cp cpVar = new C25264cp();
        f68730a = cpVar;
        C62942bv.registerDefaultInstance(C25264cp.class, cpVar);
    }

    private C25264cp() {
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
                return newMessageInfo(f68730a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C25264cp();
            case 4:
                return new C25263co();
            case 5:
                return f68730a;
            case 6:
                C63010eb ebVar = f68731b;
                if (ebVar == null) {
                    synchronized (C25264cp.class) {
                        ebVar = f68731b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f68730a);
                            f68731b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
