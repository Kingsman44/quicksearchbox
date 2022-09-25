package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.bm */
/* compiled from: PG */
public final class C49855bm extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49855bm f129559b;

    /* renamed from: c */
    private static volatile C63010eb f129560c;

    /* renamed from: a */
    public C62971cq f129561a = emptyProtobufList();

    static {
        C49855bm bmVar = new C49855bm();
        f129559b = bmVar;
        C62942bv.registerDefaultInstance(C49855bm.class, bmVar);
    }

    private C49855bm() {
        emptyProtobufList();
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
                return newMessageInfo(f129559b, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u001b", new Object[]{"a", C49836au.class});
            case 3:
                return new C49855bm();
            case 4:
                return new C49854bl();
            case 5:
                return f129559b;
            case 6:
                C63010eb ebVar = f129560c;
                if (ebVar == null) {
                    synchronized (C49855bm.class) {
                        ebVar = f129560c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129559b);
                            f129560c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
