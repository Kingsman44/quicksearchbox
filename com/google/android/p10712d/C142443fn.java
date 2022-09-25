package com.google.android.p10712d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.fn */
/* compiled from: PG */
public final class C142443fn extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C142443fn f386520c;

    /* renamed from: d */
    private static volatile C63010eb f386521d;

    /* renamed from: a */
    public int f386522a;

    /* renamed from: b */
    public int f386523b;

    static {
        C142443fn fnVar = new C142443fn();
        f386520c = fnVar;
        C62942bv.registerDefaultInstance(C142443fn.class, fnVar);
    }

    private C142443fn() {
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
                return newMessageInfo(f386520c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C142443fn();
            case 4:
                return new C142442fm();
            case 5:
                return f386520c;
            case 6:
                C63010eb ebVar = f386521d;
                if (ebVar == null) {
                    synchronized (C142443fn.class) {
                        ebVar = f386521d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386520c);
                            f386521d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
