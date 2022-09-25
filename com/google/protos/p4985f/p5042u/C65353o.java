package com.google.protos.p4985f.p5042u;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.u.o */
/* compiled from: PG */
public final class C65353o extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65353o f177732a;

    /* renamed from: b */
    private static volatile C63010eb f177733b;

    static {
        C65353o oVar = new C65353o();
        f177732a = oVar;
        C62942bv.registerDefaultInstance(C65353o.class, oVar);
    }

    private C65353o() {
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
                return newMessageInfo(f177732a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C65353o();
            case 4:
                return new C65352n();
            case 5:
                return f177732a;
            case 6:
                C63010eb ebVar = f177733b;
                if (ebVar == null) {
                    synchronized (C65353o.class) {
                        ebVar = f177733b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f177732a);
                            f177733b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
