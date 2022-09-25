package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.fj */
/* compiled from: PG */
public final class C53208fj extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53208fj f139463a;

    /* renamed from: b */
    private static volatile C63010eb f139464b;

    static {
        C53208fj fjVar = new C53208fj();
        f139463a = fjVar;
        C62942bv.registerDefaultInstance(C53208fj.class, fjVar);
    }

    private C53208fj() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f139463a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53208fj();
            case 4:
                return new C53207fi();
            case 5:
                return f139463a;
            case 6:
                C63010eb ebVar = f139464b;
                if (ebVar == null) {
                    synchronized (C53208fj.class) {
                        ebVar = f139464b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139463a);
                            f139464b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
