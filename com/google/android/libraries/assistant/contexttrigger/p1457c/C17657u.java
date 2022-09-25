package com.google.android.libraries.assistant.contexttrigger.p1457c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.c.u */
/* compiled from: PG */
public final class C17657u extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C17657u f50786a;

    /* renamed from: b */
    private static volatile C63010eb f50787b;

    static {
        C17657u uVar = new C17657u();
        f50786a = uVar;
        C62942bv.registerDefaultInstance(C17657u.class, uVar);
    }

    private C17657u() {
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
                return newMessageInfo(f50786a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C17657u();
            case 4:
                return new C17656t();
            case 5:
                return f50786a;
            case 6:
                C63010eb ebVar = f50787b;
                if (ebVar == null) {
                    synchronized (C17657u.class) {
                        ebVar = f50787b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f50786a);
                            f50787b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
