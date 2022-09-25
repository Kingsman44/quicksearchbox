package com.google.assistant.p3860as;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.as.l */
/* compiled from: PG */
public final class C49798l extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49798l f128635b;

    /* renamed from: c */
    private static volatile C63010eb f128636c;

    /* renamed from: a */
    public C62971cq f128637a = emptyProtobufList();

    static {
        C49798l lVar = new C49798l();
        f128635b = lVar;
        C62942bv.registerDefaultInstance(C49798l.class, lVar);
    }

    private C49798l() {
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
                return newMessageInfo(f128635b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C49796j.class});
            case 3:
                return new C49798l();
            case 4:
                return new C49797k();
            case 5:
                return f128635b;
            case 6:
                C63010eb ebVar = f128636c;
                if (ebVar == null) {
                    synchronized (C49798l.class) {
                        ebVar = f128636c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128635b);
                            f128636c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
