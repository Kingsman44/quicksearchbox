package com.google.assistant.p3931f.p3939c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.f.c.ae */
/* compiled from: PG */
public final class C52815ae extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C52815ae f138574a;

    /* renamed from: b */
    private static volatile C63010eb f138575b;

    static {
        C52815ae aeVar = new C52815ae();
        f138574a = aeVar;
        C62942bv.registerDefaultInstance(C52815ae.class, aeVar);
    }

    private C52815ae() {
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
                return newMessageInfo(f138574a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C52815ae();
            case 4:
                return new C52814ad();
            case 5:
                return f138574a;
            case 6:
                C63010eb ebVar = f138575b;
                if (ebVar == null) {
                    synchronized (C52815ae.class) {
                        ebVar = f138575b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138574a);
                            f138575b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
