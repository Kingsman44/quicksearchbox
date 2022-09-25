package com.google.p4017at.p4082j.p4083a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.j.a.bn */
/* compiled from: PG */
public final class C54361bn extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C54361bn f142800a;

    /* renamed from: b */
    private static volatile C63010eb f142801b;

    static {
        C54361bn bnVar = new C54361bn();
        f142800a = bnVar;
        C62942bv.registerDefaultInstance(C54361bn.class, bnVar);
    }

    private C54361bn() {
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
                return newMessageInfo(f142800a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C54361bn();
            case 4:
                return new C54360bm();
            case 5:
                return f142800a;
            case 6:
                C63010eb ebVar = f142801b;
                if (ebVar == null) {
                    synchronized (C54361bn.class) {
                        ebVar = f142801b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142800a);
                            f142801b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
