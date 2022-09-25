package com.google.speech.p5218j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.speech.j.p */
/* compiled from: PG */
public final class C67171p extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C67171p f182575e;

    /* renamed from: f */
    private static volatile C63010eb f182576f;

    /* renamed from: a */
    public int f182577a;

    /* renamed from: b */
    public C63088z f182578b = C63088z.f170246b;

    /* renamed from: c */
    public C67175t f182579c;

    /* renamed from: d */
    public long f182580d;

    static {
        C67171p pVar = new C67171p();
        f182575e = pVar;
        C62942bv.registerDefaultInstance(C67171p.class, pVar);
    }

    private C67171p() {
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
                return newMessageInfo(f182575e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ဉ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C67171p();
            case 4:
                return new C67170o();
            case 5:
                return f182575e;
            case 6:
                C63010eb ebVar = f182576f;
                if (ebVar == null) {
                    synchronized (C67171p.class) {
                        ebVar = f182576f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182575e);
                            f182576f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
