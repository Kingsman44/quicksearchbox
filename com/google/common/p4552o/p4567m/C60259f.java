package com.google.common.p4552o.p4567m;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.m.f */
/* compiled from: PG */
public final class C60259f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C60259f f163033a;

    /* renamed from: b */
    private static volatile C63010eb f163034b;

    static {
        C60259f fVar = new C60259f();
        f163033a = fVar;
        C62942bv.registerDefaultInstance(C60259f.class, fVar);
    }

    private C60259f() {
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
                return newMessageInfo(f163033a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C60259f();
            case 4:
                return new C60258e();
            case 5:
                return f163033a;
            case 6:
                C63010eb ebVar = f163034b;
                if (ebVar == null) {
                    synchronized (C60259f.class) {
                        ebVar = f163034b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163033a);
                            f163034b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
