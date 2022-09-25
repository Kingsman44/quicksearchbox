package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.ci */
/* compiled from: PG */
public final class C59694ci extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C59694ci f160157e;

    /* renamed from: g */
    private static volatile C63010eb f160158g;

    /* renamed from: a */
    public int f160159a;

    /* renamed from: b */
    public int f160160b;

    /* renamed from: c */
    public long f160161c;

    /* renamed from: d */
    public C59687cb f160162d;

    /* renamed from: f */
    private byte f160163f = 2;

    static {
        C59694ci ciVar = new C59694ci();
        f160157e = ciVar;
        C62942bv.registerDefaultInstance(C59694ci.class, ciVar);
    }

    private C59694ci() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f160163f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f160163f = b;
                return null;
            case 2:
                return newMessageInfo(f160157e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001င\u0000\u0002ဃ\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C59694ci();
            case 4:
                return new C59693ch();
            case 5:
                return f160157e;
            case 6:
                C63010eb ebVar = f160158g;
                if (ebVar == null) {
                    synchronized (C59694ci.class) {
                        ebVar = f160158g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f160157e);
                            f160158g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
