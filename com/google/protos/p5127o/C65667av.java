package com.google.protos.p5127o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.o.av */
/* compiled from: PG */
public final class C65667av extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C65667av f178428e;

    /* renamed from: f */
    private static volatile C63010eb f178429f;

    /* renamed from: a */
    public int f178430a;

    /* renamed from: b */
    public C65686l f178431b;

    /* renamed from: c */
    public boolean f178432c;

    /* renamed from: d */
    public C65686l f178433d;

    static {
        C65667av avVar = new C65667av();
        f178428e = avVar;
        C62942bv.registerDefaultInstance(C65667av.class, avVar);
    }

    private C65667av() {
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
                return newMessageInfo(f178428e, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဇ\u0001\u0006ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C65667av();
            case 4:
                return new C65666au();
            case 5:
                return f178428e;
            case 6:
                C63010eb ebVar = f178429f;
                if (ebVar == null) {
                    synchronized (C65667av.class) {
                        ebVar = f178429f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178428e);
                            f178429f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
