package com.google.protos.p4963bf.p4964a.p4965a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.bf.a.a.s */
/* compiled from: PG */
public final class C64614s extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64614s f175163a;

    /* renamed from: b */
    private static volatile C63010eb f175164b;

    static {
        C64614s sVar = new C64614s();
        f175163a = sVar;
        C62942bv.registerDefaultInstance(C64614s.class, sVar);
    }

    private C64614s() {
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
                return newMessageInfo(f175163a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C64614s();
            case 4:
                return new C64613r();
            case 5:
                return f175163a;
            case 6:
                C63010eb ebVar = f175164b;
                if (ebVar == null) {
                    synchronized (C64614s.class) {
                        ebVar = f175164b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175163a);
                            f175164b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
