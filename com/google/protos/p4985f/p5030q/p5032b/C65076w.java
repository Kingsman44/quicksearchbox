package com.google.protos.p4985f.p5030q.p5032b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.protos.f.q.b.w */
/* compiled from: PG */
public final class C65076w extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C65076w f176219d;

    /* renamed from: e */
    private static volatile C63010eb f176220e;

    /* renamed from: a */
    public int f176221a;

    /* renamed from: b */
    public int f176222b;

    /* renamed from: c */
    public C62971cq f176223c = emptyProtobufList();

    static {
        C65076w wVar = new C65076w();
        f176219d = wVar;
        C62942bv.registerDefaultInstance(C65076w.class, wVar);
    }

    private C65076w() {
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
                return newMessageInfo(f176219d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"a", "b", C65753ak.m96798c(), C45240c.f118157a, C65075v.class});
            case 3:
                return new C65076w();
            case 4:
                return new C65073t();
            case 5:
                return f176219d;
            case 6:
                C63010eb ebVar = f176220e;
                if (ebVar == null) {
                    synchronized (C65076w.class) {
                        ebVar = f176220e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176219d);
                            f176220e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
