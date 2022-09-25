package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.ahi */
/* compiled from: PG */
public final class ahi extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final ahi f135098a;

    /* renamed from: b */
    private static volatile C63010eb f135099b;

    static {
        ahi ahi = new ahi();
        f135098a = ahi;
        C62942bv.registerDefaultInstance(ahi.class, ahi);
    }

    private ahi() {
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
                return newMessageInfo(f135098a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new ahi();
            case 4:
                return new ahh();
            case 5:
                return f135098a;
            case 6:
                C63010eb ebVar = f135099b;
                if (ebVar == null) {
                    synchronized (ahi.class) {
                        ebVar = f135099b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135098a);
                            f135099b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
