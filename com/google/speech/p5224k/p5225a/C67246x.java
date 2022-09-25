package com.google.speech.p5224k.p5225a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.k.a.x */
/* compiled from: PG */
public final class C67246x extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C67246x f182793a;

    /* renamed from: b */
    private static volatile C63010eb f182794b;

    static {
        C67246x xVar = new C67246x();
        f182793a = xVar;
        C62942bv.registerDefaultInstance(C67246x.class, xVar);
    }

    private C67246x() {
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
                return newMessageInfo(f182793a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C67246x();
            case 4:
                return new C67245w();
            case 5:
                return f182793a;
            case 6:
                C63010eb ebVar = f182794b;
                if (ebVar == null) {
                    synchronized (C67246x.class) {
                        ebVar = f182794b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182793a);
                            f182794b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
