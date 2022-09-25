package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.ru */
/* compiled from: PG */
public final class C88171ru extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C88171ru f238350e;

    /* renamed from: f */
    private static volatile C63010eb f238351f;

    /* renamed from: a */
    public int f238352a;

    /* renamed from: b */
    public boolean f238353b;

    /* renamed from: c */
    public int f238354c;

    /* renamed from: d */
    public boolean f238355d;

    static {
        C88171ru ruVar = new C88171ru();
        f238350e = ruVar;
        C62942bv.registerDefaultInstance(C88171ru.class, ruVar);
    }

    private C88171ru() {
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
                return newMessageInfo(f238350e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C88171ru();
            case 4:
                return new C88170rt();
            case 5:
                return f238350e;
            case 6:
                C63010eb ebVar = f238351f;
                if (ebVar == null) {
                    synchronized (C88171ru.class) {
                        ebVar = f238351f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238350e);
                            f238351f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
