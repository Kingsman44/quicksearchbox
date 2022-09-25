package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.ahy */
/* compiled from: PG */
public final class ahy extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final ahy f158787b;

    /* renamed from: e */
    private static volatile C63010eb f158788e;

    /* renamed from: a */
    public C60218r f158789a;

    /* renamed from: c */
    private int f158790c;

    /* renamed from: d */
    private byte f158791d = 2;

    static {
        ahy ahy = new ahy();
        f158787b = ahy;
        C62942bv.registerDefaultInstance(ahy.class, ahy);
    }

    private ahy() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f158791d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f158791d = b;
                return null;
            case 2:
                return newMessageInfo(f158787b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new ahy();
            case 4:
                return new ahx();
            case 5:
                return f158787b;
            case 6:
                C63010eb ebVar = f158788e;
                if (ebVar == null) {
                    synchronized (ahy.class) {
                        ebVar = f158788e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158787b);
                            f158788e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
