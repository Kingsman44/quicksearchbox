package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.x */
/* compiled from: PG */
public final class C52580x extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C52580x f138050a;

    /* renamed from: b */
    private static volatile C63010eb f138051b;

    static {
        C52580x xVar = new C52580x();
        f138050a = xVar;
        C62942bv.registerDefaultInstance(C52580x.class, xVar);
    }

    private C52580x() {
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
                return newMessageInfo(f138050a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C52580x();
            case 4:
                return new C52553w();
            case 5:
                return f138050a;
            case 6:
                C63010eb ebVar = f138051b;
                if (ebVar == null) {
                    synchronized (C52580x.class) {
                        ebVar = f138051b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138050a);
                            f138051b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
