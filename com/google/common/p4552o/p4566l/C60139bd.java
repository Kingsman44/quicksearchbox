package com.google.common.p4552o.p4566l;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.l.bd */
/* compiled from: PG */
public final class C60139bd extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C60139bd f162679d;

    /* renamed from: e */
    private static volatile C63010eb f162680e;

    /* renamed from: a */
    public int f162681a;

    /* renamed from: b */
    public int f162682b;

    /* renamed from: c */
    public int f162683c;

    static {
        C60139bd bdVar = new C60139bd();
        f162679d = bdVar;
        C62942bv.registerDefaultInstance(C60139bd.class, bdVar);
    }

    private C60139bd() {
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
                return newMessageInfo(f162679d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"a", "b", C60186cx.f162813a, C45240c.f118157a});
            case 3:
                return new C60139bd();
            case 4:
                return new C60138bc();
            case 5:
                return f162679d;
            case 6:
                C63010eb ebVar = f162680e;
                if (ebVar == null) {
                    synchronized (C60139bd.class) {
                        ebVar = f162680e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162679d);
                            f162680e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
