package com.google.android.libraries.search.assistant.p2486aa.p2492c.p2496c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.aa.c.c.l */
/* compiled from: PG */
public final class C32343l extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C32343l f86689a;

    /* renamed from: b */
    private static volatile C63010eb f86690b;

    static {
        C32343l lVar = new C32343l();
        f86689a = lVar;
        C62942bv.registerDefaultInstance(C32343l.class, lVar);
    }

    private C32343l() {
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
                return newMessageInfo(f86689a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C32343l();
            case 4:
                return new C32342k();
            case 5:
                return f86689a;
            case 6:
                C63010eb ebVar = f86690b;
                if (ebVar == null) {
                    synchronized (C32343l.class) {
                        ebVar = f86690b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f86689a);
                            f86690b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
