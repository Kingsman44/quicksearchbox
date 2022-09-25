package com.google.protos.p4850an;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.af */
/* compiled from: PG */
public final class C63335af extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63335af f171171a;

    /* renamed from: b */
    private static volatile C63010eb f171172b;

    static {
        C63335af afVar = new C63335af();
        f171171a = afVar;
        C62942bv.registerDefaultInstance(C63335af.class, afVar);
    }

    private C63335af() {
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
                return newMessageInfo(f171171a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C63335af();
            case 4:
                return new C63334ae();
            case 5:
                return f171171a;
            case 6:
                C63010eb ebVar = f171172b;
                if (ebVar == null) {
                    synchronized (C63335af.class) {
                        ebVar = f171172b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171171a);
                            f171172b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
