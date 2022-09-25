package com.google.lens.p4701g;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.g.ar */
/* compiled from: PG */
public final class C62268ar extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62268ar f168113e;

    /* renamed from: f */
    private static volatile C63010eb f168114f;

    /* renamed from: a */
    public int f168115a;

    /* renamed from: b */
    public int f168116b = 0;

    /* renamed from: c */
    public Object f168117c;

    /* renamed from: d */
    public int f168118d;

    static {
        C62268ar arVar = new C62268ar();
        f168113e = arVar;
        C62942bv.registerDefaultInstance(C62268ar.class, arVar);
    }

    private C62268ar() {
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
                return newMessageInfo(f168113e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C62267aq.f168112a, C62272av.class, C62265ao.class});
            case 3:
                return new C62268ar();
            case 4:
                return new C62266ap();
            case 5:
                return f168113e;
            case 6:
                C63010eb ebVar = f168114f;
                if (ebVar == null) {
                    synchronized (C62268ar.class) {
                        ebVar = f168114f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168113e);
                            f168114f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
