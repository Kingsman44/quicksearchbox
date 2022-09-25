package com.google.protos.p4959be.p4960a.p4961a.p4962a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.be.a.a.a.ah */
/* compiled from: PG */
public final class C64447ah extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64447ah f174823b;

    /* renamed from: c */
    private static volatile C63010eb f174824c;

    /* renamed from: a */
    public C64445af f174825a;

    static {
        C64447ah ahVar = new C64447ah();
        f174823b = ahVar;
        C62942bv.registerDefaultInstance(C64447ah.class, ahVar);
    }

    private C64447ah() {
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
                return newMessageInfo(f174823b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C64447ah();
            case 4:
                return new C64446ag();
            case 5:
                return f174823b;
            case 6:
                C63010eb ebVar = f174824c;
                if (ebVar == null) {
                    synchronized (C64447ah.class) {
                        ebVar = f174824c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174823b);
                            f174824c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
