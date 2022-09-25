package com.google.protos.p5129p.p5131b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C51756ci;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.p.b.cb */
/* compiled from: PG */
public final class C65798cb extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C65798cb f178854e;

    /* renamed from: f */
    private static volatile C63010eb f178855f;

    /* renamed from: a */
    public int f178856a;

    /* renamed from: b */
    public int f178857b = 0;

    /* renamed from: c */
    public Object f178858c;

    /* renamed from: d */
    public int f178859d;

    static {
        C65798cb cbVar = new C65798cb();
        f178854e = cbVar;
        C62942bv.registerDefaultInstance(C65798cb.class, cbVar);
    }

    private C65798cb() {
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
                return newMessageInfo(f178854e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဿ\u0000\u0003ြ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C65806cj.m96810b(), C51756ci.m86373b(), C65804ch.class});
            case 3:
                return new C65798cb();
            case 4:
                return new C65797ca();
            case 5:
                return f178854e;
            case 6:
                C63010eb ebVar = f178855f;
                if (ebVar == null) {
                    synchronized (C65798cb.class) {
                        ebVar = f178855f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178854e);
                            f178855f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
