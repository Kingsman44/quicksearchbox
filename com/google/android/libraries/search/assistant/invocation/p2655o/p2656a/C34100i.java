package com.google.android.libraries.search.assistant.invocation.p2655o.p2656a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.a.i */
/* compiled from: PG */
public final class C34100i extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C34100i f90835a;

    /* renamed from: b */
    private static volatile C63010eb f90836b;

    static {
        C34100i iVar = new C34100i();
        f90835a = iVar;
        C62942bv.registerDefaultInstance(C34100i.class, iVar);
    }

    private C34100i() {
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
                return newMessageInfo(f90835a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C34100i();
            case 4:
                return new C34099h();
            case 5:
                return f90835a;
            case 6:
                C63010eb ebVar = f90836b;
                if (ebVar == null) {
                    synchronized (C34100i.class) {
                        ebVar = f90836b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90835a);
                            f90836b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
