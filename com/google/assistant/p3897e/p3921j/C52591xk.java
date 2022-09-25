package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

@Deprecated
/* renamed from: com.google.assistant.e.j.xk */
/* compiled from: PG */
public final class C52591xk extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C52591xk f138094b;

    /* renamed from: c */
    private static volatile C63010eb f138095c;

    /* renamed from: a */
    public C62971cq f138096a = emptyProtobufList();

    static {
        C52591xk xkVar = new C52591xk();
        f138094b = xkVar;
        C62942bv.registerDefaultInstance(C52591xk.class, xkVar);
    }

    private C52591xk() {
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
                return newMessageInfo(f138094b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C52585xe.class});
            case 3:
                return new C52591xk();
            case 4:
                return new C52590xj();
            case 5:
                return f138094b;
            case 6:
                C63010eb ebVar = f138095c;
                if (ebVar == null) {
                    synchronized (C52591xk.class) {
                        ebVar = f138095c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138094b);
                            f138095c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
