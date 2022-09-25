package com.google.p4605f.p4607b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.f.b.h */
/* compiled from: PG */
public final class C61086h extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C61086h f165371a;

    /* renamed from: e */
    private static volatile C63010eb f165372e;

    /* renamed from: b */
    private int f165373b;

    /* renamed from: c */
    private C60220t f165374c;

    /* renamed from: d */
    private byte f165375d = 2;

    static {
        C61086h hVar = new C61086h();
        f165371a = hVar;
        C62942bv.registerDefaultInstance(C61086h.class, hVar);
    }

    private C61086h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f165375d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f165375d = b;
                return null;
            case 2:
                return newMessageInfo(f165371a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᐉ\u0002", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C61086h();
            case 4:
                return new C61085g();
            case 5:
                return f165371a;
            case 6:
                C63010eb ebVar = f165372e;
                if (ebVar == null) {
                    synchronized (C61086h.class) {
                        ebVar = f165372e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f165371a);
                            f165372e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
