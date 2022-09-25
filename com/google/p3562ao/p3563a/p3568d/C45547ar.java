package com.google.p3562ao.p3563a.p3568d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ao.a.d.ar */
/* compiled from: PG */
public final class C45547ar extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C45547ar f119034a;

    /* renamed from: b */
    private static volatile C63010eb f119035b;

    static {
        C45547ar arVar = new C45547ar();
        f119034a = arVar;
        C62942bv.registerDefaultInstance(C45547ar.class, arVar);
    }

    private C45547ar() {
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
                return newMessageInfo(f119034a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C45547ar();
            case 4:
                return new C45546aq();
            case 5:
                return f119034a;
            case 6:
                C63010eb ebVar = f119035b;
                if (ebVar == null) {
                    synchronized (C45547ar.class) {
                        ebVar = f119035b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f119034a);
                            f119035b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
