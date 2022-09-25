package com.google.common.p4552o.p4566l;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.l.r */
/* compiled from: PG */
public final class C60218r extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C60218r f162925d;

    /* renamed from: f */
    private static volatile C63010eb f162926f;

    /* renamed from: a */
    public int f162927a;

    /* renamed from: b */
    public C60220t f162928b;

    /* renamed from: c */
    public long f162929c;

    /* renamed from: e */
    private byte f162930e = 2;

    static {
        C60218r rVar = new C60218r();
        f162925d = rVar;
        C62942bv.registerDefaultInstance(C60218r.class, rVar);
    }

    private C60218r() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f162930e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f162930e = b;
                return null;
            case 2:
                return newMessageInfo(f162925d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C60218r();
            case 4:
                return new C60217q();
            case 5:
                return f162925d;
            case 6:
                C63010eb ebVar = f162926f;
                if (ebVar == null) {
                    synchronized (C60218r.class) {
                        ebVar = f162926f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162925d);
                            f162926f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
