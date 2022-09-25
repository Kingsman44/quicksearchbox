package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.gn */
/* compiled from: PG */
public final class C87867gn extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C87867gn f237714e;

    /* renamed from: f */
    private static volatile C63010eb f237715f;

    /* renamed from: a */
    public int f237716a;

    /* renamed from: b */
    public C63088z f237717b = C63088z.f170246b;

    /* renamed from: c */
    public boolean f237718c;

    /* renamed from: d */
    public boolean f237719d;

    static {
        C87867gn gnVar = new C87867gn();
        f237714e = gnVar;
        C62942bv.registerDefaultInstance(C87867gn.class, gnVar);
    }

    private C87867gn() {
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
                return newMessageInfo(f237714e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C87867gn();
            case 4:
                return new C87866gm();
            case 5:
                return f237714e;
            case 6:
                C63010eb ebVar = f237715f;
                if (ebVar == null) {
                    synchronized (C87867gn.class) {
                        ebVar = f237715f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237714e);
                            f237715f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
