package com.google.android.apps.search.googleapp.discover.p10214s;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.discover.s.am */
/* compiled from: PG */
public final class C134548am extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C134548am f366412d;

    /* renamed from: e */
    private static volatile C63010eb f366413e;

    /* renamed from: a */
    public int f366414a;

    /* renamed from: b */
    public C62910ar f366415b;

    /* renamed from: c */
    public C62910ar f366416c;

    static {
        C134548am amVar = new C134548am();
        f366412d = amVar;
        C62942bv.registerDefaultInstance(C134548am.class, amVar);
    }

    private C134548am() {
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
                return newMessageInfo(f366412d, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C134548am();
            case 4:
                return new C134547al();
            case 5:
                return f366412d;
            case 6:
                C63010eb ebVar = f366413e;
                if (ebVar == null) {
                    synchronized (C134548am.class) {
                        ebVar = f366413e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f366412d);
                            f366413e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
