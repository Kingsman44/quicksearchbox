package com.google.lens.p4705i.p4706a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.i.a.p */
/* compiled from: PG */
public final class C62385p extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62385p f168409a;

    /* renamed from: b */
    private static volatile C63010eb f168410b;

    static {
        C62385p pVar = new C62385p();
        f168409a = pVar;
        C62942bv.registerDefaultInstance(C62385p.class, pVar);
    }

    private C62385p() {
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
                return newMessageInfo(f168409a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C62385p();
            case 4:
                return new C62384o();
            case 5:
                return f168409a;
            case 6:
                C63010eb ebVar = f168410b;
                if (ebVar == null) {
                    synchronized (C62385p.class) {
                        ebVar = f168410b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168409a);
                            f168410b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
