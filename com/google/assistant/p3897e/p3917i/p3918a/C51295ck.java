package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.ck */
/* compiled from: PG */
public final class C51295ck extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C51295ck f133530b;

    /* renamed from: c */
    private static volatile C63010eb f133531c;

    /* renamed from: a */
    public C62971cq f133532a = emptyProtobufList();

    static {
        C51295ck ckVar = new C51295ck();
        f133530b = ckVar;
        C62942bv.registerDefaultInstance(C51295ck.class, ckVar);
    }

    private C51295ck() {
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
                return newMessageInfo(f133530b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C51293ci.class});
            case 3:
                return new C51295ck();
            case 4:
                return new C51294cj();
            case 5:
                return f133530b;
            case 6:
                C63010eb ebVar = f133531c;
                if (ebVar == null) {
                    synchronized (C51295ck.class) {
                        ebVar = f133531c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133530b);
                            f133531c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
