package com.google.protos.p5129p.p5130a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p4985f.p5030q.p5032b.C65031ap;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.protos.p.a.q */
/* compiled from: PG */
public final class C65732q extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C65732q f178569d;

    /* renamed from: f */
    private static volatile C63010eb f178570f;

    /* renamed from: a */
    public int f178571a;

    /* renamed from: b */
    public C65031ap f178572b;

    /* renamed from: c */
    public C63662ac f178573c;

    /* renamed from: e */
    private int f178574e;

    static {
        C65732q qVar = new C65732q();
        f178569d = qVar;
        C62942bv.registerDefaultInstance(C65732q.class, qVar);
    }

    private C65732q() {
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
                return newMessageInfo(f178569d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"e", "a", C65753ak.m96798c(), "b", C45240c.f118157a});
            case 3:
                return new C65732q();
            case 4:
                return new C65731p();
            case 5:
                return f178569d;
            case 6:
                C63010eb ebVar = f178570f;
                if (ebVar == null) {
                    synchronized (C65732q.class) {
                        ebVar = f178570f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178569d);
                            f178570f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
