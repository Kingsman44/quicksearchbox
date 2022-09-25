package com.google.common.p4552o.p4566l;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.l.ce */
/* compiled from: PG */
public final class C60167ce extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C60167ce f162759d;

    /* renamed from: e */
    private static volatile C63010eb f162760e;

    /* renamed from: a */
    public int f162761a;

    /* renamed from: b */
    public C60161bz f162762b;

    /* renamed from: c */
    public boolean f162763c;

    static {
        C60167ce ceVar = new C60167ce();
        f162759d = ceVar;
        C62942bv.registerDefaultInstance(C60167ce.class, ceVar);
    }

    private C60167ce() {
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
                return newMessageInfo(f162759d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C60167ce();
            case 4:
                return new C60166cd();
            case 5:
                return f162759d;
            case 6:
                C63010eb ebVar = f162760e;
                if (ebVar == null) {
                    synchronized (C60167ce.class) {
                        ebVar = f162760e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162759d);
                            f162760e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
