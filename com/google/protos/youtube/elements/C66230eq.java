package com.google.protos.youtube.elements;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.elements.eq */
/* compiled from: PG */
public final class C66230eq extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C66230eq f180102a;

    /* renamed from: c */
    private static volatile C63010eb f180103c;

    /* renamed from: b */
    private byte f180104b = 2;

    static {
        C66230eq eqVar = new C66230eq();
        f180102a = eqVar;
        C62942bv.registerDefaultInstance(C66230eq.class, eqVar);
    }

    private C66230eq() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f180104b);
            case 1:
                this.f180104b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f180102a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C66230eq();
            case 4:
                return new C66229ep();
            case 5:
                return f180102a;
            case 6:
                C63010eb ebVar = f180103c;
                if (ebVar == null) {
                    synchronized (C66230eq.class) {
                        ebVar = f180103c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180102a);
                            f180103c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
