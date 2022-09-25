package com.google.p427am.p438d.p439a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.d.a.cn */
/* compiled from: PG */
public final class C8767cn extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8767cn f30129a;

    /* renamed from: b */
    private static volatile C63010eb f30130b;

    static {
        C8767cn cnVar = new C8767cn();
        f30129a = cnVar;
        C62942bv.registerDefaultInstance(C8767cn.class, cnVar);
    }

    private C8767cn() {
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
                return newMessageInfo(f30129a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C8767cn();
            case 4:
                return new C8766cm();
            case 5:
                return f30129a;
            case 6:
                C63010eb ebVar = f30130b;
                if (ebVar == null) {
                    synchronized (C8767cn.class) {
                        ebVar = f30130b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30129a);
                            f30130b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
