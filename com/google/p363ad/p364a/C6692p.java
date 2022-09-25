package com.google.p363ad.p364a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ad.a.p */
/* compiled from: PG */
public final class C6692p extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C6692p f19980e;

    /* renamed from: f */
    private static volatile C63010eb f19981f;

    /* renamed from: a */
    public int f19982a;

    /* renamed from: b */
    public int f19983b = 0;

    /* renamed from: c */
    public Object f19984c;

    /* renamed from: d */
    public int f19985d;

    static {
        C6692p pVar = new C6692p();
        f19980e = pVar;
        C62942bv.registerDefaultInstance(C6692p.class, pVar);
    }

    private C6692p() {
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
                return newMessageInfo(f19980e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ျ\u0000\u0002ြ\u0000\u0003ဌ\u0002", new Object[]{C45240c.f118157a, "b", "a", C6688l.class, "d", C6686j.f19966a});
            case 3:
                return new C6692p();
            case 4:
                return new C6691o();
            case 5:
                return f19980e;
            case 6:
                C63010eb ebVar = f19981f;
                if (ebVar == null) {
                    synchronized (C6692p.class) {
                        ebVar = f19981f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f19980e);
                            f19981f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
