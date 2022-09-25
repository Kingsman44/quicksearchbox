package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.uu */
/* compiled from: PG */
public final class C88252uu extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C88252uu f238708d;

    /* renamed from: e */
    private static volatile C63010eb f238709e;

    /* renamed from: a */
    public int f238710a;

    /* renamed from: b */
    public int f238711b;

    /* renamed from: c */
    public int f238712c;

    static {
        C88252uu uuVar = new C88252uu();
        f238708d = uuVar;
        C62942bv.registerDefaultInstance(C88252uu.class, uuVar);
    }

    private C88252uu() {
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
                return newMessageInfo(f238708d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C88252uu();
            case 4:
                return new C88251ut();
            case 5:
                return f238708d;
            case 6:
                C63010eb ebVar = f238709e;
                if (ebVar == null) {
                    synchronized (C88252uu.class) {
                        ebVar = f238709e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238708d);
                            f238709e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
