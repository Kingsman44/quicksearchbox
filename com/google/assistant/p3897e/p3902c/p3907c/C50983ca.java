package com.google.assistant.p3897e.p3902c.p3907c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.ca */
/* compiled from: PG */
public final class C50983ca extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50983ca f132732b;

    /* renamed from: c */
    private static volatile C63010eb f132733c;

    /* renamed from: a */
    public C62971cq f132734a = emptyProtobufList();

    static {
        C50983ca caVar = new C50983ca();
        f132732b = caVar;
        C62942bv.registerDefaultInstance(C50983ca.class, caVar);
    }

    private C50983ca() {
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
                return newMessageInfo(f132732b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C51001cs.class});
            case 3:
                return new C50983ca();
            case 4:
                return new C50981bz();
            case 5:
                return f132732b;
            case 6:
                C63010eb ebVar = f132733c;
                if (ebVar == null) {
                    synchronized (C50983ca.class) {
                        ebVar = f132733c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132732b);
                            f132733c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
