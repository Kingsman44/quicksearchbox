package com.google.lens.p4707j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.c */
/* compiled from: PG */
public final class C62450c extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62450c f168634c;

    /* renamed from: d */
    private static volatile C63010eb f168635d;

    /* renamed from: a */
    public int f168636a;

    /* renamed from: b */
    public int f168637b;

    static {
        C62450c cVar = new C62450c();
        f168634c = cVar;
        C62942bv.registerDefaultInstance(C62450c.class, cVar);
    }

    private C62450c() {
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
                return newMessageInfo(f168634c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C62423b.f168505a});
            case 3:
                return new C62450c();
            case 4:
                return new C62396a();
            case 5:
                return f168634c;
            case 6:
                C63010eb ebVar = f168635d;
                if (ebVar == null) {
                    synchronized (C62450c.class) {
                        ebVar = f168635d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168634c);
                            f168635d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
