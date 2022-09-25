package com.google.protos.p4850an;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.aj */
/* compiled from: PG */
public final class C63339aj extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63339aj f171175a;

    /* renamed from: b */
    private static volatile C63010eb f171176b;

    static {
        C63339aj ajVar = new C63339aj();
        f171175a = ajVar;
        C62942bv.registerDefaultInstance(C63339aj.class, ajVar);
    }

    private C63339aj() {
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
                return newMessageInfo(f171175a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C63339aj();
            case 4:
                return new C63338ai();
            case 5:
                return f171175a;
            case 6:
                C63010eb ebVar = f171176b;
                if (ebVar == null) {
                    synchronized (C63339aj.class) {
                        ebVar = f171176b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171175a);
                            f171176b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
