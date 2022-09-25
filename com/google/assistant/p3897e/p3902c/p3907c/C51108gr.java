package com.google.assistant.p3897e.p3902c.p3907c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.gr */
/* compiled from: PG */
public final class C51108gr extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C51108gr f133027a;

    /* renamed from: b */
    private static volatile C63010eb f133028b;

    static {
        C51108gr grVar = new C51108gr();
        f133027a = grVar;
        C62942bv.registerDefaultInstance(C51108gr.class, grVar);
    }

    private C51108gr() {
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
                return newMessageInfo(f133027a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C51108gr();
            case 4:
                return new C51107gq();
            case 5:
                return f133027a;
            case 6:
                C63010eb ebVar = f133028b;
                if (ebVar == null) {
                    synchronized (C51108gr.class) {
                        ebVar = f133028b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133027a);
                            f133028b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
