package com.google.protos.p4841al.p4842a.p4845c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.al.a.c.h */
/* compiled from: PG */
public final class C63309h extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C63309h f171107e;

    /* renamed from: f */
    private static volatile C63010eb f171108f;

    /* renamed from: a */
    public int f171109a;

    /* renamed from: b */
    public C63313l f171110b;

    /* renamed from: c */
    public C63313l f171111c;

    /* renamed from: d */
    public C63313l f171112d;

    static {
        C63309h hVar = new C63309h();
        f171107e = hVar;
        C62942bv.registerDefaultInstance(C63309h.class, hVar);
    }

    private C63309h() {
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
                return newMessageInfo(f171107e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C63309h();
            case 4:
                return new C63308g();
            case 5:
                return f171107e;
            case 6:
                C63010eb ebVar = f171108f;
                if (ebVar == null) {
                    synchronized (C63309h.class) {
                        ebVar = f171108f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171107e);
                            f171108f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
