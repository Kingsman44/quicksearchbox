package com.google.assistant.p3803ag.p3809c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.cw */
/* compiled from: PG */
public final class C49003cw extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C49003cw f126755e;

    /* renamed from: f */
    private static volatile C63010eb f126756f;

    /* renamed from: a */
    public int f126757a;

    /* renamed from: b */
    public int f126758b;

    /* renamed from: c */
    public int f126759c;

    /* renamed from: d */
    public long f126760d;

    static {
        C49003cw cwVar = new C49003cw();
        f126755e = cwVar;
        C62942bv.registerDefaultInstance(C49003cw.class, cwVar);
    }

    private C49003cw() {
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
                return newMessageInfo(f126755e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", C48999cs.f126753a, C45240c.f118157a, C49001cu.f126754a, "d"});
            case 3:
                return new C49003cw();
            case 4:
                return new C48998cr();
            case 5:
                return f126755e;
            case 6:
                C63010eb ebVar = f126756f;
                if (ebVar == null) {
                    synchronized (C49003cw.class) {
                        ebVar = f126756f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126755e);
                            f126756f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
