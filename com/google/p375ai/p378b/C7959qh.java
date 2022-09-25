package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.qh */
/* compiled from: PG */
public final class C7959qh extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C7959qh f27962a;

    /* renamed from: b */
    private static volatile C63010eb f27963b;

    static {
        C7959qh qhVar = new C7959qh();
        f27962a = qhVar;
        C62942bv.registerDefaultInstance(C7959qh.class, qhVar);
    }

    private C7959qh() {
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
                return newMessageInfo(f27962a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C7959qh();
            case 4:
                return new C7958qg();
            case 5:
                return f27962a;
            case 6:
                C63010eb ebVar = f27963b;
                if (ebVar == null) {
                    synchronized (C7959qh.class) {
                        ebVar = f27963b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27962a);
                            f27963b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
