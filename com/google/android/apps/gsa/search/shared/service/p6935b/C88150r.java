package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.r */
/* compiled from: PG */
public final class C88150r extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C88150r f238281d;

    /* renamed from: e */
    private static volatile C63010eb f238282e;

    /* renamed from: a */
    public int f238283a;

    /* renamed from: b */
    public int f238284b;

    /* renamed from: c */
    public int f238285c;

    static {
        C88150r rVar = new C88150r();
        f238281d = rVar;
        C62942bv.registerDefaultInstance(C88150r.class, rVar);
    }

    private C88150r() {
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
                return newMessageInfo(f238281d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C88150r();
            case 4:
                return new C88123q();
            case 5:
                return f238281d;
            case 6:
                C63010eb ebVar = f238282e;
                if (ebVar == null) {
                    synchronized (C88150r.class) {
                        ebVar = f238282e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238281d);
                            f238282e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
