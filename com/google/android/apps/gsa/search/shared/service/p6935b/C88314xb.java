package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.xb */
/* compiled from: PG */
public final class C88314xb extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C88314xb f238836c;

    /* renamed from: d */
    private static volatile C63010eb f238837d;

    /* renamed from: a */
    public int f238838a;

    /* renamed from: b */
    public C63088z f238839b = C63088z.f170246b;

    static {
        C88314xb xbVar = new C88314xb();
        f238836c = xbVar;
        C62942bv.registerDefaultInstance(C88314xb.class, xbVar);
    }

    private C88314xb() {
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
                return newMessageInfo(f238836c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
            case 3:
                return new C88314xb();
            case 4:
                return new C88313xa();
            case 5:
                return f238836c;
            case 6:
                C63010eb ebVar = f238837d;
                if (ebVar == null) {
                    synchronized (C88314xb.class) {
                        ebVar = f238837d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238836c);
                            f238837d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
