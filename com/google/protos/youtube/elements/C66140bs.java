package com.google.protos.youtube.elements;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.elements.bs */
/* compiled from: PG */
public final class C66140bs extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66140bs f179852c;

    /* renamed from: d */
    private static volatile C63010eb f179853d;

    /* renamed from: a */
    public int f179854a;

    /* renamed from: b */
    public int f179855b;

    static {
        C66140bs bsVar = new C66140bs();
        f179852c = bsVar;
        C62942bv.registerDefaultInstance(C66140bs.class, bsVar);
    }

    private C66140bs() {
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
                return newMessageInfo(f179852c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C66141bt.f179856a});
            case 3:
                return new C66140bs();
            case 4:
                return new C66139br();
            case 5:
                return f179852c;
            case 6:
                C63010eb ebVar = f179853d;
                if (ebVar == null) {
                    synchronized (C66140bs.class) {
                        ebVar = f179853d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179852c);
                            f179853d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
