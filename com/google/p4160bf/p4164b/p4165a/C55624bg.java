package com.google.p4160bf.p4164b.p4165a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.b.a.bg */
/* compiled from: PG */
public final class C55624bg extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C55624bg f146766a;

    /* renamed from: b */
    private static volatile C63010eb f146767b;

    static {
        C55624bg bgVar = new C55624bg();
        f146766a = bgVar;
        C62942bv.registerDefaultInstance(C55624bg.class, bgVar);
    }

    private C55624bg() {
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
                return newMessageInfo(f146766a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C55624bg();
            case 4:
                return new C55623bf();
            case 5:
                return f146766a;
            case 6:
                C63010eb ebVar = f146767b;
                if (ebVar == null) {
                    synchronized (C55624bg.class) {
                        ebVar = f146767b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146766a);
                            f146767b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
