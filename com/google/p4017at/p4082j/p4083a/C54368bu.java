package com.google.p4017at.p4082j.p4083a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.j.a.bu */
/* compiled from: PG */
public final class C54368bu extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C54368bu f142814a;

    /* renamed from: b */
    private static volatile C63010eb f142815b;

    static {
        C54368bu buVar = new C54368bu();
        f142814a = buVar;
        C62942bv.registerDefaultInstance(C54368bu.class, buVar);
    }

    private C54368bu() {
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
                return newMessageInfo(f142814a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C54368bu();
            case 4:
                return new C54367bt();
            case 5:
                return f142814a;
            case 6:
                C63010eb ebVar = f142815b;
                if (ebVar == null) {
                    synchronized (C54368bu.class) {
                        ebVar = f142815b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142814a);
                            f142815b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
