package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.ahc */
/* compiled from: PG */
public final class ahc extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final ahc f135088a;

    /* renamed from: b */
    private static volatile C63010eb f135089b;

    static {
        ahc ahc = new ahc();
        f135088a = ahc;
        C62942bv.registerDefaultInstance(ahc.class, ahc);
    }

    private ahc() {
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
                return newMessageInfo(f135088a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new ahc();
            case 4:
                return new ahb();
            case 5:
                return f135088a;
            case 6:
                C63010eb ebVar = f135089b;
                if (ebVar == null) {
                    synchronized (ahc.class) {
                        ebVar = f135089b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135088a);
                            f135089b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
