package com.google.p375ai.p378b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.ll */
/* compiled from: PG */
public final class C7828ll extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C7828ll f27455e;

    /* renamed from: f */
    private static volatile C63010eb f27456f;

    /* renamed from: a */
    public int f27457a;

    /* renamed from: b */
    public C8150xj f27458b;

    /* renamed from: c */
    public int f27459c;

    /* renamed from: d */
    public int f27460d;

    static {
        C7828ll llVar = new C7828ll();
        f27455e = llVar;
        C62942bv.registerDefaultInstance(C7828ll.class, llVar);
    }

    private C7828ll() {
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
                return newMessageInfo(f27455e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဆ\u0001\u0004ဆ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C7828ll();
            case 4:
                return new C7827lk();
            case 5:
                return f27455e;
            case 6:
                C63010eb ebVar = f27456f;
                if (ebVar == null) {
                    synchronized (C7828ll.class) {
                        ebVar = f27456f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27455e);
                            f27456f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
