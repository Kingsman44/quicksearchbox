package com.google.common.p4552o.p4553a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.a.l */
/* compiled from: PG */
public final class C59556l extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C59556l f158032e;

    /* renamed from: f */
    private static volatile C63010eb f158033f;

    /* renamed from: a */
    public int f158034a;

    /* renamed from: b */
    public int f158035b = 0;

    /* renamed from: c */
    public Object f158036c;

    /* renamed from: d */
    public long f158037d;

    static {
        C59556l lVar = new C59556l();
        f158032e = lVar;
        C62942bv.registerDefaultInstance(C59556l.class, lVar);
    }

    private C59556l() {
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
                return newMessageInfo(f158032e, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ဂ\u0003", new Object[]{C45240c.f118157a, "b", "a", C59555k.class, C59553i.class, C59550f.class, "d"});
            case 3:
                return new C59556l();
            case 4:
                return new C59503c();
            case 5:
                return f158032e;
            case 6:
                C63010eb ebVar = f158033f;
                if (ebVar == null) {
                    synchronized (C59556l.class) {
                        ebVar = f158033f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158032e);
                            f158033f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
