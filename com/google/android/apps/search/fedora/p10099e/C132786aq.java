package com.google.android.apps.search.fedora.p10099e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.fedora.e.aq */
/* compiled from: PG */
public final class C132786aq extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C132786aq f362276d;

    /* renamed from: e */
    private static volatile C63010eb f362277e;

    /* renamed from: a */
    public int f362278a;

    /* renamed from: b */
    public boolean f362279b;

    /* renamed from: c */
    public boolean f362280c;

    static {
        C132786aq aqVar = new C132786aq();
        f362276d = aqVar;
        C62942bv.registerDefaultInstance(C132786aq.class, aqVar);
    }

    private C132786aq() {
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
                return newMessageInfo(f362276d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C132786aq();
            case 4:
                return new C132785ap();
            case 5:
                return f362276d;
            case 6:
                C63010eb ebVar = f362277e;
                if (ebVar == null) {
                    synchronized (C132786aq.class) {
                        ebVar = f362277e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f362276d);
                            f362277e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
