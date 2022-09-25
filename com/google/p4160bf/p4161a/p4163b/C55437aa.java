package com.google.p4160bf.p4161a.p4163b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.a.b.aa */
/* compiled from: PG */
public final class C55437aa extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C55437aa f146264a;

    /* renamed from: b */
    private static volatile C63010eb f146265b;

    static {
        C55437aa aaVar = new C55437aa();
        f146264a = aaVar;
        C62942bv.registerDefaultInstance(C55437aa.class, aaVar);
    }

    private C55437aa() {
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
                return newMessageInfo(f146264a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C55437aa();
            case 4:
                return new C55518z();
            case 5:
                return f146264a;
            case 6:
                C63010eb ebVar = f146265b;
                if (ebVar == null) {
                    synchronized (C55437aa.class) {
                        ebVar = f146265b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146264a);
                            f146265b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
