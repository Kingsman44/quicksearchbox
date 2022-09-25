package com.google.speech.p5224k.p5225a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.k.a.m */
/* compiled from: PG */
public final class C67235m extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C67235m f182734a;

    /* renamed from: b */
    private static volatile C63010eb f182735b;

    static {
        C67235m mVar = new C67235m();
        f182734a = mVar;
        C62942bv.registerDefaultInstance(C67235m.class, mVar);
    }

    private C67235m() {
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
                return newMessageInfo(f182734a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C67235m();
            case 4:
                return new C67234l();
            case 5:
                return f182734a;
            case 6:
                C63010eb ebVar = f182735b;
                if (ebVar == null) {
                    synchronized (C67235m.class) {
                        ebVar = f182735b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182734a);
                            f182735b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
