package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.qx */
/* compiled from: PG */
public final class C52415qx extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C52415qx f137537b;

    /* renamed from: c */
    private static volatile C63010eb f137538c;

    /* renamed from: a */
    public C62971cq f137539a = C62942bv.emptyProtobufList();

    static {
        C52415qx qxVar = new C52415qx();
        f137537b = qxVar;
        C62942bv.registerDefaultInstance(C52415qx.class, qxVar);
    }

    private C52415qx() {
        emptyIntList();
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
                return newMessageInfo(f137537b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new C52415qx();
            case 4:
                return new C52414qw();
            case 5:
                return f137537b;
            case 6:
                C63010eb ebVar = f137538c;
                if (ebVar == null) {
                    synchronized (C52415qx.class) {
                        ebVar = f137538c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137537b);
                            f137538c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
