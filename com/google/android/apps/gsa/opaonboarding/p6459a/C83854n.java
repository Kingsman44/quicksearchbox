package com.google.android.apps.gsa.opaonboarding.p6459a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opaonboarding.a.n */
/* compiled from: PG */
public final class C83854n extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C83854n f228493d;

    /* renamed from: e */
    private static volatile C63010eb f228494e;

    /* renamed from: a */
    public int f228495a;

    /* renamed from: b */
    public int f228496b;

    /* renamed from: c */
    public int f228497c;

    static {
        C83854n nVar = new C83854n();
        f228493d = nVar;
        C62942bv.registerDefaultInstance(C83854n.class, nVar);
    }

    private C83854n() {
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
                return newMessageInfo(f228493d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C83850j.f228491a, C45240c.f118157a, C83852l.f228492a});
            case 3:
                return new C83854n();
            case 4:
                return new C83849i();
            case 5:
                return f228493d;
            case 6:
                C63010eb ebVar = f228494e;
                if (ebVar == null) {
                    synchronized (C83854n.class) {
                        ebVar = f228494e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228493d);
                            f228494e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
