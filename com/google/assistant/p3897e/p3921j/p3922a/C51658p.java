package com.google.assistant.p3897e.p3921j.p3922a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.a.p */
/* compiled from: PG */
public final class C51658p extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C51658p f134603a;

    /* renamed from: b */
    private static volatile C63010eb f134604b;

    static {
        C51658p pVar = new C51658p();
        f134603a = pVar;
        C62942bv.registerDefaultInstance(C51658p.class, pVar);
    }

    private C51658p() {
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
                return newMessageInfo(f134603a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C51658p();
            case 4:
                return new C51657o();
            case 5:
                return f134603a;
            case 6:
                C63010eb ebVar = f134604b;
                if (ebVar == null) {
                    synchronized (C51658p.class) {
                        ebVar = f134604b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134603a);
                            f134604b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
