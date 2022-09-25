package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.mb */
/* compiled from: PG */
public final class C67128mb extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C67128mb f182474a;

    /* renamed from: b */
    private static volatile C63010eb f182475b;

    static {
        C67128mb mbVar = new C67128mb();
        f182474a = mbVar;
        C62942bv.registerDefaultInstance(C67128mb.class, mbVar);
    }

    private C67128mb() {
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
                return newMessageInfo(f182474a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C67128mb();
            case 4:
                return new C67127ma();
            case 5:
                return f182474a;
            case 6:
                C63010eb ebVar = f182475b;
                if (ebVar == null) {
                    synchronized (C67128mb.class) {
                        ebVar = f182475b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182474a);
                            f182475b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
