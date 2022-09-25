package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.yd */
/* compiled from: PG */
public final class C52611yd extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C52611yd f138135b;

    /* renamed from: c */
    private static volatile C63010eb f138136c;

    /* renamed from: a */
    public C62971cq f138137a = emptyProtobufList();

    static {
        C52611yd ydVar = new C52611yd();
        f138135b = ydVar;
        C62942bv.registerDefaultInstance(C52611yd.class, ydVar);
    }

    private C52611yd() {
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
                return newMessageInfo(f138135b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C52633yz.class});
            case 3:
                return new C52611yd();
            case 4:
                return new C52610yc();
            case 5:
                return f138135b;
            case 6:
                C63010eb ebVar = f138136c;
                if (ebVar == null) {
                    synchronized (C52611yd.class) {
                        ebVar = f138136c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138135b);
                            f138136c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
