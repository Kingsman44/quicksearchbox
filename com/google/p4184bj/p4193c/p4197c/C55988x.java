package com.google.p4184bj.p4193c.p4197c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bj.c.c.x */
/* compiled from: PG */
public final class C55988x extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C55988x f149098a;

    /* renamed from: b */
    private static volatile C63010eb f149099b;

    static {
        C55988x xVar = new C55988x();
        f149098a = xVar;
        C62942bv.registerDefaultInstance(C55988x.class, xVar);
    }

    private C55988x() {
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
                return newMessageInfo(f149098a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C55988x();
            case 4:
                return new C55987w();
            case 5:
                return f149098a;
            case 6:
                C63010eb ebVar = f149099b;
                if (ebVar == null) {
                    synchronized (C55988x.class) {
                        ebVar = f149099b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149098a);
                            f149099b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
