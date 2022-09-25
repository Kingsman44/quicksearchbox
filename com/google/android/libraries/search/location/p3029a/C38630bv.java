package com.google.android.libraries.search.location.p3029a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.location.a.bv */
/* compiled from: PG */
public final class C38630bv extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C38630bv f102073e;

    /* renamed from: f */
    private static volatile C63010eb f102074f;

    /* renamed from: a */
    public int f102075a;

    /* renamed from: b */
    public boolean f102076b;

    /* renamed from: c */
    public boolean f102077c;

    /* renamed from: d */
    public int f102078d;

    static {
        C38630bv bvVar = new C38630bv();
        f102073e = bvVar;
        C62942bv.registerDefaultInstance(C38630bv.class, bvVar);
    }

    private C38630bv() {
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
                return newMessageInfo(f102073e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0003ဇ\u0001\u0004ဌ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", C38623bo.f102068a});
            case 3:
                return new C38630bv();
            case 4:
                return new C38629bu();
            case 5:
                return f102073e;
            case 6:
                C63010eb ebVar = f102074f;
                if (ebVar == null) {
                    synchronized (C38630bv.class) {
                        ebVar = f102074f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f102073e);
                            f102074f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
