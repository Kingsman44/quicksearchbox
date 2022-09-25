package com.google.protos.p4985f.p5020k;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.k.r */
/* compiled from: PG */
public final class C64941r extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64941r f175879a;

    /* renamed from: f */
    private static volatile C63010eb f175880f;

    /* renamed from: b */
    private int f175881b;

    /* renamed from: c */
    private C64934k f175882c;

    /* renamed from: d */
    private C64931h f175883d;

    /* renamed from: e */
    private C64937n f175884e;

    static {
        C64941r rVar = new C64941r();
        f175879a = rVar;
        C62942bv.registerDefaultInstance(C64941r.class, rVar);
    }

    private C64941r() {
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
                return newMessageInfo(f175879a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C64941r();
            case 4:
                return new C64940q();
            case 5:
                return f175879a;
            case 6:
                C63010eb ebVar = f175880f;
                if (ebVar == null) {
                    synchronized (C64941r.class) {
                        ebVar = f175880f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175879a);
                            f175880f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
