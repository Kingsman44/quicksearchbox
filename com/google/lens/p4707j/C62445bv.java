package com.google.lens.p4707j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.bv */
/* compiled from: PG */
public final class C62445bv extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62445bv f168618e;

    /* renamed from: f */
    private static volatile C63010eb f168619f;

    /* renamed from: a */
    public int f168620a;

    /* renamed from: b */
    public C62441br f168621b;

    /* renamed from: c */
    public C62491dn f168622c;

    /* renamed from: d */
    public float f168623d;

    static {
        C62445bv bvVar = new C62445bv();
        f168618e = bvVar;
        C62942bv.registerDefaultInstance(C62445bv.class, bvVar);
    }

    private C62445bv() {
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
                return newMessageInfo(f168618e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ခ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C62445bv();
            case 4:
                return new C62444bu();
            case 5:
                return f168618e;
            case 6:
                C63010eb ebVar = f168619f;
                if (ebVar == null) {
                    synchronized (C62445bv.class) {
                        ebVar = f168619f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168618e);
                            f168619f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
