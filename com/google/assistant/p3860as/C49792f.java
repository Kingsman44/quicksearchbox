package com.google.assistant.p3860as;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.as.f */
/* compiled from: PG */
public final class C49792f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49792f f128579b;

    /* renamed from: c */
    private static volatile C63010eb f128580c;

    /* renamed from: a */
    public C62971cq f128581a = emptyProtobufList();

    static {
        C49792f fVar = new C49792f();
        f128579b = fVar;
        C62942bv.registerDefaultInstance(C49792f.class, fVar);
    }

    private C49792f() {
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
                return newMessageInfo(f128579b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C49790d.class});
            case 3:
                return new C49792f();
            case 4:
                return new C49791e();
            case 5:
                return f128579b;
            case 6:
                C63010eb ebVar = f128580c;
                if (ebVar == null) {
                    synchronized (C49792f.class) {
                        ebVar = f128580c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128579b);
                            f128580c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
