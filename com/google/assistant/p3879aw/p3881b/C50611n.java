package com.google.assistant.p3879aw.p3881b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.aw.b.n */
/* compiled from: PG */
public final class C50611n extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50611n f131679b;

    /* renamed from: c */
    private static volatile C63010eb f131680c;

    /* renamed from: a */
    public C62971cq f131681a = emptyProtobufList();

    static {
        C50611n nVar = new C50611n();
        f131679b = nVar;
        C62942bv.registerDefaultInstance(C50611n.class, nVar);
    }

    private C50611n() {
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
                return newMessageInfo(f131679b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", C50609l.class});
            case 3:
                return new C50611n();
            case 4:
                return new C50610m();
            case 5:
                return f131679b;
            case 6:
                C63010eb ebVar = f131680c;
                if (ebVar == null) {
                    synchronized (C50611n.class) {
                        ebVar = f131680c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131679b);
                            f131680c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
