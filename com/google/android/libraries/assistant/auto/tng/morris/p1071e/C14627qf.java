package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.qf */
/* compiled from: PG */
public final class C14627qf extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C14627qf f44206b;

    /* renamed from: c */
    private static volatile C63010eb f44207c;

    /* renamed from: a */
    public int f44208a;

    static {
        C14627qf qfVar = new C14627qf();
        f44206b = qfVar;
        C62942bv.registerDefaultInstance(C14627qf.class, qfVar);
    }

    private C14627qf() {
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
                return newMessageInfo(f44206b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            case 3:
                return new C14627qf();
            case 4:
                return new C14625qd();
            case 5:
                return f44206b;
            case 6:
                C63010eb ebVar = f44207c;
                if (ebVar == null) {
                    synchronized (C14627qf.class) {
                        ebVar = f44207c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f44206b);
                            f44207c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
