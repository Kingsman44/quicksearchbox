package com.google.assistant.p3803ag.p3809c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.cy */
/* compiled from: PG */
public final class C49005cy extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C49005cy f126761d;

    /* renamed from: e */
    private static volatile C63010eb f126762e;

    /* renamed from: a */
    public int f126763a;

    /* renamed from: b */
    public long f126764b;

    /* renamed from: c */
    public long f126765c;

    static {
        C49005cy cyVar = new C49005cy();
        f126761d = cyVar;
        C62942bv.registerDefaultInstance(C49005cy.class, cyVar);
    }

    private C49005cy() {
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
                return newMessageInfo(f126761d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C49005cy();
            case 4:
                return new C49004cx();
            case 5:
                return f126761d;
            case 6:
                C63010eb ebVar = f126762e;
                if (ebVar == null) {
                    synchronized (C49005cy.class) {
                        ebVar = f126762e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126761d);
                            f126762e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
