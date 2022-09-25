package com.google.speech.p5208h;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.h.ea */
/* compiled from: PG */
public final class C66661ea extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C66661ea f181338a;

    /* renamed from: b */
    private static volatile C63010eb f181339b;

    static {
        C66661ea eaVar = new C66661ea();
        f181338a = eaVar;
        C62942bv.registerDefaultInstance(C66661ea.class, eaVar);
    }

    private C66661ea() {
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
                return newMessageInfo(f181338a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C66661ea();
            case 4:
                return new C66659dz();
            case 5:
                return f181338a;
            case 6:
                C63010eb ebVar = f181339b;
                if (ebVar == null) {
                    synchronized (C66661ea.class) {
                        ebVar = f181339b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181338a);
                            f181339b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
