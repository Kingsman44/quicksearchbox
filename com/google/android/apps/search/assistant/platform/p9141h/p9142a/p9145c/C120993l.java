package com.google.android.apps.search.assistant.platform.p9141h.p9142a.p9145c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.h.a.c.l */
/* compiled from: PG */
public final class C120993l extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C120993l f336356a;

    /* renamed from: b */
    private static volatile C63010eb f336357b;

    static {
        C120993l lVar = new C120993l();
        f336356a = lVar;
        C62942bv.registerDefaultInstance(C120993l.class, lVar);
    }

    private C120993l() {
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
                return newMessageInfo(f336356a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C120993l();
            case 4:
                return new C120992k();
            case 5:
                return f336356a;
            case 6:
                C63010eb ebVar = f336357b;
                if (ebVar == null) {
                    synchronized (C120993l.class) {
                        ebVar = f336357b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f336356a);
                            f336357b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
