package com.google.assistant.p3745ab;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.dq */
/* compiled from: PG */
public final class C48318dq extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48318dq f124960a;

    /* renamed from: b */
    private static volatile C63010eb f124961b;

    static {
        C48318dq dqVar = new C48318dq();
        f124960a = dqVar;
        C62942bv.registerDefaultInstance(C48318dq.class, dqVar);
    }

    private C48318dq() {
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
                return newMessageInfo(f124960a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C48318dq();
            case 4:
                return new C48317dp();
            case 5:
                return f124960a;
            case 6:
                C63010eb ebVar = f124961b;
                if (ebVar == null) {
                    synchronized (C48318dq.class) {
                        ebVar = f124961b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124960a);
                            f124961b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
