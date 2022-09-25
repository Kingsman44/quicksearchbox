package com.google.assistant.p3897e.p3910e.p3911a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4691l.p4692a.p4693a.C62018f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.e.a.t */
/* compiled from: PG */
public final class C51205t extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C51205t f133298d;

    /* renamed from: e */
    private static volatile C63010eb f133299e;

    /* renamed from: a */
    public int f133300a;

    /* renamed from: b */
    public C62018f f133301b;

    /* renamed from: c */
    public int f133302c = 1;

    static {
        C51205t tVar = new C51205t();
        f133298d = tVar;
        C62942bv.registerDefaultInstance(C51205t.class, tVar);
    }

    private C51205t() {
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
                return newMessageInfo(f133298d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C51203r.f133297a});
            case 3:
                return new C51205t();
            case 4:
                return new C51202q();
            case 5:
                return f133298d;
            case 6:
                C63010eb ebVar = f133299e;
                if (ebVar == null) {
                    synchronized (C51205t.class) {
                        ebVar = f133299e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133298d);
                            f133299e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
