package com.google.android.libraries.search.p2904c.p2982x;

import com.google.android.libraries.search.p2904c.C37664hk;
import com.google.android.libraries.search.p2904c.C37679hz;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.x.z */
/* compiled from: PG */
public final class C38267z extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C38267z f101378d;

    /* renamed from: e */
    private static volatile C63010eb f101379e;

    /* renamed from: a */
    public int f101380a;

    /* renamed from: b */
    public C37664hk f101381b;

    /* renamed from: c */
    public C37679hz f101382c;

    static {
        C38267z zVar = new C38267z();
        f101378d = zVar;
        C62942bv.registerDefaultInstance(C38267z.class, zVar);
    }

    private C38267z() {
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
                return newMessageInfo(f101378d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C38267z();
            case 4:
                return new C38266y();
            case 5:
                return f101378d;
            case 6:
                C63010eb ebVar = f101379e;
                if (ebVar == null) {
                    synchronized (C38267z.class) {
                        ebVar = f101379e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f101378d);
                            f101379e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
