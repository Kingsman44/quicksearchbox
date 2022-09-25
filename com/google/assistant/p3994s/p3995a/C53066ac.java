package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.ac */
/* compiled from: PG */
public final class C53066ac extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53066ac f139069a;

    /* renamed from: b */
    private static volatile C63010eb f139070b;

    static {
        C53066ac acVar = new C53066ac();
        f139069a = acVar;
        C62942bv.registerDefaultInstance(C53066ac.class, acVar);
    }

    private C53066ac() {
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
                return newMessageInfo(f139069a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53066ac();
            case 4:
                return new C53065ab();
            case 5:
                return f139069a;
            case 6:
                C63010eb ebVar = f139070b;
                if (ebVar == null) {
                    synchronized (C53066ac.class) {
                        ebVar = f139070b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139069a);
                            f139070b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
