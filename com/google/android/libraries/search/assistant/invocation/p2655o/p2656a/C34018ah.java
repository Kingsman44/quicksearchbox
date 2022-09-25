package com.google.android.libraries.search.assistant.invocation.p2655o.p2656a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.a.ah */
/* compiled from: PG */
public final class C34018ah extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C34018ah f90672a;

    /* renamed from: b */
    private static volatile C63010eb f90673b;

    static {
        C34018ah ahVar = new C34018ah();
        f90672a = ahVar;
        C62942bv.registerDefaultInstance(C34018ah.class, ahVar);
    }

    private C34018ah() {
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
                return newMessageInfo(f90672a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C34018ah();
            case 4:
                return new C34017ag();
            case 5:
                return f90672a;
            case 6:
                C63010eb ebVar = f90673b;
                if (ebVar == null) {
                    synchronized (C34018ah.class) {
                        ebVar = f90673b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90672a);
                            f90673b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
