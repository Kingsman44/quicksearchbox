package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.rr */
/* compiled from: PG */
public final class C60486rr extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C60486rr f163695e;

    /* renamed from: f */
    private static volatile C63010eb f163696f;

    /* renamed from: a */
    public int f163697a;

    /* renamed from: b */
    public long f163698b;

    /* renamed from: c */
    public long f163699c;

    /* renamed from: d */
    public long f163700d;

    static {
        C60486rr rrVar = new C60486rr();
        f163695e = rrVar;
        C62942bv.registerDefaultInstance(C60486rr.class, rrVar);
    }

    private C60486rr() {
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
                return newMessageInfo(f163695e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C60486rr();
            case 4:
                return new C60485rq();
            case 5:
                return f163695e;
            case 6:
                C63010eb ebVar = f163696f;
                if (ebVar == null) {
                    synchronized (C60486rr.class) {
                        ebVar = f163696f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163695e);
                            f163696f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
