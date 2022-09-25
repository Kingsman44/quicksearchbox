package com.google.protos.youtube.elements;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.elements.cy */
/* compiled from: PG */
public final class C66180cy extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C66180cy f179956b;

    /* renamed from: d */
    private static volatile C63010eb f179957d;

    /* renamed from: a */
    public C62971cq f179958a = emptyProtobufList();

    /* renamed from: c */
    private byte f179959c = 2;

    static {
        C66180cy cyVar = new C66180cy();
        f179956b = cyVar;
        C62942bv.registerDefaultInstance(C66180cy.class, cyVar);
    }

    private C66180cy() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f179959c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f179959c = b;
                return null;
            case 2:
                return newMessageInfo(f179956b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C66187da.class});
            case 3:
                return new C66180cy();
            case 4:
                return new C66179cx();
            case 5:
                return f179956b;
            case 6:
                C63010eb ebVar = f179957d;
                if (ebVar == null) {
                    synchronized (C66180cy.class) {
                        ebVar = f179957d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179956b);
                            f179957d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
