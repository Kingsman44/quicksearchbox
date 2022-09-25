package com.google.protos.p4963bf.p4964a.p4965a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.bf.a.a.ao */
/* compiled from: PG */
public final class C64566ao extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64566ao f175068a;

    /* renamed from: b */
    private static volatile C63010eb f175069b;

    static {
        C64566ao aoVar = new C64566ao();
        f175068a = aoVar;
        C62942bv.registerDefaultInstance(C64566ao.class, aoVar);
    }

    private C64566ao() {
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
                return newMessageInfo(f175068a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C64566ao();
            case 4:
                return new C64565an();
            case 5:
                return f175068a;
            case 6:
                C63010eb ebVar = f175069b;
                if (ebVar == null) {
                    synchronized (C64566ao.class) {
                        ebVar = f175069b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175068a);
                            f175069b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
