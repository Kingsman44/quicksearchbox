package com.google.android.apps.gsa.opa.smartspace.p6455d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opa.smartspace.d.l */
/* compiled from: PG */
public final class C83769l extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C83769l f228317f;

    /* renamed from: g */
    private static volatile C63010eb f228318g;

    /* renamed from: a */
    public int f228319a;

    /* renamed from: b */
    public long f228320b;

    /* renamed from: c */
    public long f228321c;

    /* renamed from: d */
    public boolean f228322d;

    /* renamed from: e */
    public long f228323e;

    static {
        C83769l lVar = new C83769l();
        f228317f = lVar;
        C62942bv.registerDefaultInstance(C83769l.class, lVar);
    }

    private C83769l() {
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
                return newMessageInfo(f228317f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004ဂ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C83769l();
            case 4:
                return new C83768k();
            case 5:
                return f228317f;
            case 6:
                C63010eb ebVar = f228318g;
                if (ebVar == null) {
                    synchronized (C83769l.class) {
                        ebVar = f228318g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228317f);
                            f228318g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
