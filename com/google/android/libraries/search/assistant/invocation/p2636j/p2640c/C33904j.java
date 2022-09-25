package com.google.android.libraries.search.assistant.invocation.p2636j.p2640c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.j.c.j */
/* compiled from: PG */
public final class C33904j extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C33904j f90447a;

    /* renamed from: b */
    private static volatile C63010eb f90448b;

    static {
        C33904j jVar = new C33904j();
        f90447a = jVar;
        C62942bv.registerDefaultInstance(C33904j.class, jVar);
    }

    private C33904j() {
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
                return newMessageInfo(f90447a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C33904j();
            case 4:
                return new C33903i();
            case 5:
                return f90447a;
            case 6:
                C63010eb ebVar = f90448b;
                if (ebVar == null) {
                    synchronized (C33904j.class) {
                        ebVar = f90448b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90447a);
                            f90448b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
