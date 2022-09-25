package com.google.android.libraries.search.assistant.invocation.p2655o.p2656a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.a.ar */
/* compiled from: PG */
public final class C34028ar extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C34028ar f90682a;

    /* renamed from: b */
    private static volatile C63010eb f90683b;

    static {
        C34028ar arVar = new C34028ar();
        f90682a = arVar;
        C62942bv.registerDefaultInstance(C34028ar.class, arVar);
    }

    private C34028ar() {
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
                return newMessageInfo(f90682a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C34028ar();
            case 4:
                return new C34027aq();
            case 5:
                return f90682a;
            case 6:
                C63010eb ebVar = f90683b;
                if (ebVar == null) {
                    synchronized (C34028ar.class) {
                        ebVar = f90683b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90682a);
                            f90683b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
