package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.ho */
/* compiled from: PG */
public final class C67006ho extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C67006ho f182151a;

    /* renamed from: b */
    private static volatile C63010eb f182152b;

    static {
        C67006ho hoVar = new C67006ho();
        f182151a = hoVar;
        C62942bv.registerDefaultInstance(C67006ho.class, hoVar);
    }

    private C67006ho() {
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
                return newMessageInfo(f182151a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C67006ho();
            case 4:
                return new C67005hn();
            case 5:
                return f182151a;
            case 6:
                C63010eb ebVar = f182152b;
                if (ebVar == null) {
                    synchronized (C67006ho.class) {
                        ebVar = f182152b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182151a);
                            f182152b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
