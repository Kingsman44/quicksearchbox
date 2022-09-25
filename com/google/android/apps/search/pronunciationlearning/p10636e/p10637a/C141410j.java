package com.google.android.apps.search.pronunciationlearning.p10636e.p10637a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.pronunciationlearning.e.a.j */
/* compiled from: PG */
public final class C141410j extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C141410j f383841d;

    /* renamed from: e */
    private static volatile C63010eb f383842e;

    /* renamed from: a */
    public int f383843a;

    /* renamed from: b */
    public int f383844b;

    /* renamed from: c */
    public int f383845c;

    static {
        C141410j jVar = new C141410j();
        f383841d = jVar;
        C62942bv.registerDefaultInstance(C141410j.class, jVar);
    }

    private C141410j() {
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
                return newMessageInfo(f383841d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C141410j();
            case 4:
                return new C141409i();
            case 5:
                return f383841d;
            case 6:
                C63010eb ebVar = f383842e;
                if (ebVar == null) {
                    synchronized (C141410j.class) {
                        ebVar = f383842e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f383841d);
                            f383842e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
