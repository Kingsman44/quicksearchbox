package com.google.android.libraries.search.assistant.invocation.p2655o.p2662e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.e.d */
/* compiled from: PG */
public final class C34193d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C34193d f91011a;

    /* renamed from: b */
    private static volatile C63010eb f91012b;

    static {
        C34193d dVar = new C34193d();
        f91011a = dVar;
        C62942bv.registerDefaultInstance(C34193d.class, dVar);
    }

    private C34193d() {
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
                return newMessageInfo(f91011a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C34193d();
            case 4:
                return new C34192c();
            case 5:
                return f91011a;
            case 6:
                C63010eb ebVar = f91012b;
                if (ebVar == null) {
                    synchronized (C34193d.class) {
                        ebVar = f91012b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f91011a);
                            f91012b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
