package com.google.protos.p4895aw.p4902b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.b.ci */
/* compiled from: PG */
public final class C64026ci extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64026ci f173131a;

    /* renamed from: b */
    private static volatile C63010eb f173132b;

    static {
        C64026ci ciVar = new C64026ci();
        f173131a = ciVar;
        C62942bv.registerDefaultInstance(C64026ci.class, ciVar);
    }

    private C64026ci() {
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
                return newMessageInfo(f173131a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C64026ci();
            case 4:
                return new C64025ch();
            case 5:
                return f173131a;
            case 6:
                C63010eb ebVar = f173132b;
                if (ebVar == null) {
                    synchronized (C64026ci.class) {
                        ebVar = f173132b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173131a);
                            f173132b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
