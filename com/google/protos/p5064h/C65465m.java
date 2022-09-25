package com.google.protos.p5064h;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.h.m */
/* compiled from: PG */
public final class C65465m extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65465m f177951a;

    /* renamed from: b */
    private static volatile C63010eb f177952b;

    static {
        C65465m mVar = new C65465m();
        f177951a = mVar;
        C62942bv.registerDefaultInstance(C65465m.class, mVar);
    }

    private C65465m() {
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
                return newMessageInfo(f177951a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C65465m();
            case 4:
                return new C65464l();
            case 5:
                return f177951a;
            case 6:
                C63010eb ebVar = f177952b;
                if (ebVar == null) {
                    synchronized (C65465m.class) {
                        ebVar = f177952b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f177951a);
                            f177952b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
