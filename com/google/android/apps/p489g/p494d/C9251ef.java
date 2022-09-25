package com.google.android.apps.p489g.p494d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import p5451f.p5452a.p5453a.p5454a.C69400av;

/* renamed from: com.google.android.apps.g.d.ef */
/* compiled from: PG */
public final class C9251ef extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C9251ef f31988f;

    /* renamed from: g */
    private static volatile C63010eb f31989g;

    /* renamed from: a */
    public int f31990a;

    /* renamed from: b */
    public int f31991b;

    /* renamed from: c */
    public C69400av f31992c;

    /* renamed from: d */
    public C9268l f31993d;

    /* renamed from: e */
    public boolean f31994e;

    static {
        C9251ef efVar = new C9251ef();
        f31988f = efVar;
        C62942bv.registerDefaultInstance(C9251ef.class, efVar);
    }

    private C9251ef() {
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
                return newMessageInfo(f31988f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C9251ef();
            case 4:
                return new C9250ee();
            case 5:
                return f31988f;
            case 6:
                C63010eb ebVar = f31989g;
                if (ebVar == null) {
                    synchronized (C9251ef.class) {
                        ebVar = f31989g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31988f);
                            f31989g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
