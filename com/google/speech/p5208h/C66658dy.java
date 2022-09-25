package com.google.speech.p5208h;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.h.dy */
/* compiled from: PG */
public final class C66658dy extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C66658dy f181336a;

    /* renamed from: b */
    private static volatile C63010eb f181337b;

    static {
        C66658dy dyVar = new C66658dy();
        f181336a = dyVar;
        C62942bv.registerDefaultInstance(C66658dy.class, dyVar);
    }

    private C66658dy() {
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
                return newMessageInfo(f181336a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C66658dy();
            case 4:
                return new C66657dx();
            case 5:
                return f181336a;
            case 6:
                C63010eb ebVar = f181337b;
                if (ebVar == null) {
                    synchronized (C66658dy.class) {
                        ebVar = f181337b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181336a);
                            f181337b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
