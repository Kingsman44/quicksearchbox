package com.google.android.libraries.assistant.auto.tng.p1008j.p1014c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.j.c.n */
/* compiled from: PG */
public final class C13701n extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C13701n f41791a;

    /* renamed from: b */
    private static volatile C63010eb f41792b;

    static {
        C13701n nVar = new C13701n();
        f41791a = nVar;
        C62942bv.registerDefaultInstance(C13701n.class, nVar);
    }

    private C13701n() {
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
                return newMessageInfo(f41791a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C13701n();
            case 4:
                return new C13700m();
            case 5:
                return f41791a;
            case 6:
                C63010eb ebVar = f41792b;
                if (ebVar == null) {
                    synchronized (C13701n.class) {
                        ebVar = f41792b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f41791a);
                            f41792b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
