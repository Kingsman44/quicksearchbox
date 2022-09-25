package com.google.assistant.p3825an.p3830c.p3831a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.an.c.a.bv */
/* compiled from: PG */
public final class C49303bv extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49303bv f127431b;

    /* renamed from: c */
    private static volatile C63010eb f127432c;

    /* renamed from: a */
    public C62971cq f127433a = emptyProtobufList();

    static {
        C49303bv bvVar = new C49303bv();
        f127431b = bvVar;
        C62942bv.registerDefaultInstance(C49303bv.class, bvVar);
    }

    private C49303bv() {
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
                return newMessageInfo(f127431b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C49301bt.class});
            case 3:
                return new C49303bv();
            case 4:
                return new C49302bu();
            case 5:
                return f127431b;
            case 6:
                C63010eb ebVar = f127432c;
                if (ebVar == null) {
                    synchronized (C49303bv.class) {
                        ebVar = f127432c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127431b);
                            f127432c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
