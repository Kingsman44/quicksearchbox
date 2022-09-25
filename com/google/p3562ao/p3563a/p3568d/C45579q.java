package com.google.p3562ao.p3563a.p3568d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ao.a.d.q */
/* compiled from: PG */
public final class C45579q extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C45579q f119119a;

    /* renamed from: b */
    private static volatile C63010eb f119120b;

    static {
        C45579q qVar = new C45579q();
        f119119a = qVar;
        C62942bv.registerDefaultInstance(C45579q.class, qVar);
    }

    private C45579q() {
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
                return newMessageInfo(f119119a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C45579q();
            case 4:
                return new C45578p();
            case 5:
                return f119119a;
            case 6:
                C63010eb ebVar = f119120b;
                if (ebVar == null) {
                    synchronized (C45579q.class) {
                        ebVar = f119120b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f119119a);
                            f119120b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
