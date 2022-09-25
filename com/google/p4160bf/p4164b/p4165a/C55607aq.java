package com.google.p4160bf.p4164b.p4165a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.b.a.aq */
/* compiled from: PG */
public final class C55607aq extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C55607aq f146716a;

    /* renamed from: b */
    private static volatile C63010eb f146717b;

    static {
        C55607aq aqVar = new C55607aq();
        f146716a = aqVar;
        C62942bv.registerDefaultInstance(C55607aq.class, aqVar);
    }

    private C55607aq() {
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
                return newMessageInfo(f146716a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C55607aq();
            case 4:
                return new C55606ap();
            case 5:
                return f146716a;
            case 6:
                C63010eb ebVar = f146717b;
                if (ebVar == null) {
                    synchronized (C55607aq.class) {
                        ebVar = f146717b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146716a);
                            f146717b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
