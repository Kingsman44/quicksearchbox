package com.google.p427am.p438d.p439a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.d.a.bn */
/* compiled from: PG */
public final class C8740bn extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8740bn f30080a;

    /* renamed from: b */
    private static volatile C63010eb f30081b;

    static {
        C8740bn bnVar = new C8740bn();
        f30080a = bnVar;
        C62942bv.registerDefaultInstance(C8740bn.class, bnVar);
    }

    private C8740bn() {
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
                return newMessageInfo(f30080a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C8740bn();
            case 4:
                return new C8739bm();
            case 5:
                return f30080a;
            case 6:
                C63010eb ebVar = f30081b;
                if (ebVar == null) {
                    synchronized (C8740bn.class) {
                        ebVar = f30081b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30080a);
                            f30081b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
