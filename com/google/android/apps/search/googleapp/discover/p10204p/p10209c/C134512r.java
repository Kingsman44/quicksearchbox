package com.google.android.apps.search.googleapp.discover.p10204p.p10209c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.search.googleapp.discover.p.c.r */
/* compiled from: PG */
public final class C134512r extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C134512r f366320d;

    /* renamed from: e */
    private static volatile C63010eb f366321e;

    /* renamed from: a */
    public int f366322a;

    /* renamed from: b */
    public C134496b f366323b;

    /* renamed from: c */
    public C63042fg f366324c;

    static {
        C134512r rVar = new C134512r();
        f366320d = rVar;
        C62942bv.registerDefaultInstance(C134512r.class, rVar);
    }

    private C134512r() {
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
                return newMessageInfo(f366320d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C134512r();
            case 4:
                return new C134511q();
            case 5:
                return f366320d;
            case 6:
                C63010eb ebVar = f366321e;
                if (ebVar == null) {
                    synchronized (C134512r.class) {
                        ebVar = f366321e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f366320d);
                            f366321e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
