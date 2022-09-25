package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.bz */
/* compiled from: PG */
public final class C7572bz extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C7572bz f26176a;

    /* renamed from: b */
    private static volatile C63010eb f26177b;

    static {
        C7572bz bzVar = new C7572bz();
        f26176a = bzVar;
        C62942bv.registerDefaultInstance(C7572bz.class, bzVar);
    }

    private C7572bz() {
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
                return newMessageInfo(f26176a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C7572bz();
            case 4:
                return new C7571by();
            case 5:
                return f26176a;
            case 6:
                C63010eb ebVar = f26177b;
                if (ebVar == null) {
                    synchronized (C7572bz.class) {
                        ebVar = f26177b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26176a);
                            f26177b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
