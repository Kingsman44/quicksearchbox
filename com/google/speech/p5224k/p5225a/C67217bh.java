package com.google.speech.p5224k.p5225a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.speech.k.a.bh */
/* compiled from: PG */
public final class C67217bh extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C67217bh f182685a;

    /* renamed from: b */
    private static volatile C63010eb f182686b;

    static {
        C67217bh bhVar = new C67217bh();
        f182685a = bhVar;
        C62942bv.registerDefaultInstance(C67217bh.class, bhVar);
    }

    private C67217bh() {
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
                return newMessageInfo(f182685a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C67217bh();
            case 4:
                return new C67216bg();
            case 5:
                return f182685a;
            case 6:
                C63010eb ebVar = f182686b;
                if (ebVar == null) {
                    synchronized (C67217bh.class) {
                        ebVar = f182686b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182685a);
                            f182686b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
