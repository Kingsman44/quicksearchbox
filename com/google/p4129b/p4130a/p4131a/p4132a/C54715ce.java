package com.google.p4129b.p4130a.p4131a.p4132a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.b.a.a.a.ce */
/* compiled from: PG */
public final class C54715ce extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C54715ce f143606a;

    /* renamed from: b */
    private static volatile C63010eb f143607b;

    static {
        C54715ce ceVar = new C54715ce();
        f143606a = ceVar;
        C62942bv.registerDefaultInstance(C54715ce.class, ceVar);
    }

    private C54715ce() {
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
                return newMessageInfo(f143606a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C54715ce();
            case 4:
                return new C54714cd();
            case 5:
                return f143606a;
            case 6:
                C63010eb ebVar = f143607b;
                if (ebVar == null) {
                    synchronized (C54715ce.class) {
                        ebVar = f143607b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143606a);
                            f143607b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
