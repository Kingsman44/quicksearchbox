package com.google.protos.p5064h;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.h.h */
/* compiled from: PG */
public final class C65460h extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65460h f177943a;

    /* renamed from: d */
    private static volatile C63010eb f177944d;

    /* renamed from: b */
    private int f177945b;

    /* renamed from: c */
    private C65463k f177946c;

    static {
        C65460h hVar = new C65460h();
        f177943a = hVar;
        C62942bv.registerDefaultInstance(C65460h.class, hVar);
    }

    private C65460h() {
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
                return newMessageInfo(f177943a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C65460h();
            case 4:
                return new C65459g();
            case 5:
                return f177943a;
            case 6:
                C63010eb ebVar = f177944d;
                if (ebVar == null) {
                    synchronized (C65460h.class) {
                        ebVar = f177944d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f177943a);
                            f177944d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
