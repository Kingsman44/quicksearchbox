package com.google.protos.youtube.p5162a.p5163a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.a.a.j */
/* compiled from: PG */
public final class C65993j extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65993j f179484a;

    /* renamed from: b */
    private static volatile C63010eb f179485b;

    static {
        C65993j jVar = new C65993j();
        f179484a = jVar;
        C62942bv.registerDefaultInstance(C65993j.class, jVar);
    }

    private C65993j() {
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
                return newMessageInfo(f179484a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C65993j();
            case 4:
                return new C65992i();
            case 5:
                return f179484a;
            case 6:
                C63010eb ebVar = f179485b;
                if (ebVar == null) {
                    synchronized (C65993j.class) {
                        ebVar = f179485b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179484a);
                            f179485b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
