package com.google.p4129b.p4136c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.b.c.k */
/* compiled from: PG */
public final class C54763k extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C54763k f143687a;

    /* renamed from: b */
    private static volatile C63010eb f143688b;

    static {
        C54763k kVar = new C54763k();
        f143687a = kVar;
        C62942bv.registerDefaultInstance(C54763k.class, kVar);
    }

    private C54763k() {
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
                return newMessageInfo(f143687a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C54763k();
            case 4:
                return new C54762j();
            case 5:
                return f143687a;
            case 6:
                C63010eb ebVar = f143688b;
                if (ebVar == null) {
                    synchronized (C54763k.class) {
                        ebVar = f143688b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143687a);
                            f143688b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
