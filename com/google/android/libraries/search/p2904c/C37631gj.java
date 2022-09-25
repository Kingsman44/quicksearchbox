package com.google.android.libraries.search.p2904c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.gj */
/* compiled from: PG */
public final class C37631gj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C37631gj f99991c;

    /* renamed from: d */
    private static volatile C63010eb f99992d;

    /* renamed from: a */
    public int f99993a;

    /* renamed from: b */
    public int f99994b;

    static {
        C37631gj gjVar = new C37631gj();
        f99991c = gjVar;
        C62942bv.registerDefaultInstance(C37631gj.class, gjVar);
    }

    private C37631gj() {
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
                return newMessageInfo(f99991c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C37633gl.m66603b()});
            case 3:
                return new C37631gj();
            case 4:
                return new C37630gi();
            case 5:
                return f99991c;
            case 6:
                C63010eb ebVar = f99992d;
                if (ebVar == null) {
                    synchronized (C37631gj.class) {
                        ebVar = f99992d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f99991c);
                            f99992d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
