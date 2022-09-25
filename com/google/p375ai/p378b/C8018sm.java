package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.sm */
/* compiled from: PG */
public final class C8018sm extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C8018sm f28151b;

    /* renamed from: c */
    private static volatile C63010eb f28152c;

    /* renamed from: a */
    public C62971cq f28153a = emptyProtobufList();

    static {
        C8018sm smVar = new C8018sm();
        f28151b = smVar;
        C62942bv.registerDefaultInstance(C8018sm.class, smVar);
    }

    private C8018sm() {
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
                return newMessageInfo(f28151b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C7818lb.class});
            case 3:
                return new C8018sm();
            case 4:
                return new C8017sl();
            case 5:
                return f28151b;
            case 6:
                C63010eb ebVar = f28152c;
                if (ebVar == null) {
                    synchronized (C8018sm.class) {
                        ebVar = f28152c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28151b);
                            f28152c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
