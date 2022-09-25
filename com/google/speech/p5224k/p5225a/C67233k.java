package com.google.speech.p5224k.p5225a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.k.a.k */
/* compiled from: PG */
public final class C67233k extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C67233k f182732a;

    /* renamed from: b */
    private static volatile C63010eb f182733b;

    static {
        C67233k kVar = new C67233k();
        f182732a = kVar;
        C62942bv.registerDefaultInstance(C67233k.class, kVar);
    }

    private C67233k() {
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
                return newMessageInfo(f182732a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C67233k();
            case 4:
                return new C67232j();
            case 5:
                return f182732a;
            case 6:
                C63010eb ebVar = f182733b;
                if (ebVar == null) {
                    synchronized (C67233k.class) {
                        ebVar = f182733b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182732a);
                            f182733b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
