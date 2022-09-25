package com.google.protos.p4959be.p4960a.p4961a.p4962a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.be.a.a.a.ct */
/* compiled from: PG */
public final class C64513ct extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64513ct f174965b;

    /* renamed from: c */
    private static volatile C63010eb f174966c;

    /* renamed from: a */
    public C64522db f174967a;

    static {
        C64513ct ctVar = new C64513ct();
        f174965b = ctVar;
        C62942bv.registerDefaultInstance(C64513ct.class, ctVar);
    }

    private C64513ct() {
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
                return newMessageInfo(f174965b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C64513ct();
            case 4:
                return new C64512cs();
            case 5:
                return f174965b;
            case 6:
                C63010eb ebVar = f174966c;
                if (ebVar == null) {
                    synchronized (C64513ct.class) {
                        ebVar = f174966c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174965b);
                            f174966c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
