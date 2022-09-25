package com.google.assistant.p3803ag.p3809c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.dv */
/* compiled from: PG */
public final class C49029dv extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49029dv f126818b;

    /* renamed from: c */
    private static volatile C63010eb f126819c;

    /* renamed from: a */
    public C62971cq f126820a = emptyProtobufList();

    static {
        C49029dv dvVar = new C49029dv();
        f126818b = dvVar;
        C62942bv.registerDefaultInstance(C49029dv.class, dvVar);
    }

    private C49029dv() {
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
                return newMessageInfo(f126818b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C49023dp.class});
            case 3:
                return new C49029dv();
            case 4:
                return new C49028du();
            case 5:
                return f126818b;
            case 6:
                C63010eb ebVar = f126819c;
                if (ebVar == null) {
                    synchronized (C49029dv.class) {
                        ebVar = f126819c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126818b);
                            f126819c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
