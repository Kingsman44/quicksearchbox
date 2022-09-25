package com.google.p4715m.p4716a.p4720b.p4721a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.m.a.b.a.ah */
/* compiled from: PG */
public final class C62669ah extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62669ah f169198a;

    /* renamed from: b */
    private static volatile C63010eb f169199b;

    static {
        C62669ah ahVar = new C62669ah();
        f169198a = ahVar;
        C62942bv.registerDefaultInstance(C62669ah.class, ahVar);
    }

    private C62669ah() {
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
                return newMessageInfo(f169198a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62669ah();
            case 4:
                return new C62668ag();
            case 5:
                return f169198a;
            case 6:
                C63010eb ebVar = f169199b;
                if (ebVar == null) {
                    synchronized (C62669ah.class) {
                        ebVar = f169199b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169198a);
                            f169199b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
