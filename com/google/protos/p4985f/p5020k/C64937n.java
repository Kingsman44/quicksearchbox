package com.google.protos.p4985f.p5020k;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.k.n */
/* compiled from: PG */
public final class C64937n extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64937n f175867a;

    /* renamed from: c */
    private static volatile C63010eb f175868c;

    /* renamed from: b */
    private C62995dn f175869b = C62995dn.f170057a;

    static {
        C64937n nVar = new C64937n();
        f175867a = nVar;
        C62942bv.registerDefaultInstance(C64937n.class, nVar);
    }

    private C64937n() {
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
                return newMessageInfo(f175867a, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0001\u0000\u0000\u00032", new Object[]{"b", C64936m.f175866a});
            case 3:
                return new C64937n();
            case 4:
                return new C64935l();
            case 5:
                return f175867a;
            case 6:
                C63010eb ebVar = f175868c;
                if (ebVar == null) {
                    synchronized (C64937n.class) {
                        ebVar = f175868c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175867a);
                            f175868c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
