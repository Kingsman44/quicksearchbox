package com.google.protos.p4963bf.p4964a.p4965a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.bf.a.a.ag */
/* compiled from: PG */
public final class C64558ag extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64558ag f175060a;

    /* renamed from: b */
    private static volatile C63010eb f175061b;

    static {
        C64558ag agVar = new C64558ag();
        f175060a = agVar;
        C62942bv.registerDefaultInstance(C64558ag.class, agVar);
    }

    private C64558ag() {
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
                return newMessageInfo(f175060a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C64558ag();
            case 4:
                return new C64557af();
            case 5:
                return f175060a;
            case 6:
                C63010eb ebVar = f175061b;
                if (ebVar == null) {
                    synchronized (C64558ag.class) {
                        ebVar = f175061b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175060a);
                            f175061b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
