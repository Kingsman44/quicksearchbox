package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.uh */
/* compiled from: PG */
public final class C52507uh extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C52507uh f137838b;

    /* renamed from: c */
    private static volatile C63010eb f137839c;

    /* renamed from: a */
    public C62971cq f137840a = emptyProtobufList();

    static {
        C52507uh uhVar = new C52507uh();
        f137838b = uhVar;
        C62942bv.registerDefaultInstance(C52507uh.class, uhVar);
    }

    private C52507uh() {
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
                return newMessageInfo(f137838b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C52490tr.class});
            case 3:
                return new C52507uh();
            case 4:
                return new C52506ug();
            case 5:
                return f137838b;
            case 6:
                C63010eb ebVar = f137839c;
                if (ebVar == null) {
                    synchronized (C52507uh.class) {
                        ebVar = f137839c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137838b);
                            f137839c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
