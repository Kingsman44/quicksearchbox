package com.google.protos.p4895aw.p4896a.p4897a.p4898a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.a.a.a.au */
/* compiled from: PG */
public final class C63907au extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C63907au f172809d;

    /* renamed from: g */
    private static volatile C63010eb f172810g;

    /* renamed from: a */
    public C63895ai f172811a;

    /* renamed from: b */
    public C63923bj f172812b;

    /* renamed from: c */
    public C63921bh f172813c;

    /* renamed from: e */
    private int f172814e;

    /* renamed from: f */
    private byte f172815f = 2;

    static {
        C63907au auVar = new C63907au();
        f172809d = auVar;
        C62942bv.registerDefaultInstance(C63907au.class, auVar);
    }

    private C63907au() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f172815f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f172815f = b;
                return null;
            case 2:
                return newMessageInfo(f172809d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C63907au();
            case 4:
                return new C63906at();
            case 5:
                return f172809d;
            case 6:
                C63010eb ebVar = f172810g;
                if (ebVar == null) {
                    synchronized (C63907au.class) {
                        ebVar = f172810g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172809d);
                            f172810g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
