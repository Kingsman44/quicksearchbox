package com.google.lens.p4699e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.e.al */
/* compiled from: PG */
public final class C62199al extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62199al f167940a;

    /* renamed from: b */
    private static volatile C63010eb f167941b;

    static {
        C62199al alVar = new C62199al();
        f167940a = alVar;
        C62942bv.registerDefaultInstance(C62199al.class, alVar);
    }

    private C62199al() {
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
                return newMessageInfo(f167940a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62199al();
            case 4:
                return new C62198ak();
            case 5:
                return f167940a;
            case 6:
                C63010eb ebVar = f167941b;
                if (ebVar == null) {
                    synchronized (C62199al.class) {
                        ebVar = f167941b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167940a);
                            f167941b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
