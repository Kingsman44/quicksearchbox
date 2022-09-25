package com.google.android.apps.search.assistant.surfaces.dictation.p9427a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.a.ec */
/* compiled from: PG */
public final class C125156ec extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C125156ec f345243a;

    /* renamed from: b */
    private static volatile C63010eb f345244b;

    static {
        C125156ec ecVar = new C125156ec();
        f345243a = ecVar;
        C62942bv.registerDefaultInstance(C125156ec.class, ecVar);
    }

    private C125156ec() {
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
                return newMessageInfo(f345243a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C125156ec();
            case 4:
                return new C125155eb();
            case 5:
                return f345243a;
            case 6:
                C63010eb ebVar = f345244b;
                if (ebVar == null) {
                    synchronized (C125156ec.class) {
                        ebVar = f345244b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f345243a);
                            f345244b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
