package com.google.android.apps.search.googleapp.promomanager.p10374c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.c.c */
/* compiled from: PG */
public final class C137034c extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C137034c f372924d;

    /* renamed from: e */
    private static volatile C63010eb f372925e;

    /* renamed from: a */
    public int f372926a;

    /* renamed from: b */
    public int f372927b;

    /* renamed from: c */
    public C63042fg f372928c;

    static {
        C137034c cVar = new C137034c();
        f372924d = cVar;
        C62942bv.registerDefaultInstance(C137034c.class, cVar);
    }

    private C137034c() {
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
                return newMessageInfo(f372924d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C137034c();
            case 4:
                return new C137033b();
            case 5:
                return f372924d;
            case 6:
                C63010eb ebVar = f372925e;
                if (ebVar == null) {
                    synchronized (C137034c.class) {
                        ebVar = f372925e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f372924d);
                            f372925e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
