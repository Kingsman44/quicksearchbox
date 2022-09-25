package com.google.p4017at.p4056g.p4057a.p4058a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.g.a.a.ci */
/* compiled from: PG */
public final class C54028ci extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54028ci f141752d;

    /* renamed from: e */
    private static volatile C63010eb f141753e;

    /* renamed from: a */
    public int f141754a = 0;

    /* renamed from: b */
    public Object f141755b;

    /* renamed from: c */
    public C53976ak f141756c;

    static {
        C54028ci ciVar = new C54028ci();
        f141752d = ciVar;
        C62942bv.registerDefaultInstance(C54028ci.class, ciVar);
    }

    private C54028ci() {
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
                return newMessageInfo(f141752d, "\u0000\u0003\u0001\u0000\u0004\u0006\u0003\u0000\u0000\u0000\u0004\t\u0005Ȼ\u0000\u0006Ȼ\u0000", new Object[]{"b", "a", C45240c.f118157a});
            case 3:
                return new C54028ci();
            case 4:
                return new C54027ch();
            case 5:
                return f141752d;
            case 6:
                C63010eb ebVar = f141753e;
                if (ebVar == null) {
                    synchronized (C54028ci.class) {
                        ebVar = f141753e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141752d);
                            f141753e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
