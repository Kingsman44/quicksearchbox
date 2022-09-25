package com.google.p4172bg;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63070h;

/* renamed from: com.google.bg.ad */
/* compiled from: PG */
public final class C55696ad extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C55696ad f146934b;

    /* renamed from: c */
    private static volatile C63010eb f146935c;

    /* renamed from: a */
    public C63070h f146936a;

    static {
        C55696ad adVar = new C55696ad();
        f146934b = adVar;
        C62942bv.registerDefaultInstance(C55696ad.class, adVar);
    }

    private C55696ad() {
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
                return newMessageInfo(f146934b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C55696ad();
            case 4:
                return new C55695ac();
            case 5:
                return f146934b;
            case 6:
                C63010eb ebVar = f146935c;
                if (ebVar == null) {
                    synchronized (C55696ad.class) {
                        ebVar = f146935c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146934b);
                            f146935c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
