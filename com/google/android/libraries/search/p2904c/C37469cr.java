package com.google.android.libraries.search.p2904c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.cr */
/* compiled from: PG */
public final class C37469cr extends C62942bv implements C37470cs {

    /* renamed from: d */
    public static final C37469cr f99462d;

    /* renamed from: e */
    private static volatile C63010eb f99463e;

    /* renamed from: a */
    public int f99464a;

    /* renamed from: b */
    public C37672hs f99465b;

    /* renamed from: c */
    public C37500dg f99466c;

    static {
        C37469cr crVar = new C37469cr();
        f99462d = crVar;
        C62942bv.registerDefaultInstance(C37469cr.class, crVar);
    }

    private C37469cr() {
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
                return newMessageInfo(f99462d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C37469cr();
            case 4:
                return new C37468cq();
            case 5:
                return f99462d;
            case 6:
                C63010eb ebVar = f99463e;
                if (ebVar == null) {
                    synchronized (C37469cr.class) {
                        ebVar = f99463e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f99462d);
                            f99463e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
