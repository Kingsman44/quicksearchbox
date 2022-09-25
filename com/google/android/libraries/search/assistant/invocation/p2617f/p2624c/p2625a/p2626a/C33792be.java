package com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.f.c.a.a.be */
/* compiled from: PG */
public final class C33792be extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C33792be f90243a;

    /* renamed from: b */
    private static volatile C63010eb f90244b;

    static {
        C33792be beVar = new C33792be();
        f90243a = beVar;
        C62942bv.registerDefaultInstance(C33792be.class, beVar);
    }

    private C33792be() {
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
                return newMessageInfo(f90243a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C33792be();
            case 4:
                return new C33791bd();
            case 5:
                return f90243a;
            case 6:
                C63010eb ebVar = f90244b;
                if (ebVar == null) {
                    synchronized (C33792be.class) {
                        ebVar = f90244b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90243a);
                            f90244b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
