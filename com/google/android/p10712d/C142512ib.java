package com.google.android.p10712d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.ib */
/* compiled from: PG */
public final class C142512ib extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C142512ib f386720f;

    /* renamed from: g */
    private static volatile C63010eb f386721g;

    /* renamed from: a */
    public int f386722a;

    /* renamed from: b */
    public int f386723b = 0;

    /* renamed from: c */
    public Object f386724c;

    /* renamed from: d */
    public int f386725d = 1;

    /* renamed from: e */
    public long f386726e;

    static {
        C142512ib ibVar = new C142512ib();
        f386720f = ibVar;
        C62942bv.registerDefaultInstance(C142512ib.class, ibVar);
    }

    private C142512ib() {
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
                return newMessageInfo(f386720f, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ြ\u0000\u0004ြ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C142511ia.f386719a, "e", C142514id.class, C142517ig.class});
            case 3:
                return new C142512ib();
            case 4:
                return new C142509hz();
            case 5:
                return f386720f;
            case 6:
                C63010eb ebVar = f386721g;
                if (ebVar == null) {
                    synchronized (C142512ib.class) {
                        ebVar = f386721g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386720f);
                            f386721g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
