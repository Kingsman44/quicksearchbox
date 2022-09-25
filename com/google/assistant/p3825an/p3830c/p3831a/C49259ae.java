package com.google.assistant.p3825an.p3830c.p3831a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.an.c.a.ae */
/* compiled from: PG */
public final class C49259ae extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49259ae f127331b;

    /* renamed from: c */
    private static volatile C63010eb f127332c;

    /* renamed from: a */
    public C62971cq f127333a = emptyProtobufList();

    static {
        C49259ae aeVar = new C49259ae();
        f127331b = aeVar;
        C62942bv.registerDefaultInstance(C49259ae.class, aeVar);
    }

    private C49259ae() {
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
                return newMessageInfo(f127331b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C49257ac.class});
            case 3:
                return new C49259ae();
            case 4:
                return new C49258ad();
            case 5:
                return f127331b;
            case 6:
                C63010eb ebVar = f127332c;
                if (ebVar == null) {
                    synchronized (C49259ae.class) {
                        ebVar = f127332c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127331b);
                            f127332c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
