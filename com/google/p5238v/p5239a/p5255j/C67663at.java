package com.google.p5238v.p5239a.p5255j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.v.a.j.at */
/* compiled from: PG */
public final class C67663at extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C67663at f183626b;

    /* renamed from: c */
    private static volatile C63010eb f183627c;

    /* renamed from: a */
    public int f183628a;

    static {
        C67663at atVar = new C67663at();
        f183626b = atVar;
        C62942bv.registerDefaultInstance(C67663at.class, atVar);
    }

    private C67663at() {
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
                return newMessageInfo(f183626b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"a"});
            case 3:
                return new C67663at();
            case 4:
                return new C67662as();
            case 5:
                return f183626b;
            case 6:
                C63010eb ebVar = f183627c;
                if (ebVar == null) {
                    synchronized (C67663at.class) {
                        ebVar = f183627c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183626b);
                            f183627c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
