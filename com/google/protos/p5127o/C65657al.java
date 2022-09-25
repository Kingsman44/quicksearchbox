package com.google.protos.p5127o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.o.al */
/* compiled from: PG */
public final class C65657al extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65657al f178404b;

    /* renamed from: c */
    private static volatile C63010eb f178405c;

    /* renamed from: a */
    public C62971cq f178406a = emptyProtobufList();

    static {
        C65657al alVar = new C65657al();
        f178404b = alVar;
        C62942bv.registerDefaultInstance(C65657al.class, alVar);
    }

    private C65657al() {
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
                return newMessageInfo(f178404b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C65686l.class});
            case 3:
                return new C65657al();
            case 4:
                return new C65656ak();
            case 5:
                return f178404b;
            case 6:
                C63010eb ebVar = f178405c;
                if (ebVar == null) {
                    synchronized (C65657al.class) {
                        ebVar = f178405c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178404b);
                            f178405c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
