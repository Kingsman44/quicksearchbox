package com.google.p4160bf.p4164b.p4165a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.bf.b.a.k */
/* compiled from: PG */
public final class C55671k extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C55671k f146890a;

    /* renamed from: b */
    private static volatile C63010eb f146891b;

    static {
        C55671k kVar = new C55671k();
        f146890a = kVar;
        C62942bv.registerDefaultInstance(C55671k.class, kVar);
    }

    private C55671k() {
        C63088z zVar = C63088z.f170246b;
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
                return newMessageInfo(f146890a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C55671k();
            case 4:
                return new C55670j();
            case 5:
                return f146890a;
            case 6:
                C63010eb ebVar = f146891b;
                if (ebVar == null) {
                    synchronized (C55671k.class) {
                        ebVar = f146891b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146890a);
                            f146891b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
