package com.google.assistant.p3793ae.p3794a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ae.a.f */
/* compiled from: PG */
public final class C48774f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48774f f126206b;

    /* renamed from: c */
    private static volatile C63010eb f126207c;

    /* renamed from: a */
    public C62971cq f126208a = emptyProtobufList();

    static {
        C48774f fVar = new C48774f();
        f126206b = fVar;
        C62942bv.registerDefaultInstance(C48774f.class, fVar);
    }

    private C48774f() {
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
                return newMessageInfo(f126206b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C48773e.class});
            case 3:
                return new C48774f();
            case 4:
                return new C48771c();
            case 5:
                return f126206b;
            case 6:
                C63010eb ebVar = f126207c;
                if (ebVar == null) {
                    synchronized (C48774f.class) {
                        ebVar = f126207c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126206b);
                            f126207c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
