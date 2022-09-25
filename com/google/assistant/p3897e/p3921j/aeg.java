package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.aeg */
/* compiled from: PG */
public final class aeg extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final aeg f134932a;

    /* renamed from: b */
    private static volatile C63010eb f134933b;

    static {
        aeg aeg = new aeg();
        f134932a = aeg;
        C62942bv.registerDefaultInstance(aeg.class, aeg);
    }

    private aeg() {
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
                return newMessageInfo(f134932a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new aeg();
            case 4:
                return new aef();
            case 5:
                return f134932a;
            case 6:
                C63010eb ebVar = f134933b;
                if (ebVar == null) {
                    synchronized (aeg.class) {
                        ebVar = f134933b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134932a);
                            f134933b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
