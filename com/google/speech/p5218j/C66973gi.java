package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.gi */
/* compiled from: PG */
public final class C66973gi extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C66973gi f182043a;

    /* renamed from: b */
    private static volatile C63010eb f182044b;

    static {
        C66973gi giVar = new C66973gi();
        f182043a = giVar;
        C62942bv.registerDefaultInstance(C66973gi.class, giVar);
    }

    private C66973gi() {
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
                return newMessageInfo(f182043a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C66973gi();
            case 4:
                return new C66972gh();
            case 5:
                return f182043a;
            case 6:
                C63010eb ebVar = f182044b;
                if (ebVar == null) {
                    synchronized (C66973gi.class) {
                        ebVar = f182044b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182043a);
                            f182044b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
