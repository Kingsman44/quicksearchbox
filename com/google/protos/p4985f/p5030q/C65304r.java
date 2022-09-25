package com.google.protos.p4985f.p5030q;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.r */
/* compiled from: PG */
public final class C65304r extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65304r f176630a;

    /* renamed from: b */
    private static volatile C63010eb f176631b;

    static {
        C65304r rVar = new C65304r();
        f176630a = rVar;
        C62942bv.registerDefaultInstance(C65304r.class, rVar);
    }

    private C65304r() {
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
                return newMessageInfo(f176630a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C65304r();
            case 4:
                return new C65303q();
            case 5:
                return f176630a;
            case 6:
                C63010eb ebVar = f176631b;
                if (ebVar == null) {
                    synchronized (C65304r.class) {
                        ebVar = f176631b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176630a);
                            f176631b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
