package com.google.protos.p4963bf.p4964a.p4965a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.bf.a.a.m */
/* compiled from: PG */
public final class C64608m extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64608m f175157a;

    /* renamed from: b */
    private static volatile C63010eb f175158b;

    static {
        C64608m mVar = new C64608m();
        f175157a = mVar;
        C62942bv.registerDefaultInstance(C64608m.class, mVar);
    }

    private C64608m() {
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
                return newMessageInfo(f175157a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C64608m();
            case 4:
                return new C64607l();
            case 5:
                return f175157a;
            case 6:
                C63010eb ebVar = f175158b;
                if (ebVar == null) {
                    synchronized (C64608m.class) {
                        ebVar = f175158b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175157a);
                            f175158b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
