package com.google.p427am.p438d.p439a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.d.a.d */
/* compiled from: PG */
public final class C8780d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8780d f30150a;

    /* renamed from: b */
    private static volatile C63010eb f30151b;

    static {
        C8780d dVar = new C8780d();
        f30150a = dVar;
        C62942bv.registerDefaultInstance(C8780d.class, dVar);
    }

    private C8780d() {
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
                return newMessageInfo(f30150a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C8780d();
            case 4:
                return new C8753c();
            case 5:
                return f30150a;
            case 6:
                C63010eb ebVar = f30151b;
                if (ebVar == null) {
                    synchronized (C8780d.class) {
                        ebVar = f30151b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30150a);
                            f30151b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
