package com.google.p4160bf.p4164b.p4165a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.b.a.n */
/* compiled from: PG */
public final class C55674n extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C55674n f146893a;

    /* renamed from: b */
    private static volatile C63010eb f146894b;

    static {
        C55674n nVar = new C55674n();
        f146893a = nVar;
        C62942bv.registerDefaultInstance(C55674n.class, nVar);
    }

    private C55674n() {
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
                return newMessageInfo(f146893a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C55674n();
            case 4:
                return new C55673m();
            case 5:
                return f146893a;
            case 6:
                C63010eb ebVar = f146894b;
                if (ebVar == null) {
                    synchronized (C55674n.class) {
                        ebVar = f146894b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146893a);
                            f146894b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
