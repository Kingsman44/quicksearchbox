package com.google.android.apps.search.googleapp.search.suggest;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.k */
/* compiled from: PG */
public final class C138129k extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C138129k f375808e;

    /* renamed from: f */
    private static volatile C63010eb f375809f;

    /* renamed from: a */
    public int f375810a;

    /* renamed from: b */
    public int f375811b;

    /* renamed from: c */
    public int f375812c;

    /* renamed from: d */
    public int f375813d;

    static {
        C138129k kVar = new C138129k();
        f375808e = kVar;
        C62942bv.registerDefaultInstance(C138129k.class, kVar);
    }

    private C138129k() {
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
                return newMessageInfo(f375808e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C138129k();
            case 4:
                return new C138128j();
            case 5:
                return f375808e;
            case 6:
                C63010eb ebVar = f375809f;
                if (ebVar == null) {
                    synchronized (C138129k.class) {
                        ebVar = f375809f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f375808e);
                            f375809f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
