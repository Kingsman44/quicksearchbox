package com.google.assistant.p3897e.p3929l.p3930a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.l.a.dw */
/* compiled from: PG */
public final class C52771dw extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C52771dw f138467a;

    /* renamed from: b */
    private static volatile C63010eb f138468b;

    static {
        C52771dw dwVar = new C52771dw();
        f138467a = dwVar;
        C62942bv.registerDefaultInstance(C52771dw.class, dwVar);
    }

    private C52771dw() {
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
                return newMessageInfo(f138467a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C52771dw();
            case 4:
                return new C52770dv();
            case 5:
                return f138467a;
            case 6:
                C63010eb ebVar = f138468b;
                if (ebVar == null) {
                    synchronized (C52771dw.class) {
                        ebVar = f138468b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138467a);
                            f138468b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
