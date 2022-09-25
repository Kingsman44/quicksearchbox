package com.google.protos.p4959be.p4960a.p4961a.p4962a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.be.a.a.a.ar */
/* compiled from: PG */
public final class C64457ar extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C64457ar f174844e;

    /* renamed from: f */
    private static volatile C63010eb f174845f;

    /* renamed from: a */
    public int f174846a = 0;

    /* renamed from: b */
    public Object f174847b;

    /* renamed from: c */
    public int f174848c = 0;

    /* renamed from: d */
    public Object f174849d;

    static {
        C64457ar arVar = new C64457ar();
        f174844e = arVar;
        C62942bv.registerDefaultInstance(C64457ar.class, arVar);
    }

    private C64457ar() {
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
                return newMessageInfo(f174844e, "\u0000\u0004\u0002\u0000\u0002\u0005\u0004\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0001\u0005<\u0001", new Object[]{"b", "a", "d", C45240c.f118157a, C64513ct.class, C64509cp.class, C64515cv.class, C64511cr.class});
            case 3:
                return new C64457ar();
            case 4:
                return new C64456aq();
            case 5:
                return f174844e;
            case 6:
                C63010eb ebVar = f174845f;
                if (ebVar == null) {
                    synchronized (C64457ar.class) {
                        ebVar = f174845f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174844e);
                            f174845f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
