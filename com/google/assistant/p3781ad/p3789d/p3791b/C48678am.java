package com.google.assistant.p3781ad.p3789d.p3791b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.am */
/* compiled from: PG */
public final class C48678am extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48678am f125937b;

    /* renamed from: c */
    private static volatile C63010eb f125938c;

    /* renamed from: a */
    public C62971cq f125939a = emptyProtobufList();

    static {
        C48678am amVar = new C48678am();
        f125937b = amVar;
        C62942bv.registerDefaultInstance(C48678am.class, amVar);
    }

    private C48678am() {
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
                return newMessageInfo(f125937b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C48676ak.class});
            case 3:
                return new C48678am();
            case 4:
                return new C48677al();
            case 5:
                return f125937b;
            case 6:
                C63010eb ebVar = f125938c;
                if (ebVar == null) {
                    synchronized (C48678am.class) {
                        ebVar = f125938c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125937b);
                            f125938c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
