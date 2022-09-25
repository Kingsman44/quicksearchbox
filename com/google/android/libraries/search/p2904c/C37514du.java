package com.google.android.libraries.search.p2904c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.du */
/* compiled from: PG */
public final class C37514du extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C37514du f99629c;

    /* renamed from: d */
    private static volatile C63010eb f99630d;

    /* renamed from: a */
    public int f99631a = 0;

    /* renamed from: b */
    public Object f99632b;

    static {
        C37514du duVar = new C37514du();
        f99629c = duVar;
        C62942bv.registerDefaultInstance(C37514du.class, duVar);
    }

    private C37514du() {
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
                return newMessageInfo(f99629c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဿ\u0000\u0002ဿ\u0000", new Object[]{"b", "a", C37516dw.m66522b(), C37512ds.m66520b()});
            case 3:
                return new C37514du();
            case 4:
                return new C37513dt();
            case 5:
                return f99629c;
            case 6:
                C63010eb ebVar = f99630d;
                if (ebVar == null) {
                    synchronized (C37514du.class) {
                        ebVar = f99630d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f99629c);
                            f99630d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
