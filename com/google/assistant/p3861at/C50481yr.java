package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.yr */
/* compiled from: PG */
public final class C50481yr extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C50481yr f131375a;

    /* renamed from: c */
    private static volatile C63010eb f131376c;

    /* renamed from: b */
    private C62995dn f131377b = C62995dn.f170057a;

    static {
        C50481yr yrVar = new C50481yr();
        f131375a = yrVar;
        C62942bv.registerDefaultInstance(C50481yr.class, yrVar);
    }

    private C50481yr() {
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
                return newMessageInfo(f131375a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", C50480yq.f131374a});
            case 3:
                return new C50481yr();
            case 4:
                return new C50479yp();
            case 5:
                return f131375a;
            case 6:
                C63010eb ebVar = f131376c;
                if (ebVar == null) {
                    synchronized (C50481yr.class) {
                        ebVar = f131376c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131375a);
                            f131376c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
