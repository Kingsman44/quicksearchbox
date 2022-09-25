package com.google.assistant.p3897e.p3929l.p3930a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.l.a.cy */
/* compiled from: PG */
public final class C52746cy extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C52746cy f138419a;

    /* renamed from: b */
    private static volatile C63010eb f138420b;

    static {
        C52746cy cyVar = new C52746cy();
        f138419a = cyVar;
        C62942bv.registerDefaultInstance(C52746cy.class, cyVar);
    }

    private C52746cy() {
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
                return newMessageInfo(f138419a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C52746cy();
            case 4:
                return new C52745cx();
            case 5:
                return f138419a;
            case 6:
                C63010eb ebVar = f138420b;
                if (ebVar == null) {
                    synchronized (C52746cy.class) {
                        ebVar = f138420b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138419a);
                            f138420b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
