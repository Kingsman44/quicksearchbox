package com.google.assistant.p3897e.p3902c.p3907c;

import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.dq */
/* compiled from: PG */
public final class C51026dq extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C51026dq f132849b;

    /* renamed from: c */
    private static volatile C63010eb f132850c;

    /* renamed from: a */
    public C62971cq f132851a = emptyProtobufList();

    static {
        C51026dq dqVar = new C51026dq();
        f132849b = dqVar;
        C62942bv.registerDefaultInstance(C51026dq.class, dqVar);
    }

    private C51026dq() {
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
                return newMessageInfo(f132849b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C51809dy.class});
            case 3:
                return new C51026dq();
            case 4:
                return new C51025dp();
            case 5:
                return f132849b;
            case 6:
                C63010eb ebVar = f132850c;
                if (ebVar == null) {
                    synchronized (C51026dq.class) {
                        ebVar = f132850c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132849b);
                            f132850c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
