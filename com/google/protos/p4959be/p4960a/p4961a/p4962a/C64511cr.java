package com.google.protos.p4959be.p4960a.p4961a.p4962a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.be.a.a.a.cr */
/* compiled from: PG */
public final class C64511cr extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64511cr f174963a;

    /* renamed from: b */
    private static volatile C63010eb f174964b;

    static {
        C64511cr crVar = new C64511cr();
        f174963a = crVar;
        C62942bv.registerDefaultInstance(C64511cr.class, crVar);
    }

    private C64511cr() {
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
                return newMessageInfo(f174963a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C64511cr();
            case 4:
                return new C64510cq();
            case 5:
                return f174963a;
            case 6:
                C63010eb ebVar = f174964b;
                if (ebVar == null) {
                    synchronized (C64511cr.class) {
                        ebVar = f174964b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174963a);
                            f174964b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
