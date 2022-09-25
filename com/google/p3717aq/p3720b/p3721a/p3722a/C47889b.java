package com.google.p3717aq.p3720b.p3721a.p3722a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.aq.b.a.a.b */
/* compiled from: PG */
public final class C47889b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C47889b f123990a;

    /* renamed from: b */
    private static volatile C63010eb f123991b;

    static {
        C47889b bVar = new C47889b();
        f123990a = bVar;
        C62942bv.registerDefaultInstance(C47889b.class, bVar);
    }

    private C47889b() {
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
                return newMessageInfo(f123990a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C47889b();
            case 4:
                return new C47888a();
            case 5:
                return f123990a;
            case 6:
                C63010eb ebVar = f123991b;
                if (ebVar == null) {
                    synchronized (C47889b.class) {
                        ebVar = f123991b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f123990a);
                            f123991b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
