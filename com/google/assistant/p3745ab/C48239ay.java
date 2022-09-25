package com.google.assistant.p3745ab;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.ay */
/* compiled from: PG */
public final class C48239ay extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48239ay f124795a;

    /* renamed from: b */
    private static volatile C63010eb f124796b;

    static {
        C48239ay ayVar = new C48239ay();
        f124795a = ayVar;
        C62942bv.registerDefaultInstance(C48239ay.class, ayVar);
    }

    private C48239ay() {
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
                return newMessageInfo(f124795a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C48239ay();
            case 4:
                return new C48238ax();
            case 5:
                return f124795a;
            case 6:
                C63010eb ebVar = f124796b;
                if (ebVar == null) {
                    synchronized (C48239ay.class) {
                        ebVar = f124796b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124795a);
                            f124796b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
