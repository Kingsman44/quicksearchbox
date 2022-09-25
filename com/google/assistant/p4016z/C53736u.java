package com.google.assistant.p4016z;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.z.u */
/* compiled from: PG */
public final class C53736u extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53736u f141077a;

    /* renamed from: b */
    private static volatile C63010eb f141078b;

    static {
        C53736u uVar = new C53736u();
        f141077a = uVar;
        C62942bv.registerDefaultInstance(C53736u.class, uVar);
    }

    private C53736u() {
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
                return newMessageInfo(f141077a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53736u();
            case 4:
                return new C53735t();
            case 5:
                return f141077a;
            case 6:
                C63010eb ebVar = f141078b;
                if (ebVar == null) {
                    synchronized (C53736u.class) {
                        ebVar = f141078b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141077a);
                            f141078b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
