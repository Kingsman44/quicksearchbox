package com.google.android.libraries.search.assistant.invocation.p2655o.p2656a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.a.m */
/* compiled from: PG */
public final class C34104m extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C34104m f90838a;

    /* renamed from: b */
    private static volatile C63010eb f90839b;

    static {
        C34104m mVar = new C34104m();
        f90838a = mVar;
        C62942bv.registerDefaultInstance(C34104m.class, mVar);
    }

    private C34104m() {
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
                return newMessageInfo(f90838a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C34104m();
            case 4:
                return new C34103l();
            case 5:
                return f90838a;
            case 6:
                C63010eb ebVar = f90839b;
                if (ebVar == null) {
                    synchronized (C34104m.class) {
                        ebVar = f90839b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90838a);
                            f90839b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
