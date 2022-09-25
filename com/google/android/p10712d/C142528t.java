package com.google.android.p10712d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.t */
/* compiled from: PG */
public final class C142528t extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C142528t f386754a;

    /* renamed from: b */
    private static volatile C63010eb f386755b;

    static {
        C142528t tVar = new C142528t();
        f386754a = tVar;
        C62942bv.registerDefaultInstance(C142528t.class, tVar);
    }

    private C142528t() {
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
                return newMessageInfo(f386754a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C142528t();
            case 4:
                return new C142527s();
            case 5:
                return f386754a;
            case 6:
                C63010eb ebVar = f386755b;
                if (ebVar == null) {
                    synchronized (C142528t.class) {
                        ebVar = f386755b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386754a);
                            f386755b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
