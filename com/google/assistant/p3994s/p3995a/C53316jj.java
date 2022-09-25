package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.jj */
/* compiled from: PG */
public final class C53316jj extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53316jj f139811a;

    /* renamed from: b */
    private static volatile C63010eb f139812b;

    static {
        C53316jj jjVar = new C53316jj();
        f139811a = jjVar;
        C62942bv.registerDefaultInstance(C53316jj.class, jjVar);
    }

    private C53316jj() {
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
                return newMessageInfo(f139811a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53316jj();
            case 4:
                return new C53315ji();
            case 5:
                return f139811a;
            case 6:
                C63010eb ebVar = f139812b;
                if (ebVar == null) {
                    synchronized (C53316jj.class) {
                        ebVar = f139812b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139811a);
                            f139812b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
