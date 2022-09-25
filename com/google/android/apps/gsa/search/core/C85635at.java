package com.google.android.apps.gsa.search.core;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.core.at */
/* compiled from: PG */
public final class C85635at extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C85635at f231455d;

    /* renamed from: e */
    private static volatile C63010eb f231456e;

    /* renamed from: a */
    public int f231457a;

    /* renamed from: b */
    public boolean f231458b;

    /* renamed from: c */
    public boolean f231459c;

    static {
        C85635at atVar = new C85635at();
        f231455d = atVar;
        C62942bv.registerDefaultInstance(C85635at.class, atVar);
    }

    private C85635at() {
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
                return newMessageInfo(f231455d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C85635at();
            case 4:
                return new C85634as();
            case 5:
                return f231455d;
            case 6:
                C63010eb ebVar = f231456e;
                if (ebVar == null) {
                    synchronized (C85635at.class) {
                        ebVar = f231456e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f231455d);
                            f231456e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
