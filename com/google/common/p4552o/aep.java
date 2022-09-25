package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.aep */
/* compiled from: PG */
public final class aep extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final aep f158474a;

    /* renamed from: e */
    private static volatile C63010eb f158475e;

    /* renamed from: b */
    private int f158476b;

    /* renamed from: c */
    private C60220t f158477c;

    /* renamed from: d */
    private byte f158478d = 2;

    static {
        aep aep = new aep();
        f158474a = aep;
        C62942bv.registerDefaultInstance(aep.class, aep);
    }

    private aep() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f158478d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f158478d = b;
                return null;
            case 2:
                return newMessageInfo(f158474a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0001", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new aep();
            case 4:
                return new aeo();
            case 5:
                return f158474a;
            case 6:
                C63010eb ebVar = f158475e;
                if (ebVar == null) {
                    synchronized (aep.class) {
                        ebVar = f158475e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158474a);
                            f158475e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
