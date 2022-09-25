package com.google.android.apps.search.assistant.platform.p9236j.p9237a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.j.a.ap */
/* compiled from: PG */
public final class C121562ap extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C121562ap f337314a;

    /* renamed from: b */
    private static volatile C63010eb f337315b;

    static {
        C121562ap apVar = new C121562ap();
        f337314a = apVar;
        C62942bv.registerDefaultInstance(C121562ap.class, apVar);
    }

    private C121562ap() {
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
                return newMessageInfo(f337314a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C121562ap();
            case 4:
                return new C121561ao();
            case 5:
                return f337314a;
            case 6:
                C63010eb ebVar = f337315b;
                if (ebVar == null) {
                    synchronized (C121562ap.class) {
                        ebVar = f337315b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f337314a);
                            f337315b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
