package com.google.protos.p4895aw.p4902b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.b.ct */
/* compiled from: PG */
public final class C64037ct extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64037ct f173156a;

    /* renamed from: b */
    private static volatile C63010eb f173157b;

    static {
        C64037ct ctVar = new C64037ct();
        f173156a = ctVar;
        C62942bv.registerDefaultInstance(C64037ct.class, ctVar);
    }

    private C64037ct() {
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
                return newMessageInfo(f173156a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C64037ct();
            case 4:
                return new C64036cs();
            case 5:
                return f173156a;
            case 6:
                C63010eb ebVar = f173157b;
                if (ebVar == null) {
                    synchronized (C64037ct.class) {
                        ebVar = f173157b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173156a);
                            f173157b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
