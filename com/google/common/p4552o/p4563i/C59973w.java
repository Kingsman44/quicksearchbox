package com.google.common.p4552o.p4563i;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.i.w */
/* compiled from: PG */
public final class C59973w extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C59973w f162085d;

    /* renamed from: e */
    private static volatile C63010eb f162086e;

    /* renamed from: a */
    public int f162087a;

    /* renamed from: b */
    public C59939cu f162088b;

    /* renamed from: c */
    public int f162089c;

    static {
        C59973w wVar = new C59973w();
        f162085d = wVar;
        C62942bv.registerDefaultInstance(C59973w.class, wVar);
    }

    private C59973w() {
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
                return newMessageInfo(f162085d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C59974x.f162090a});
            case 3:
                return new C59973w();
            case 4:
                return new C59972v();
            case 5:
                return f162085d;
            case 6:
                C63010eb ebVar = f162086e;
                if (ebVar == null) {
                    synchronized (C59973w.class) {
                        ebVar = f162086e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162085d);
                            f162086e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
