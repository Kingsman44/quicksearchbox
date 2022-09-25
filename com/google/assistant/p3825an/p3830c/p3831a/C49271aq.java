package com.google.assistant.p3825an.p3830c.p3831a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.an.c.a.aq */
/* compiled from: PG */
public final class C49271aq extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49271aq f127363b;

    /* renamed from: c */
    private static volatile C63010eb f127364c;

    /* renamed from: a */
    public C62971cq f127365a = emptyProtobufList();

    static {
        C49271aq aqVar = new C49271aq();
        f127363b = aqVar;
        C62942bv.registerDefaultInstance(C49271aq.class, aqVar);
    }

    private C49271aq() {
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
                return newMessageInfo(f127363b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C49270ap.class});
            case 3:
                return new C49271aq();
            case 4:
                return new C49268an();
            case 5:
                return f127363b;
            case 6:
                C63010eb ebVar = f127364c;
                if (ebVar == null) {
                    synchronized (C49271aq.class) {
                        ebVar = f127364c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127363b);
                            f127364c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
