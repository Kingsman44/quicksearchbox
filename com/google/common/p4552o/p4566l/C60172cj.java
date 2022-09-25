package com.google.common.p4552o.p4566l;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.l.cj */
/* compiled from: PG */
public final class C60172cj extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C60172cj f162770a;

    /* renamed from: b */
    private static volatile C63010eb f162771b;

    static {
        C60172cj cjVar = new C60172cj();
        f162770a = cjVar;
        C62942bv.registerDefaultInstance(C60172cj.class, cjVar);
    }

    private C60172cj() {
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
                return newMessageInfo(f162770a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C60172cj();
            case 4:
                return new C60171ci();
            case 5:
                return f162770a;
            case 6:
                C63010eb ebVar = f162771b;
                if (ebVar == null) {
                    synchronized (C60172cj.class) {
                        ebVar = f162771b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162770a);
                            f162771b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
