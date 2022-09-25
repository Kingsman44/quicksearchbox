package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.un */
/* compiled from: PG */
public final class C52513un extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C52513un f137850b;

    /* renamed from: c */
    private static volatile C63010eb f137851c;

    /* renamed from: a */
    public C62971cq f137852a = emptyProtobufList();

    static {
        C52513un unVar = new C52513un();
        f137850b = unVar;
        C62942bv.registerDefaultInstance(C52513un.class, unVar);
    }

    private C52513un() {
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
                return newMessageInfo(f137850b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C52512um.class});
            case 3:
                return new C52513un();
            case 4:
                return new C52510uk();
            case 5:
                return f137850b;
            case 6:
                C63010eb ebVar = f137851c;
                if (ebVar == null) {
                    synchronized (C52513un.class) {
                        ebVar = f137851c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137850b);
                            f137851c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
