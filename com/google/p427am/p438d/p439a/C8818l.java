package com.google.p427am.p438d.p439a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.d.a.l */
/* compiled from: PG */
public final class C8818l extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8818l f30199a;

    /* renamed from: b */
    private static volatile C63010eb f30200b;

    static {
        C8818l lVar = new C8818l();
        f30199a = lVar;
        C62942bv.registerDefaultInstance(C8818l.class, lVar);
    }

    private C8818l() {
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
                return newMessageInfo(f30199a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C8818l();
            case 4:
                return new C8817k();
            case 5:
                return f30199a;
            case 6:
                C63010eb ebVar = f30200b;
                if (ebVar == null) {
                    synchronized (C8818l.class) {
                        ebVar = f30200b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30199a);
                            f30200b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
