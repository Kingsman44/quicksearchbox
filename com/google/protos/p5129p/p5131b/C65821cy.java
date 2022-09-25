package com.google.protos.p5129p.p5131b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.p.b.cy */
/* compiled from: PG */
public final class C65821cy extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65821cy f178937c;

    /* renamed from: d */
    private static volatile C63010eb f178938d;

    /* renamed from: a */
    public int f178939a;

    /* renamed from: b */
    public boolean f178940b;

    static {
        C65821cy cyVar = new C65821cy();
        f178937c = cyVar;
        C62942bv.registerDefaultInstance(C65821cy.class, cyVar);
    }

    private C65821cy() {
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
                return newMessageInfo(f178937c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C65821cy();
            case 4:
                return new C65820cx();
            case 5:
                return f178937c;
            case 6:
                C63010eb ebVar = f178938d;
                if (ebVar == null) {
                    synchronized (C65821cy.class) {
                        ebVar = f178938d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178937c);
                            f178938d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
