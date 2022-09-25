package com.google.protos.p4953bc.p4955b.p4956a.p4957a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.bc.b.a.a.f */
/* compiled from: PG */
public final class C64415f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64415f f174722a;

    /* renamed from: c */
    private static volatile C63010eb f174723c;

    /* renamed from: b */
    private C62995dn f174724b = C62995dn.f170057a;

    static {
        C64415f fVar = new C64415f();
        f174722a = fVar;
        C62942bv.registerDefaultInstance(C64415f.class, fVar);
    }

    private C64415f() {
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
                return newMessageInfo(f174722a, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"b", C64414e.f174721a});
            case 3:
                return new C64415f();
            case 4:
                return new C64413d();
            case 5:
                return f174722a;
            case 6:
                C63010eb ebVar = f174723c;
                if (ebVar == null) {
                    synchronized (C64415f.class) {
                        ebVar = f174723c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174722a);
                            f174723c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
