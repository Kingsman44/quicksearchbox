package com.google.p4017at.p4018a.p4019a.p4020a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.a.a.a.bq */
/* compiled from: PG */
public final class C53786bq extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C53786bq f141173e;

    /* renamed from: f */
    private static volatile C63010eb f141174f;

    /* renamed from: a */
    public int f141175a;

    /* renamed from: b */
    public C53793d f141176b;

    /* renamed from: c */
    public C53769b f141177c;

    /* renamed from: d */
    public C53799j f141178d;

    static {
        C53786bq bqVar = new C53786bq();
        f141173e = bqVar;
        C62942bv.registerDefaultInstance(C53786bq.class, bqVar);
    }

    private C53786bq() {
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
                return newMessageInfo(f141173e, "\u0001\u0003\u0000\u0001\u0002!\u0003\u0000\u0000\u0000\u0002ဉ\n\bဉ\u0000!ဉ\u0001", new Object[]{"a", "d", "b", C45240c.f118157a});
            case 3:
                return new C53786bq();
            case 4:
                return new C53785bp();
            case 5:
                return f141173e;
            case 6:
                C63010eb ebVar = f141174f;
                if (ebVar == null) {
                    synchronized (C53786bq.class) {
                        ebVar = f141174f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141173e);
                            f141174f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
