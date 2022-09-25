package com.google.assistant.p3739a.p3740a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.a.a.ci */
/* compiled from: PG */
public final class C48102ci extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48102ci f124501a;

    /* renamed from: b */
    private static volatile C63010eb f124502b;

    static {
        C48102ci ciVar = new C48102ci();
        f124501a = ciVar;
        C62942bv.registerDefaultInstance(C48102ci.class, ciVar);
    }

    private C48102ci() {
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
                return newMessageInfo(f124501a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C48102ci();
            case 4:
                return new C48101ch();
            case 5:
                return f124501a;
            case 6:
                C63010eb ebVar = f124502b;
                if (ebVar == null) {
                    synchronized (C48102ci.class) {
                        ebVar = f124502b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124501a);
                            f124502b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
