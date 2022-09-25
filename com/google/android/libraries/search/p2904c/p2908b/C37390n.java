package com.google.android.libraries.search.p2904c.p2908b;

import com.google.android.libraries.search.p2904c.C37500dg;
import com.google.android.libraries.search.p2904c.C37672hs;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.b.n */
/* compiled from: PG */
public final class C37390n extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C37390n f99313d;

    /* renamed from: e */
    private static volatile C63010eb f99314e;

    /* renamed from: a */
    public int f99315a;

    /* renamed from: b */
    public C37672hs f99316b;

    /* renamed from: c */
    public C37500dg f99317c;

    static {
        C37390n nVar = new C37390n();
        f99313d = nVar;
        C62942bv.registerDefaultInstance(C37390n.class, nVar);
    }

    private C37390n() {
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
                return newMessageInfo(f99313d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C37390n();
            case 4:
                return new C37389m();
            case 5:
                return f99313d;
            case 6:
                C63010eb ebVar = f99314e;
                if (ebVar == null) {
                    synchronized (C37390n.class) {
                        ebVar = f99314e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f99313d);
                            f99314e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
