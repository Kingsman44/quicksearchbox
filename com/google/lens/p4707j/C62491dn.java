package com.google.lens.p4707j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.dn */
/* compiled from: PG */
public final class C62491dn extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62491dn f168710e;

    /* renamed from: f */
    private static volatile C63010eb f168711f;

    /* renamed from: a */
    public int f168712a;

    /* renamed from: b */
    public C62971cq f168713b = emptyProtobufList();

    /* renamed from: c */
    public int f168714c;

    /* renamed from: d */
    public int f168715d;

    static {
        C62491dn dnVar = new C62491dn();
        f168710e = dnVar;
        C62942bv.registerDefaultInstance(C62491dn.class, dnVar);
    }

    private C62491dn() {
    }

    /* renamed from: a */
    public final void mo58502a() {
        C62971cq cqVar = this.f168713b;
        if (!cqVar.mo58948c()) {
            this.f168713b = C62942bv.mutableCopy(cqVar);
        }
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
                return newMessageInfo(f168710e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဌ\u0000\u0003ဌ\u0001", new Object[]{"a", "b", C62488dk.class, C45240c.f118157a, C62490dm.m94787b(), "d", C62579m.f168954a});
            case 3:
                return new C62491dn();
            case 4:
                return new C62486di();
            case 5:
                return f168710e;
            case 6:
                C63010eb ebVar = f168711f;
                if (ebVar == null) {
                    synchronized (C62491dn.class) {
                        ebVar = f168711f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168710e);
                            f168711f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
