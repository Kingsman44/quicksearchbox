package com.google.p4184bj.p4193c.p4197c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4102au.p4103a.p4104a.p4105a.C54566d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bj.c.c.ba */
/* compiled from: PG */
public final class C55954ba extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C55954ba f148941a;

    /* renamed from: e */
    private static volatile C63010eb f148942e;

    /* renamed from: b */
    private int f148943b;

    /* renamed from: c */
    private C54566d f148944c;

    /* renamed from: d */
    private byte f148945d = 2;

    static {
        C55954ba baVar = new C55954ba();
        f148941a = baVar;
        C62942bv.registerDefaultInstance(C55954ba.class, baVar);
    }

    private C55954ba() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f148945d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f148945d = b;
                return null;
            case 2:
                return newMessageInfo(f148941a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C55954ba();
            case 4:
                return new C55952az();
            case 5:
                return f148941a;
            case 6:
                C63010eb ebVar = f148942e;
                if (ebVar == null) {
                    synchronized (C55954ba.class) {
                        ebVar = f148942e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f148941a);
                            f148942e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
