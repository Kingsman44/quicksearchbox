package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.tk */
/* compiled from: PG */
public final class C88215tk extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C88215tk f238444d;

    /* renamed from: e */
    private static volatile C63010eb f238445e;

    /* renamed from: a */
    public int f238446a;

    /* renamed from: b */
    public int f238447b;

    /* renamed from: c */
    public boolean f238448c;

    static {
        C88215tk tkVar = new C88215tk();
        f238444d = tkVar;
        C62942bv.registerDefaultInstance(C88215tk.class, tkVar);
    }

    private C88215tk() {
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
                return newMessageInfo(f238444d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C88215tk();
            case 4:
                return new C88214tj();
            case 5:
                return f238444d;
            case 6:
                C63010eb ebVar = f238445e;
                if (ebVar == null) {
                    synchronized (C88215tk.class) {
                        ebVar = f238445e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238444d);
                            f238445e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
