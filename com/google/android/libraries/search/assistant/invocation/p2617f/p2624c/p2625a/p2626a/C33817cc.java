package com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.f.c.a.a.cc */
/* compiled from: PG */
public final class C33817cc extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C33817cc f90273a;

    /* renamed from: b */
    private static volatile C63010eb f90274b;

    static {
        C33817cc ccVar = new C33817cc();
        f90273a = ccVar;
        C62942bv.registerDefaultInstance(C33817cc.class, ccVar);
    }

    private C33817cc() {
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
                return newMessageInfo(f90273a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C33817cc();
            case 4:
                return new C33816cb();
            case 5:
                return f90273a;
            case 6:
                C63010eb ebVar = f90274b;
                if (ebVar == null) {
                    synchronized (C33817cc.class) {
                        ebVar = f90274b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90273a);
                            f90274b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
