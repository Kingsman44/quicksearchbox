package com.google.protos.p4985f.p4986a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.a.be */
/* compiled from: PG */
public final class C64678be extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64678be f175327a;

    /* renamed from: b */
    private static volatile C63010eb f175328b;

    static {
        C64678be beVar = new C64678be();
        f175327a = beVar;
        C62942bv.registerDefaultInstance(C64678be.class, beVar);
    }

    private C64678be() {
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
                return newMessageInfo(f175327a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C64678be();
            case 4:
                return new C64677bd();
            case 5:
                return f175327a;
            case 6:
                C63010eb ebVar = f175328b;
                if (ebVar == null) {
                    synchronized (C64678be.class) {
                        ebVar = f175328b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175327a);
                            f175328b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
