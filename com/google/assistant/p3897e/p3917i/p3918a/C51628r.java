package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.assistant.p3931f.p3939c.C52825b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.r */
/* compiled from: PG */
public final class C51628r extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C51628r f134549b;

    /* renamed from: c */
    private static volatile C63010eb f134550c;

    /* renamed from: a */
    public C62971cq f134551a = emptyProtobufList();

    static {
        C51628r rVar = new C51628r();
        f134549b = rVar;
        C62942bv.registerDefaultInstance(C51628r.class, rVar);
    }

    private C51628r() {
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
                return newMessageInfo(f134549b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C52825b.class});
            case 3:
                return new C51628r();
            case 4:
                return new C51627q();
            case 5:
                return f134549b;
            case 6:
                C63010eb ebVar = f134550c;
                if (ebVar == null) {
                    synchronized (C51628r.class) {
                        ebVar = f134550c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134549b);
                            f134550c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
