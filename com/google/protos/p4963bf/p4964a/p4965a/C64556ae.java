package com.google.protos.p4963bf.p4964a.p4965a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.bf.a.a.ae */
/* compiled from: PG */
public final class C64556ae extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64556ae f175058a;

    /* renamed from: b */
    private static volatile C63010eb f175059b;

    static {
        C64556ae aeVar = new C64556ae();
        f175058a = aeVar;
        C62942bv.registerDefaultInstance(C64556ae.class, aeVar);
    }

    private C64556ae() {
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
                return newMessageInfo(f175058a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C64556ae();
            case 4:
                return new C64555ad();
            case 5:
                return f175058a;
            case 6:
                C63010eb ebVar = f175059b;
                if (ebVar == null) {
                    synchronized (C64556ae.class) {
                        ebVar = f175059b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175058a);
                            f175059b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
