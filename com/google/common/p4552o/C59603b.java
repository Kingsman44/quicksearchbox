package com.google.common.p4552o;

import com.google.android.libraries.search.location.p3029a.C38590aj;
import com.google.android.libraries.search.location.p3029a.C38626br;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.b */
/* compiled from: PG */
public final class C59603b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C59603b f159814e;

    /* renamed from: f */
    private static volatile C63010eb f159815f;

    /* renamed from: a */
    public int f159816a;

    /* renamed from: b */
    public int f159817b;

    /* renamed from: c */
    public boolean f159818c;

    /* renamed from: d */
    public C38626br f159819d;

    static {
        C59603b bVar = new C59603b();
        f159814e = bVar;
        C62942bv.registerDefaultInstance(C59603b.class, bVar);
    }

    private C59603b() {
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
                return newMessageInfo(f159814e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဇ\u0001\u0004ဉ\u0002", new Object[]{"a", "b", C38590aj.m67897b(), C45240c.f118157a, "d"});
            case 3:
                return new C59603b();
            case 4:
                return new C59448a();
            case 5:
                return f159814e;
            case 6:
                C63010eb ebVar = f159815f;
                if (ebVar == null) {
                    synchronized (C59603b.class) {
                        ebVar = f159815f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159814e);
                            f159815f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
