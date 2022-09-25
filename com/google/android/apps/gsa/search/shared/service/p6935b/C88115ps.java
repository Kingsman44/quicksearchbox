package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.ps */
/* compiled from: PG */
public final class C88115ps extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C88115ps f238216c;

    /* renamed from: d */
    private static volatile C63010eb f238217d;

    /* renamed from: a */
    public int f238218a;

    /* renamed from: b */
    public int f238219b;

    static {
        C88115ps psVar = new C88115ps();
        f238216c = psVar;
        C62942bv.registerDefaultInstance(C88115ps.class, psVar);
    }

    private C88115ps() {
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
                return newMessageInfo(f238216c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C88113pq.f238215a});
            case 3:
                return new C88115ps();
            case 4:
                return new C88112pp();
            case 5:
                return f238216c;
            case 6:
                C63010eb ebVar = f238217d;
                if (ebVar == null) {
                    synchronized (C88115ps.class) {
                        ebVar = f238217d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238216c);
                            f238217d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
