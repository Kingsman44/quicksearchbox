package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.yw */
/* compiled from: PG */
public final class C88362yw extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C88362yw f238955d;

    /* renamed from: e */
    private static volatile C63010eb f238956e;

    /* renamed from: a */
    public int f238957a;

    /* renamed from: b */
    public boolean f238958b;

    /* renamed from: c */
    public boolean f238959c;

    static {
        C88362yw ywVar = new C88362yw();
        f238955d = ywVar;
        C62942bv.registerDefaultInstance(C88362yw.class, ywVar);
    }

    private C88362yw() {
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
                return newMessageInfo(f238955d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C88362yw();
            case 4:
                return new C88361yv();
            case 5:
                return f238955d;
            case 6:
                C63010eb ebVar = f238956e;
                if (ebVar == null) {
                    synchronized (C88362yw.class) {
                        ebVar = f238956e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238955d);
                            f238956e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
