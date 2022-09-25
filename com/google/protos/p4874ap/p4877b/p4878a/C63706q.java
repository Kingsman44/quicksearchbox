package com.google.protos.p4874ap.p4877b.p4878a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4184bj.p4204d.p4205a.C56005a;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ap.b.a.q */
/* compiled from: PG */
public final class C63706q extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C63706q f172241d;

    /* renamed from: e */
    private static volatile C63010eb f172242e;

    /* renamed from: a */
    public int f172243a;

    /* renamed from: b */
    public C62971cq f172244b = emptyProtobufList();

    /* renamed from: c */
    public int f172245c;

    static {
        C63706q qVar = new C63706q();
        f172241d = qVar;
        C62942bv.registerDefaultInstance(C63706q.class, qVar);
    }

    private C63706q() {
    }

    /* renamed from: a */
    public final void mo59233a() {
        C62971cq cqVar = this.f172244b;
        if (!cqVar.mo58948c()) {
            this.f172244b = C62942bv.mutableCopy(cqVar);
        }
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
                return newMessageInfo(f172241d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001\u001b\u0003ဌ\u0001", new Object[]{"a", "b", C63705p.class, C45240c.f118157a, C56005a.f149166a});
            case 3:
                return new C63706q();
            case 4:
                return new C63701l();
            case 5:
                return f172241d;
            case 6:
                C63010eb ebVar = f172242e;
                if (ebVar == null) {
                    synchronized (C63706q.class) {
                        ebVar = f172242e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172241d);
                            f172242e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
