package com.google.p4017at.p4046e.p4047a.p4048a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.at.e.a.a.l */
/* compiled from: PG */
public final class C53931l extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C53931l f141514d;

    /* renamed from: e */
    private static volatile C63010eb f141515e;

    /* renamed from: a */
    public int f141516a;

    /* renamed from: b */
    public long f141517b;

    /* renamed from: c */
    public C63088z f141518c = C63088z.f170246b;

    static {
        C53931l lVar = new C53931l();
        f141514d = lVar;
        C62942bv.registerDefaultInstance(C53931l.class, lVar);
    }

    private C53931l() {
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
                return newMessageInfo(f141514d, "\u0001\u0002\u0000\u0001\u0001\u0006\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0006ည\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C53931l();
            case 4:
                return new C53930k();
            case 5:
                return f141514d;
            case 6:
                C63010eb ebVar = f141515e;
                if (ebVar == null) {
                    synchronized (C53931l.class) {
                        ebVar = f141515e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141514d);
                            f141515e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
