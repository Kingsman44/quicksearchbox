package com.google.android.apps.search.assistant.platform.p9236j.p9237a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.j.a.at */
/* compiled from: PG */
public final class C121566at extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C121566at f337321a;

    /* renamed from: b */
    private static volatile C63010eb f337322b;

    static {
        C121566at atVar = new C121566at();
        f337321a = atVar;
        C62942bv.registerDefaultInstance(C121566at.class, atVar);
    }

    private C121566at() {
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
                return newMessageInfo(f337321a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C121566at();
            case 4:
                return new C121565as();
            case 5:
                return f337321a;
            case 6:
                C63010eb ebVar = f337322b;
                if (ebVar == null) {
                    synchronized (C121566at.class) {
                        ebVar = f337322b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f337321a);
                            f337322b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
