package com.google.android.libraries.search.p2904c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.em */
/* compiled from: PG */
public final class C37572em extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C37572em f99843c;

    /* renamed from: d */
    private static volatile C63010eb f99844d;

    /* renamed from: a */
    public int f99845a = 0;

    /* renamed from: b */
    public Object f99846b;

    static {
        C37572em emVar = new C37572em();
        f99843c = emVar;
        C62942bv.registerDefaultInstance(C37572em.class, emVar);
    }

    private C37572em() {
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
                return newMessageInfo(f99843c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", C37464cm.class, C37460ci.class});
            case 3:
                return new C37572em();
            case 4:
                return new C37571el();
            case 5:
                return f99843c;
            case 6:
                C63010eb ebVar = f99844d;
                if (ebVar == null) {
                    synchronized (C37572em.class) {
                        ebVar = f99844d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f99843c);
                            f99844d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
