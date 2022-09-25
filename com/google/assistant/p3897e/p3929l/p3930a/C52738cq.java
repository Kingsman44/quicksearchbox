package com.google.assistant.p3897e.p3929l.p3930a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.l.a.cq */
/* compiled from: PG */
public final class C52738cq extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C52738cq f138406a;

    /* renamed from: b */
    private static volatile C63010eb f138407b;

    static {
        C52738cq cqVar = new C52738cq();
        f138406a = cqVar;
        C62942bv.registerDefaultInstance(C52738cq.class, cqVar);
    }

    private C52738cq() {
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
                return newMessageInfo(f138406a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C52738cq();
            case 4:
                return new C52737cp();
            case 5:
                return f138406a;
            case 6:
                C63010eb ebVar = f138407b;
                if (ebVar == null) {
                    synchronized (C52738cq.class) {
                        ebVar = f138407b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138406a);
                            f138407b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
