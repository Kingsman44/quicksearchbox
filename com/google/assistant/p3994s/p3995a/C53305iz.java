package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.iz */
/* compiled from: PG */
public final class C53305iz extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53305iz f139741a;

    /* renamed from: b */
    private static volatile C63010eb f139742b;

    static {
        C53305iz izVar = new C53305iz();
        f139741a = izVar;
        C62942bv.registerDefaultInstance(C53305iz.class, izVar);
    }

    private C53305iz() {
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
                return newMessageInfo(f139741a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53305iz();
            case 4:
                return new C53304iy();
            case 5:
                return f139741a;
            case 6:
                C63010eb ebVar = f139742b;
                if (ebVar == null) {
                    synchronized (C53305iz.class) {
                        ebVar = f139742b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139741a);
                            f139742b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
