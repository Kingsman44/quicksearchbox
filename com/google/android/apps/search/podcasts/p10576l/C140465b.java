package com.google.android.apps.search.podcasts.p10576l;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.podcasts.l.b */
/* compiled from: PG */
public final class C140465b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C140465b f381543d;

    /* renamed from: e */
    private static volatile C63010eb f381544e;

    /* renamed from: a */
    public int f381545a;

    /* renamed from: b */
    public boolean f381546b;

    /* renamed from: c */
    public boolean f381547c;

    static {
        C140465b bVar = new C140465b();
        f381543d = bVar;
        C62942bv.registerDefaultInstance(C140465b.class, bVar);
    }

    private C140465b() {
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
                return newMessageInfo(f381543d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0007\u0003\u0007", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C140465b();
            case 4:
                return new C140438a();
            case 5:
                return f381543d;
            case 6:
                C63010eb ebVar = f381544e;
                if (ebVar == null) {
                    synchronized (C140465b.class) {
                        ebVar = f381544e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f381543d);
                            f381544e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
