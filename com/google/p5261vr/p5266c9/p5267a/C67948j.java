package com.google.p5261vr.p5266c9.p5267a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.vr.c9.a.j */
/* compiled from: PG */
public final class C67948j extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C67948j f184147a;

    /* renamed from: b */
    private static volatile C63010eb f184148b;

    static {
        C67948j jVar = new C67948j();
        f184147a = jVar;
        C62942bv.registerDefaultInstance(C67948j.class, jVar);
    }

    private C67948j() {
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
                return newMessageInfo(f184147a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C67948j();
            case 4:
                return new C67947i();
            case 5:
                return f184147a;
            case 6:
                C63010eb ebVar = f184148b;
                if (ebVar == null) {
                    synchronized (C67948j.class) {
                        ebVar = f184148b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184147a);
                            f184148b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
