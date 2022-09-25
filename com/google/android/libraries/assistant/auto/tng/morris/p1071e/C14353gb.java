package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.gb */
/* compiled from: PG */
public final class C14353gb extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C14353gb f43433d;

    /* renamed from: e */
    private static volatile C63010eb f43434e;

    /* renamed from: a */
    public int f43435a;

    /* renamed from: b */
    public int f43436b;

    /* renamed from: c */
    public int f43437c;

    static {
        C14353gb gbVar = new C14353gb();
        f43433d = gbVar;
        C62942bv.registerDefaultInstance(C14353gb.class, gbVar);
    }

    private C14353gb() {
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
                return newMessageInfo(f43433d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C14353gb();
            case 4:
                return new C14352ga();
            case 5:
                return f43433d;
            case 6:
                C63010eb ebVar = f43434e;
                if (ebVar == null) {
                    synchronized (C14353gb.class) {
                        ebVar = f43434e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43433d);
                            f43434e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
