package com.google.android.apps.gsa.sidekick.main.trigger;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7805kp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.sidekick.main.trigger.g */
/* compiled from: PG */
public final class C91630g extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C91630g f255570e;

    /* renamed from: f */
    private static volatile C63010eb f255571f;

    /* renamed from: a */
    public int f255572a;

    /* renamed from: b */
    public C7805kp f255573b;

    /* renamed from: c */
    public long f255574c;

    /* renamed from: d */
    public C91628e f255575d;

    static {
        C91630g gVar = new C91630g();
        f255570e = gVar;
        C62942bv.registerDefaultInstance(C91630g.class, gVar);
    }

    private C91630g() {
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
                return newMessageInfo(f255570e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C91630g();
            case 4:
                return new C91629f();
            case 5:
                return f255570e;
            case 6:
                C63010eb ebVar = f255571f;
                if (ebVar == null) {
                    synchronized (C91630g.class) {
                        ebVar = f255571f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f255570e);
                            f255571f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
