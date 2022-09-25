package com.google.p4281bu.p4282a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bu.a.bg */
/* compiled from: PG */
public final class C56523bg extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56523bg f150945a;

    /* renamed from: b */
    private static volatile C63010eb f150946b;

    static {
        C56523bg bgVar = new C56523bg();
        f150945a = bgVar;
        C62942bv.registerDefaultInstance(C56523bg.class, bgVar);
    }

    private C56523bg() {
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
                return newMessageInfo(f150945a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C56523bg();
            case 4:
                return new C56522bf();
            case 5:
                return f150945a;
            case 6:
                C63010eb ebVar = f150946b;
                if (ebVar == null) {
                    synchronized (C56523bg.class) {
                        ebVar = f150946b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150945a);
                            f150946b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
