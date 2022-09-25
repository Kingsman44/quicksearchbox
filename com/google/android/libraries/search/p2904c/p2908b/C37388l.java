package com.google.android.libraries.search.p2904c.p2908b;

import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.C37500dg;
import com.google.android.libraries.search.p2904c.C37672hs;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.b.l */
/* compiled from: PG */
public final class C37388l extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C37388l f99307e;

    /* renamed from: f */
    private static volatile C63010eb f99308f;

    /* renamed from: a */
    public int f99309a;

    /* renamed from: b */
    public C37672hs f99310b;

    /* renamed from: c */
    public C37360ay f99311c;

    /* renamed from: d */
    public C37500dg f99312d;

    static {
        C37388l lVar = new C37388l();
        f99307e = lVar;
        C62942bv.registerDefaultInstance(C37388l.class, lVar);
    }

    private C37388l() {
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
                return newMessageInfo(f99307e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C37388l();
            case 4:
                return new C37387k();
            case 5:
                return f99307e;
            case 6:
                C63010eb ebVar = f99308f;
                if (ebVar == null) {
                    synchronized (C37388l.class) {
                        ebVar = f99308f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f99307e);
                            f99308f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
