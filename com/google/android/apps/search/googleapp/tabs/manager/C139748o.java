package com.google.android.apps.search.googleapp.tabs.manager;

import com.google.android.apps.search.googleapp.tabs.p10523a.C139712d;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.tabs.manager.o */
/* compiled from: PG */
public final class C139748o extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C139748o f379849d;

    /* renamed from: e */
    private static volatile C63010eb f379850e;

    /* renamed from: a */
    public int f379851a;

    /* renamed from: b */
    public C139712d f379852b;

    /* renamed from: c */
    public boolean f379853c;

    static {
        C139748o oVar = new C139748o();
        f379849d = oVar;
        C62942bv.registerDefaultInstance(C139748o.class, oVar);
    }

    private C139748o() {
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
                return newMessageInfo(f379849d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C139748o();
            case 4:
                return new C139747n();
            case 5:
                return f379849d;
            case 6:
                C63010eb ebVar = f379850e;
                if (ebVar == null) {
                    synchronized (C139748o.class) {
                        ebVar = f379850e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f379849d);
                            f379850e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
