package com.google.p4281bu.p4282a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bu.a.be */
/* compiled from: PG */
public final class C56521be extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56521be f150943a;

    /* renamed from: b */
    private static volatile C63010eb f150944b;

    static {
        C56521be beVar = new C56521be();
        f150943a = beVar;
        C62942bv.registerDefaultInstance(C56521be.class, beVar);
    }

    private C56521be() {
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
                return newMessageInfo(f150943a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C56521be();
            case 4:
                return new C56520bd();
            case 5:
                return f150943a;
            case 6:
                C63010eb ebVar = f150944b;
                if (ebVar == null) {
                    synchronized (C56521be.class) {
                        ebVar = f150944b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150943a);
                            f150944b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
