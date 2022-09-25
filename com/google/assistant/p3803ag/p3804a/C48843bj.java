package com.google.assistant.p3803ag.p3804a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.a.bj */
/* compiled from: PG */
public final class C48843bj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48843bj f126392c;

    /* renamed from: d */
    private static volatile C63010eb f126393d;

    /* renamed from: a */
    public int f126394a;

    /* renamed from: b */
    public int f126395b;

    static {
        C48843bj bjVar = new C48843bj();
        f126392c = bjVar;
        C62942bv.registerDefaultInstance(C48843bj.class, bjVar);
    }

    private C48843bj() {
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
                return newMessageInfo(f126392c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C48842bi.f126391a});
            case 3:
                return new C48843bj();
            case 4:
                return new C48841bh();
            case 5:
                return f126392c;
            case 6:
                C63010eb ebVar = f126393d;
                if (ebVar == null) {
                    synchronized (C48843bj.class) {
                        ebVar = f126393d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126392c);
                            f126393d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
