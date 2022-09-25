package com.google.p427am.p438d.p439a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.d.a.ap */
/* compiled from: PG */
public final class C8715ap extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8715ap f30046a;

    /* renamed from: b */
    private static volatile C63010eb f30047b;

    static {
        C8715ap apVar = new C8715ap();
        f30046a = apVar;
        C62942bv.registerDefaultInstance(C8715ap.class, apVar);
    }

    private C8715ap() {
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
                return newMessageInfo(f30046a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C8715ap();
            case 4:
                return new C8714ao();
            case 5:
                return f30046a;
            case 6:
                C63010eb ebVar = f30047b;
                if (ebVar == null) {
                    synchronized (C8715ap.class) {
                        ebVar = f30047b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30046a);
                            f30047b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
