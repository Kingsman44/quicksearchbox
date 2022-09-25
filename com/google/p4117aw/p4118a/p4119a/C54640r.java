package com.google.p4117aw.p4118a.p4119a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.aw.a.a.r */
/* compiled from: PG */
public final class C54640r extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54640r f143458b;

    /* renamed from: c */
    private static volatile C63010eb f143459c;

    /* renamed from: a */
    public C62971cq f143460a = emptyProtobufList();

    static {
        C54640r rVar = new C54640r();
        f143458b = rVar;
        C62942bv.registerDefaultInstance(C54640r.class, rVar);
    }

    private C54640r() {
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
                return newMessageInfo(f143458b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C54639q.class});
            case 3:
                return new C54640r();
            case 4:
                return new C54637o();
            case 5:
                return f143458b;
            case 6:
                C63010eb ebVar = f143459c;
                if (ebVar == null) {
                    synchronized (C54640r.class) {
                        ebVar = f143459c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143458b);
                            f143459c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
