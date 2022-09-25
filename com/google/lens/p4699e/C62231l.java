package com.google.lens.p4699e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.lens.p4707j.C62491dn;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.e.l */
/* compiled from: PG */
public final class C62231l extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62231l f168023e;

    /* renamed from: f */
    private static volatile C63010eb f168024f;

    /* renamed from: a */
    public int f168025a;

    /* renamed from: b */
    public C62491dn f168026b;

    /* renamed from: c */
    public float f168027c;

    /* renamed from: d */
    public boolean f168028d;

    static {
        C62231l lVar = new C62231l();
        f168023e = lVar;
        C62942bv.registerDefaultInstance(C62231l.class, lVar);
    }

    private C62231l() {
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
                return newMessageInfo(f168023e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ခ\u0001\u0004ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C62231l();
            case 4:
                return new C62230k();
            case 5:
                return f168023e;
            case 6:
                C63010eb ebVar = f168024f;
                if (ebVar == null) {
                    synchronized (C62231l.class) {
                        ebVar = f168024f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168023e);
                            f168024f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
