package com.google.protos.p5064h;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.h.k */
/* compiled from: PG */
public final class C65463k extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65463k f177948a;

    /* renamed from: c */
    private static volatile C63010eb f177949c;

    /* renamed from: b */
    private C62995dn f177950b = C62995dn.f170057a;

    static {
        C65463k kVar = new C65463k();
        f177948a = kVar;
        C62942bv.registerDefaultInstance(C65463k.class, kVar);
    }

    private C65463k() {
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
                return newMessageInfo(f177948a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", C65462j.f177947a});
            case 3:
                return new C65463k();
            case 4:
                return new C65461i();
            case 5:
                return f177948a;
            case 6:
                C63010eb ebVar = f177949c;
                if (ebVar == null) {
                    synchronized (C65463k.class) {
                        ebVar = f177949c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f177948a);
                            f177949c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
