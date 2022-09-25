package com.google.p4017at.p4056g.p4057a.p4058a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.g.a.a.bc */
/* compiled from: PG */
public final class C53995bc extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53995bc f141660a;

    /* renamed from: b */
    private static volatile C63010eb f141661b;

    static {
        C53995bc bcVar = new C53995bc();
        f141660a = bcVar;
        C62942bv.registerDefaultInstance(C53995bc.class, bcVar);
    }

    private C53995bc() {
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
                return newMessageInfo(f141660a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C53995bc();
            case 4:
                return new C53994bb();
            case 5:
                return f141660a;
            case 6:
                C63010eb ebVar = f141661b;
                if (ebVar == null) {
                    synchronized (C53995bc.class) {
                        ebVar = f141661b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141660a);
                            f141661b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
