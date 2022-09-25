package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.afr */
/* compiled from: PG */
public final class afr extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final afr f135015a;

    /* renamed from: b */
    private static volatile C63010eb f135016b;

    static {
        afr afr = new afr();
        f135015a = afr;
        C62942bv.registerDefaultInstance(afr.class, afr);
    }

    private afr() {
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
                return newMessageInfo(f135015a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new afr();
            case 4:
                return new afq();
            case 5:
                return f135015a;
            case 6:
                C63010eb ebVar = f135016b;
                if (ebVar == null) {
                    synchronized (afr.class) {
                        ebVar = f135016b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135015a);
                            f135016b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
