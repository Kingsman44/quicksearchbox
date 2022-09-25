package com.google.assistant.p3803ag.p3809c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.cg */
/* compiled from: PG */
public final class C48987cg extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48987cg f126728a;

    /* renamed from: b */
    private static volatile C63010eb f126729b;

    static {
        C48987cg cgVar = new C48987cg();
        f126728a = cgVar;
        C62942bv.registerDefaultInstance(C48987cg.class, cgVar);
    }

    private C48987cg() {
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
                return newMessageInfo(f126728a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C48987cg();
            case 4:
                return new C48986cf();
            case 5:
                return f126728a;
            case 6:
                C63010eb ebVar = f126729b;
                if (ebVar == null) {
                    synchronized (C48987cg.class) {
                        ebVar = f126729b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126728a);
                            f126729b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
