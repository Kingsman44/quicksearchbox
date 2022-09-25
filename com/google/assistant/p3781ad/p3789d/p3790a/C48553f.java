package com.google.assistant.p3781ad.p3789d.p3790a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.a.f */
/* compiled from: PG */
public final class C48553f extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C48553f f125431e;

    /* renamed from: f */
    private static volatile C63010eb f125432f;

    /* renamed from: a */
    public int f125433a;

    /* renamed from: b */
    public int f125434b = 0;

    /* renamed from: c */
    public Object f125435c;

    /* renamed from: d */
    public int f125436d;

    static {
        C48553f fVar = new C48553f();
        f125431e = fVar;
        C62942bv.registerDefaultInstance(C48553f.class, fVar);
    }

    private C48553f() {
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
                return newMessageInfo(f125431e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ျ\u0000\u0002ျ\u0000\u0003ဌ\u0002", new Object[]{C45240c.f118157a, "b", "a", "d", C48554g.f125437a});
            case 3:
                return new C48553f();
            case 4:
                return new C48552e();
            case 5:
                return f125431e;
            case 6:
                C63010eb ebVar = f125432f;
                if (ebVar == null) {
                    synchronized (C48553f.class) {
                        ebVar = f125432f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125431e);
                            f125432f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
