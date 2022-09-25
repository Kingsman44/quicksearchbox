package com.google.protos.p5129p.p5130a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.protos.p.a.ab */
/* compiled from: PG */
public final class C65703ab extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C65703ab f178506d;

    /* renamed from: e */
    private static volatile C63010eb f178507e;

    /* renamed from: a */
    public int f178508a;

    /* renamed from: b */
    public int f178509b;

    /* renamed from: c */
    public C62971cq f178510c = C62942bv.emptyProtobufList();

    static {
        C65703ab abVar = new C65703ab();
        f178506d = abVar;
        C62942bv.registerDefaultInstance(C65703ab.class, abVar);
    }

    private C65703ab() {
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
                return newMessageInfo(f178506d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001a", new Object[]{"a", "b", C65753ak.m96798c(), C45240c.f118157a});
            case 3:
                return new C65703ab();
            case 4:
                return new C65702aa();
            case 5:
                return f178506d;
            case 6:
                C63010eb ebVar = f178507e;
                if (ebVar == null) {
                    synchronized (C65703ab.class) {
                        ebVar = f178507e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178506d);
                            f178507e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
