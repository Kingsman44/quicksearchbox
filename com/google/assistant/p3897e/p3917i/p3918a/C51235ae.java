package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.assistant.p3897e.p3902c.p3907c.C51117h;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.ae */
/* compiled from: PG */
public final class C51235ae extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C51235ae f133392b;

    /* renamed from: c */
    private static volatile C63010eb f133393c;

    /* renamed from: a */
    public C62971cq f133394a = emptyProtobufList();

    static {
        C51235ae aeVar = new C51235ae();
        f133392b = aeVar;
        C62942bv.registerDefaultInstance(C51235ae.class, aeVar);
    }

    private C51235ae() {
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
                return newMessageInfo(f133392b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C51117h.class});
            case 3:
                return new C51235ae();
            case 4:
                return new C51234ad();
            case 5:
                return f133392b;
            case 6:
                C63010eb ebVar = f133393c;
                if (ebVar == null) {
                    synchronized (C51235ae.class) {
                        ebVar = f133393c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133392b);
                            f133393c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
