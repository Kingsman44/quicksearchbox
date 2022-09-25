package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.vx */
/* compiled from: PG */
public final class C52550vx extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C52550vx f137926b;

    /* renamed from: c */
    private static volatile C63010eb f137927c;

    /* renamed from: a */
    public C62971cq f137928a = emptyProtobufList();

    static {
        C52550vx vxVar = new C52550vx();
        f137926b = vxVar;
        C62942bv.registerDefaultInstance(C52550vx.class, vxVar);
    }

    private C52550vx() {
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
                return newMessageInfo(f137926b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C52549vw.class});
            case 3:
                return new C52550vx();
            case 4:
                return new C52547vu();
            case 5:
                return f137926b;
            case 6:
                C63010eb ebVar = f137927c;
                if (ebVar == null) {
                    synchronized (C52550vx.class) {
                        ebVar = f137927c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137926b);
                            f137927c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
