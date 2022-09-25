package com.google.android.apps.search.xblend.xpane;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4287b.p4342b.C56943g;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.xblend.xpane.l */
/* compiled from: PG */
public final class C142286l extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C142286l f386008e;

    /* renamed from: f */
    private static volatile C63010eb f386009f;

    /* renamed from: a */
    public int f386010a;

    /* renamed from: b */
    public C56943g f386011b;

    /* renamed from: c */
    public boolean f386012c;

    /* renamed from: d */
    public C62995dn f386013d = C62995dn.f170057a;

    static {
        C142286l lVar = new C142286l();
        f386008e = lVar;
        C62942bv.registerDefaultInstance(C142286l.class, lVar);
    }

    private C142286l() {
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
                return newMessageInfo(f386008e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u00032", new Object[]{"a", "b", C45240c.f118157a, "d", C142285k.f386007a});
            case 3:
                return new C142286l();
            case 4:
                return new C142284j();
            case 5:
                return f386008e;
            case 6:
                C63010eb ebVar = f386009f;
                if (ebVar == null) {
                    synchronized (C142286l.class) {
                        ebVar = f386009f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386008e);
                            f386009f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
