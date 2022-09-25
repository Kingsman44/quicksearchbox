package com.google.protos.p4985f.p4988b.p4993d.p4994a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.b.d.a.l */
/* compiled from: PG */
public final class C64781l extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64781l f175577a;

    /* renamed from: b */
    private static volatile C63010eb f175578b;

    static {
        C64781l lVar = new C64781l();
        f175577a = lVar;
        C62942bv.registerDefaultInstance(C64781l.class, lVar);
    }

    private C64781l() {
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
                return newMessageInfo(f175577a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C64781l();
            case 4:
                return new C64780k();
            case 5:
                return f175577a;
            case 6:
                C63010eb ebVar = f175578b;
                if (ebVar == null) {
                    synchronized (C64781l.class) {
                        ebVar = f175578b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175577a);
                            f175578b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
