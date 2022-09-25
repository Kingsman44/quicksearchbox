package com.google.android.libraries.search.p2904c.p2982x;

import com.google.android.libraries.search.p2904c.C37641gt;
import com.google.android.libraries.search.p2904c.C37679hz;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.x.ad */
/* compiled from: PG */
public final class C38221ad extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C38221ad f101300d;

    /* renamed from: e */
    private static volatile C63010eb f101301e;

    /* renamed from: a */
    public int f101302a;

    /* renamed from: b */
    public C37679hz f101303b;

    /* renamed from: c */
    public C37641gt f101304c;

    static {
        C38221ad adVar = new C38221ad();
        f101300d = adVar;
        C62942bv.registerDefaultInstance(C38221ad.class, adVar);
    }

    private C38221ad() {
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
                return newMessageInfo(f101300d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C38221ad();
            case 4:
                return new C38220ac();
            case 5:
                return f101300d;
            case 6:
                C63010eb ebVar = f101301e;
                if (ebVar == null) {
                    synchronized (C38221ad.class) {
                        ebVar = f101301e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f101300d);
                            f101301e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
