package com.google.android.apps.gsa.opaonboarding.p6459a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opaonboarding.a.ar */
/* compiled from: PG */
public final class C83837ar extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C83837ar f228465a;

    /* renamed from: b */
    private static volatile C63010eb f228466b;

    static {
        C83837ar arVar = new C83837ar();
        f228465a = arVar;
        C62942bv.registerDefaultInstance(C83837ar.class, arVar);
    }

    private C83837ar() {
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
                return newMessageInfo(f228465a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C83837ar();
            case 4:
                return new C83836aq();
            case 5:
                return f228465a;
            case 6:
                C63010eb ebVar = f228466b;
                if (ebVar == null) {
                    synchronized (C83837ar.class) {
                        ebVar = f228466b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228465a);
                            f228466b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
