package com.google.p4017at.p4056g.p4057a.p4058a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.g.a.a.cg */
/* compiled from: PG */
public final class C54026cg extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C54026cg f141750a;

    /* renamed from: b */
    private static volatile C63010eb f141751b;

    static {
        C54026cg cgVar = new C54026cg();
        f141750a = cgVar;
        C62942bv.registerDefaultInstance(C54026cg.class, cgVar);
    }

    private C54026cg() {
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
                return newMessageInfo(f141750a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C54026cg();
            case 4:
                return new C54025cf();
            case 5:
                return f141750a;
            case 6:
                C63010eb ebVar = f141751b;
                if (ebVar == null) {
                    synchronized (C54026cg.class) {
                        ebVar = f141751b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141750a);
                            f141751b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
