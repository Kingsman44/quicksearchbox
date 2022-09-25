package com.google.assistant.p3897e.p3902c.p3907c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.assistant.e.c.c.ey */
/* compiled from: PG */
public final class C51061ey extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C51061ey f132958e;

    /* renamed from: f */
    private static volatile C63010eb f132959f;

    /* renamed from: a */
    public int f132960a;

    /* renamed from: b */
    public C51058ev f132961b;

    /* renamed from: c */
    public int f132962c;

    /* renamed from: d */
    public C63042fg f132963d;

    static {
        C51061ey eyVar = new C51061ey();
        f132958e = eyVar;
        C62942bv.registerDefaultInstance(C51061ey.class, eyVar);
    }

    private C51061ey() {
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
                return newMessageInfo(f132958e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, C51059ew.f132957a, "d"});
            case 3:
                return new C51061ey();
            case 4:
                return new C51060ex();
            case 5:
                return f132958e;
            case 6:
                C63010eb ebVar = f132959f;
                if (ebVar == null) {
                    synchronized (C51061ey.class) {
                        ebVar = f132959f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132958e);
                            f132959f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
