package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.xn */
/* compiled from: PG */
public final class C88326xn extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C88326xn f238861d;

    /* renamed from: e */
    private static volatile C63010eb f238862e;

    /* renamed from: a */
    public int f238863a;

    /* renamed from: b */
    public long f238864b;

    /* renamed from: c */
    public boolean f238865c;

    static {
        C88326xn xnVar = new C88326xn();
        f238861d = xnVar;
        C62942bv.registerDefaultInstance(C88326xn.class, xnVar);
    }

    private C88326xn() {
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
                return newMessageInfo(f238861d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C88326xn();
            case 4:
                return new C88325xm();
            case 5:
                return f238861d;
            case 6:
                C63010eb ebVar = f238862e;
                if (ebVar == null) {
                    synchronized (C88326xn.class) {
                        ebVar = f238862e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238861d);
                            f238862e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
