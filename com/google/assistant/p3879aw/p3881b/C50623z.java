package com.google.assistant.p3879aw.p3881b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.aw.b.z */
/* compiled from: PG */
public final class C50623z extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50623z f131700b;

    /* renamed from: c */
    private static volatile C63010eb f131701c;

    /* renamed from: a */
    public C62971cq f131702a = emptyProtobufList();

    static {
        C50623z zVar = new C50623z();
        f131700b = zVar;
        C62942bv.registerDefaultInstance(C50623z.class, zVar);
    }

    private C50623z() {
        emptyProtobufList();
        emptyIntList();
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
                return newMessageInfo(f131700b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", C50619v.class});
            case 3:
                return new C50623z();
            case 4:
                return new C50622y();
            case 5:
                return f131700b;
            case 6:
                C63010eb ebVar = f131701c;
                if (ebVar == null) {
                    synchronized (C50623z.class) {
                        ebVar = f131701c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131700b);
                            f131701c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
