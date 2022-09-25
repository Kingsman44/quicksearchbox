package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.hm */
/* compiled from: PG */
public final class C67004hm extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C67004hm f182149a;

    /* renamed from: b */
    private static volatile C63010eb f182150b;

    static {
        C67004hm hmVar = new C67004hm();
        f182149a = hmVar;
        C62942bv.registerDefaultInstance(C67004hm.class, hmVar);
    }

    private C67004hm() {
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
                return newMessageInfo(f182149a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C67004hm();
            case 4:
                return new C67003hl();
            case 5:
                return f182149a;
            case 6:
                C63010eb ebVar = f182150b;
                if (ebVar == null) {
                    synchronized (C67004hm.class) {
                        ebVar = f182150b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182149a);
                            f182150b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
