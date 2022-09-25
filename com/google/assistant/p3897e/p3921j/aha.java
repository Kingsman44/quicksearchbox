package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.aha */
/* compiled from: PG */
public final class aha extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final aha f135086a;

    /* renamed from: b */
    private static volatile C63010eb f135087b;

    static {
        aha aha = new aha();
        f135086a = aha;
        C62942bv.registerDefaultInstance(aha.class, aha);
    }

    private aha() {
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
                return newMessageInfo(f135086a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new aha();
            case 4:
                return new agz();
            case 5:
                return f135086a;
            case 6:
                C63010eb ebVar = f135087b;
                if (ebVar == null) {
                    synchronized (aha.class) {
                        ebVar = f135087b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135086a);
                            f135087b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
