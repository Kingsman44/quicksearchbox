package com.google.protos.youtube.elements;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.elements.au */
/* compiled from: PG */
public final class C66059au extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66059au f179644c;

    /* renamed from: d */
    private static volatile C63010eb f179645d;

    /* renamed from: a */
    public int f179646a;

    /* renamed from: b */
    public int f179647b;

    static {
        C66059au auVar = new C66059au();
        f179644c = auVar;
        C62942bv.registerDefaultInstance(C66059au.class, auVar);
    }

    private C66059au() {
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
                return newMessageInfo(f179644c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C66056ar.f179643a});
            case 3:
                return new C66059au();
            case 4:
                return new C66058at();
            case 5:
                return f179644c;
            case 6:
                C63010eb ebVar = f179645d;
                if (ebVar == null) {
                    synchronized (C66059au.class) {
                        ebVar = f179645d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179644c);
                            f179645d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
