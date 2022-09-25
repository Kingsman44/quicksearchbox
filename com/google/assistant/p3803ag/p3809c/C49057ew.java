package com.google.assistant.p3803ag.p3809c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.ew */
/* compiled from: PG */
public final class C49057ew extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49057ew f126896b;

    /* renamed from: c */
    private static volatile C63010eb f126897c;

    /* renamed from: a */
    public C62971cq f126898a = emptyProtobufList();

    static {
        C49057ew ewVar = new C49057ew();
        f126896b = ewVar;
        C62942bv.registerDefaultInstance(C49057ew.class, ewVar);
    }

    private C49057ew() {
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
                return newMessageInfo(f126896b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C49055eu.class});
            case 3:
                return new C49057ew();
            case 4:
                return new C49056ev();
            case 5:
                return f126896b;
            case 6:
                C63010eb ebVar = f126897c;
                if (ebVar == null) {
                    synchronized (C49057ew.class) {
                        ebVar = f126897c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126896b);
                            f126897c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
