package com.google.p4140ba.p4141a.p4145b.p4146a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.b.a.dg */
/* compiled from: PG */
public final class C54895dg extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C54895dg f144242e;

    /* renamed from: f */
    private static volatile C63010eb f144243f;

    /* renamed from: a */
    public int f144244a;

    /* renamed from: b */
    public C54864cc f144245b;

    /* renamed from: c */
    public C54894df f144246c;

    /* renamed from: d */
    public C54864cc f144247d;

    static {
        C54895dg dgVar = new C54895dg();
        f144242e = dgVar;
        C62942bv.registerDefaultInstance(C54895dg.class, dgVar);
    }

    private C54895dg() {
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
                return newMessageInfo(f144242e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C54895dg();
            case 4:
                return new C54892dd();
            case 5:
                return f144242e;
            case 6:
                C63010eb ebVar = f144243f;
                if (ebVar == null) {
                    synchronized (C54895dg.class) {
                        ebVar = f144243f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144242e);
                            f144243f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
