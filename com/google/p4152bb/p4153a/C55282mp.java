package com.google.p4152bb.p4153a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.mp */
/* compiled from: PG */
public final class C55282mp extends C62937bq implements C62938br {

    /* renamed from: d */
    public static final C55282mp f145616d;

    /* renamed from: f */
    private static volatile C63010eb f145617f;

    /* renamed from: a */
    public int f145618a;

    /* renamed from: b */
    public int f145619b;

    /* renamed from: c */
    public C55365pr f145620c;

    /* renamed from: e */
    private byte f145621e = 2;

    static {
        C55282mp mpVar = new C55282mp();
        f145616d = mpVar;
        C62942bv.registerDefaultInstance(C55282mp.class, mpVar);
    }

    private C55282mp() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145621e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145621e = b;
                return null;
            case 2:
                return newMessageInfo(f145616d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဌ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C55281mo.m87652b(), C45240c.f118157a});
            case 3:
                return new C55282mp();
            case 4:
                return new C55279mm();
            case 5:
                return f145616d;
            case 6:
                C63010eb ebVar = f145617f;
                if (ebVar == null) {
                    synchronized (C55282mp.class) {
                        ebVar = f145617f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145616d);
                            f145617f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
