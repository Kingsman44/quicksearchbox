package com.google.speech.p5208h;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.h.ec */
/* compiled from: PG */
public final class C66663ec extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66663ec f181340c;

    /* renamed from: e */
    private static volatile C63010eb f181341e;

    /* renamed from: a */
    public int f181342a = 0;

    /* renamed from: b */
    public Object f181343b;

    /* renamed from: d */
    private byte f181344d = 2;

    static {
        C66663ec ecVar = new C66663ec();
        f181340c = ecVar;
        C62942bv.registerDefaultInstance(C66663ec.class, ecVar);
    }

    private C66663ec() {
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f181344d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f181344d = b;
                return null;
            case 2:
                return newMessageInfo(f181340c, "\u0001\u0004\u0001\u0000\u0001\u0014\u0004\u0000\u0000\u0000\u0001ြ\u0000\u0003ြ\u0000\u0006ြ\u0000\u0014ဴ\u0000", new Object[]{"b", "a", C66661ea.class, C66665ee.class, C66658dy.class});
            case 3:
                return new C66663ec();
            case 4:
                return new C66662eb();
            case 5:
                return f181340c;
            case 6:
                C63010eb ebVar = f181341e;
                if (ebVar == null) {
                    synchronized (C66663ec.class) {
                        ebVar = f181341e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181340c);
                            f181341e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
