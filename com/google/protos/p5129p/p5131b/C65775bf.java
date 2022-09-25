package com.google.protos.p5129p.p5131b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.protos.p.b.bf */
/* compiled from: PG */
public final class C65775bf extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C65775bf f178813d;

    /* renamed from: e */
    private static volatile C63010eb f178814e;

    /* renamed from: a */
    public int f178815a;

    /* renamed from: b */
    public C63088z f178816b = C63088z.f170246b;

    /* renamed from: c */
    public int f178817c;

    static {
        C65775bf bfVar = new C65775bf();
        f178813d = bfVar;
        C62942bv.registerDefaultInstance(C65775bf.class, bfVar);
    }

    private C65775bf() {
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
                return newMessageInfo(f178813d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C65775bf();
            case 4:
                return new C65774be();
            case 5:
                return f178813d;
            case 6:
                C63010eb ebVar = f178814e;
                if (ebVar == null) {
                    synchronized (C65775bf.class) {
                        ebVar = f178814e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178813d);
                            f178814e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
