package com.google.speech.p5224k.p5225a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.k.a.bb */
/* compiled from: PG */
public final class C67211bb extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C67211bb f182673a;

    /* renamed from: b */
    private static volatile C63010eb f182674b;

    static {
        C67211bb bbVar = new C67211bb();
        f182673a = bbVar;
        C62942bv.registerDefaultInstance(C67211bb.class, bbVar);
    }

    private C67211bb() {
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
                return newMessageInfo(f182673a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C67211bb();
            case 4:
                return new C67210ba();
            case 5:
                return f182673a;
            case 6:
                C63010eb ebVar = f182674b;
                if (ebVar == null) {
                    synchronized (C67211bb.class) {
                        ebVar = f182674b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182673a);
                            f182674b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
