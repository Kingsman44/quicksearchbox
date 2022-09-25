package com.google.android.libraries.search.assistant.invocation.assistdata.p2596b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.assistdata.b.l */
/* compiled from: PG */
public final class C33538l extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C33538l f89705a;

    /* renamed from: b */
    private static volatile C63010eb f89706b;

    static {
        C33538l lVar = new C33538l();
        f89705a = lVar;
        C62942bv.registerDefaultInstance(C33538l.class, lVar);
    }

    private C33538l() {
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
                return newMessageInfo(f89705a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C33538l();
            case 4:
                return new C33537k();
            case 5:
                return f89705a;
            case 6:
                C63010eb ebVar = f89706b;
                if (ebVar == null) {
                    synchronized (C33538l.class) {
                        ebVar = f89706b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f89705a);
                            f89706b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
