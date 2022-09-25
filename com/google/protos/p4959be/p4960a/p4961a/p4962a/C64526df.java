package com.google.protos.p4959be.p4960a.p4961a.p4962a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.be.a.a.a.df */
/* compiled from: PG */
public final class C64526df extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64526df f174994c;

    /* renamed from: d */
    private static volatile C63010eb f174995d;

    /* renamed from: a */
    public int f174996a;

    /* renamed from: b */
    public int f174997b;

    static {
        C64526df dfVar = new C64526df();
        f174994c = dfVar;
        C62942bv.registerDefaultInstance(C64526df.class, dfVar);
    }

    private C64526df() {
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
                return newMessageInfo(f174994c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"a", "b"});
            case 3:
                return new C64526df();
            case 4:
                return new C64525de();
            case 5:
                return f174994c;
            case 6:
                C63010eb ebVar = f174995d;
                if (ebVar == null) {
                    synchronized (C64526df.class) {
                        ebVar = f174995d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174994c);
                            f174995d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
