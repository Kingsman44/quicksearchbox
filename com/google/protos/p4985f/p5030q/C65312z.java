package com.google.protos.p4985f.p5030q;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4152bb.p4153a.C55421x;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.z */
/* compiled from: PG */
public final class C65312z extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C65312z f176642e;

    /* renamed from: f */
    private static volatile C63010eb f176643f;

    /* renamed from: a */
    public int f176644a;

    /* renamed from: b */
    public int f176645b = 0;

    /* renamed from: c */
    public Object f176646c;

    /* renamed from: d */
    public int f176647d;

    static {
        C65312z zVar = new C65312z();
        f176642e = zVar;
        C62942bv.registerDefaultInstance(C65312z.class, zVar);
    }

    private C65312z() {
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
                return newMessageInfo(f176642e, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0003ျ\u0000\u0004ြ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C55421x.m87687b(), C64999al.class});
            case 3:
                return new C65312z();
            case 4:
                return new C65311y();
            case 5:
                return f176642e;
            case 6:
                C63010eb ebVar = f176643f;
                if (ebVar == null) {
                    synchronized (C65312z.class) {
                        ebVar = f176643f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176642e);
                            f176643f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
