package com.google.android.libraries.search.p2994f.p2995a.p2996a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.search.f.a.a.b */
/* compiled from: PG */
public final class C38308b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C38308b f101477d;

    /* renamed from: e */
    private static volatile C63010eb f101478e;

    /* renamed from: a */
    public int f101479a;

    /* renamed from: b */
    public boolean f101480b;

    /* renamed from: c */
    public C63088z f101481c = C63088z.f170246b;

    static {
        C38308b bVar = new C38308b();
        f101477d = bVar;
        C62942bv.registerDefaultInstance(C38308b.class, bVar);
    }

    private C38308b() {
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
                return newMessageInfo(f101477d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0003ည\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C38308b();
            case 4:
                return new C38307a();
            case 5:
                return f101477d;
            case 6:
                C63010eb ebVar = f101478e;
                if (ebVar == null) {
                    synchronized (C38308b.class) {
                        ebVar = f101478e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f101477d);
                            f101478e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
