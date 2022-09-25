package com.google.p4017at.p4060h.p4071c.p4072a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.at.h.c.a.c */
/* compiled from: PG */
public final class C54207c extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54207c f142263d;

    /* renamed from: e */
    private static volatile C63010eb f142264e;

    /* renamed from: a */
    public int f142265a;

    /* renamed from: b */
    public C63088z f142266b = C63088z.f170246b;

    /* renamed from: c */
    public C63088z f142267c = C63088z.f170246b;

    static {
        C54207c cVar = new C54207c();
        f142263d = cVar;
        C62942bv.registerDefaultInstance(C54207c.class, cVar);
    }

    private C54207c() {
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
                return newMessageInfo(f142263d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C54207c();
            case 4:
                return new C54206b();
            case 5:
                return f142263d;
            case 6:
                C63010eb ebVar = f142264e;
                if (ebVar == null) {
                    synchronized (C54207c.class) {
                        ebVar = f142264e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142263d);
                            f142264e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
