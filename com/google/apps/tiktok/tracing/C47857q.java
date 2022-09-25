package com.google.apps.tiktok.tracing;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.apps.tiktok.tracing.q */
/* compiled from: PG */
public final class C47857q extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C47857q f123919d;

    /* renamed from: e */
    private static volatile C63010eb f123920e;

    /* renamed from: a */
    public int f123921a;

    /* renamed from: b */
    public long f123922b;

    /* renamed from: c */
    public int f123923c;

    static {
        C47857q qVar = new C47857q();
        f123919d = qVar;
        C62942bv.registerDefaultInstance(C47857q.class, qVar);
    }

    private C47857q() {
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
                return newMessageInfo(f123919d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C47857q();
            case 4:
                return new C47856p();
            case 5:
                return f123919d;
            case 6:
                C63010eb ebVar = f123920e;
                if (ebVar == null) {
                    synchronized (C47857q.class) {
                        ebVar = f123920e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f123919d);
                            f123920e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
