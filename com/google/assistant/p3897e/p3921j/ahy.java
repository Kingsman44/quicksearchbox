package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.ahy */
/* compiled from: PG */
public final class ahy extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final ahy f135123a;

    /* renamed from: b */
    private static volatile C63010eb f135124b;

    static {
        ahy ahy = new ahy();
        f135123a = ahy;
        C62942bv.registerDefaultInstance(ahy.class, ahy);
    }

    private ahy() {
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
                return newMessageInfo(f135123a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new ahy();
            case 4:
                return new ahx();
            case 5:
                return f135123a;
            case 6:
                C63010eb ebVar = f135124b;
                if (ebVar == null) {
                    synchronized (ahy.class) {
                        ebVar = f135124b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135123a);
                            f135124b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
