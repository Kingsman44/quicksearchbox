package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.jh */
/* compiled from: PG */
public final class C53314jh extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53314jh f139809a;

    /* renamed from: b */
    private static volatile C63010eb f139810b;

    static {
        C53314jh jhVar = new C53314jh();
        f139809a = jhVar;
        C62942bv.registerDefaultInstance(C53314jh.class, jhVar);
    }

    private C53314jh() {
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
                return newMessageInfo(f139809a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53314jh();
            case 4:
                return new C53313jg();
            case 5:
                return f139809a;
            case 6:
                C63010eb ebVar = f139810b;
                if (ebVar == null) {
                    synchronized (C53314jh.class) {
                        ebVar = f139810b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139809a);
                            f139810b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
