package com.google.common.p4552o.p4563i;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24446ah;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.i.bn */
/* compiled from: PG */
public final class C59905bn extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C59905bn f161909e;

    /* renamed from: f */
    private static volatile C63010eb f161910f;

    /* renamed from: a */
    public int f161911a;

    /* renamed from: b */
    public int f161912b;

    /* renamed from: c */
    public int f161913c;

    /* renamed from: d */
    public String f161914d = BuildConfig.FLAVOR;

    static {
        C59905bn bnVar = new C59905bn();
        f161909e = bnVar;
        C62942bv.registerDefaultInstance(C59905bn.class, bnVar);
    }

    private C59905bn() {
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
                return newMessageInfo(f161909e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C59904bm.f161908a, C45240c.f118157a, C24446ah.m45520b(), "d"});
            case 3:
                return new C59905bn();
            case 4:
                return new C59903bl();
            case 5:
                return f161909e;
            case 6:
                C63010eb ebVar = f161910f;
                if (ebVar == null) {
                    synchronized (C59905bn.class) {
                        ebVar = f161910f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161909e);
                            f161910f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
