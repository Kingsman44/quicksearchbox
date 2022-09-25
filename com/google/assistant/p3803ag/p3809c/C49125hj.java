package com.google.assistant.p3803ag.p3809c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.hj */
/* compiled from: PG */
public final class C49125hj extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C49125hj f127050a;

    /* renamed from: b */
    private static volatile C63010eb f127051b;

    static {
        C49125hj hjVar = new C49125hj();
        f127050a = hjVar;
        C62942bv.registerDefaultInstance(C49125hj.class, hjVar);
    }

    private C49125hj() {
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
                return newMessageInfo(f127050a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C49125hj();
            case 4:
                return new C49124hi();
            case 5:
                return f127050a;
            case 6:
                C63010eb ebVar = f127051b;
                if (ebVar == null) {
                    synchronized (C49125hj.class) {
                        ebVar = f127051b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127050a);
                            f127051b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
