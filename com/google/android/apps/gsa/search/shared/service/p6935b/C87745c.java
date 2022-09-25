package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.c */
/* compiled from: PG */
public final class C87745c extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C87745c f237486f;

    /* renamed from: g */
    private static volatile C63010eb f237487g;

    /* renamed from: a */
    public int f237488a;

    /* renamed from: b */
    public int f237489b;

    /* renamed from: c */
    public int f237490c;

    /* renamed from: d */
    public boolean f237491d;

    /* renamed from: e */
    public boolean f237492e;

    static {
        C87745c cVar = new C87745c();
        f237486f = cVar;
        C62942bv.registerDefaultInstance(C87745c.class, cVar);
    }

    private C87745c() {
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
                return newMessageInfo(f237486f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C87745c();
            case 4:
                return new C87718b();
            case 5:
                return f237486f;
            case 6:
                C63010eb ebVar = f237487g;
                if (ebVar == null) {
                    synchronized (C87745c.class) {
                        ebVar = f237487g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237486f);
                            f237487g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
