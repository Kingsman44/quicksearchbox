package com.google.lens.p4701g;

import com.google.android.libraries.p1657ba.p1664c.p1668c.C19652b;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.lens.g.db */
/* compiled from: PG */
public final class C62333db extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62333db f168274e;

    /* renamed from: f */
    private static volatile C63010eb f168275f;

    /* renamed from: a */
    public int f168276a;

    /* renamed from: b */
    public boolean f168277b;

    /* renamed from: c */
    public int f168278c;

    /* renamed from: d */
    public C62971cq f168279d = emptyProtobufList();

    static {
        C62333db dbVar = new C62333db();
        f168274e = dbVar;
        C62942bv.registerDefaultInstance(C62333db.class, dbVar);
    }

    private C62333db() {
        C63088z zVar = C63088z.f170246b;
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
                return newMessageInfo(f168274e, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0001\u0000\u0001ဇ\u0000\u0005ဌ\u0004\u0006\u001b", new Object[]{"a", "b", C45240c.f118157a, C62330cz.f168250a, "d", C19652b.class});
            case 3:
                return new C62333db();
            case 4:
                return new C62329cy();
            case 5:
                return f168274e;
            case 6:
                C63010eb ebVar = f168275f;
                if (ebVar == null) {
                    synchronized (C62333db.class) {
                        ebVar = f168275f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168274e);
                            f168275f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
