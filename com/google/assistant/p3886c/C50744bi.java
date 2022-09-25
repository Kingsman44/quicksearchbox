package com.google.assistant.p3886c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.c.bi */
/* compiled from: PG */
public final class C50744bi extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50744bi f132056b;

    /* renamed from: c */
    private static volatile C63010eb f132057c;

    /* renamed from: a */
    public C62971cq f132058a = emptyProtobufList();

    static {
        C50744bi biVar = new C50744bi();
        f132056b = biVar;
        C62942bv.registerDefaultInstance(C50744bi.class, biVar);
    }

    private C50744bi() {
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
                return newMessageInfo(f132056b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C50743bh.class});
            case 3:
                return new C50744bi();
            case 4:
                return new C50739bd();
            case 5:
                return f132056b;
            case 6:
                C63010eb ebVar = f132057c;
                if (ebVar == null) {
                    synchronized (C50744bi.class) {
                        ebVar = f132057c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132056b);
                            f132057c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
