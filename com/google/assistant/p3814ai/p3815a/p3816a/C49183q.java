package com.google.assistant.p3814ai.p3815a.p3816a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ai.a.a.q */
/* compiled from: PG */
public final class C49183q extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49183q f127167b;

    /* renamed from: c */
    private static volatile C63010eb f127168c;

    /* renamed from: a */
    public C62971cq f127169a = emptyProtobufList();

    static {
        C49183q qVar = new C49183q();
        f127167b = qVar;
        C62942bv.registerDefaultInstance(C49183q.class, qVar);
    }

    private C49183q() {
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
                return newMessageInfo(f127167b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C49170d.class});
            case 3:
                return new C49183q();
            case 4:
                return new C49182p();
            case 5:
                return f127167b;
            case 6:
                C63010eb ebVar = f127168c;
                if (ebVar == null) {
                    synchronized (C49183q.class) {
                        ebVar = f127168c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127167b);
                            f127168c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
