package com.google.assistant.p3860as;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.as.am */
/* compiled from: PG */
public final class C49750am extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C49750am f128469d;

    /* renamed from: f */
    private static volatile C63010eb f128470f;

    /* renamed from: a */
    public int f128471a;

    /* renamed from: b */
    public double f128472b;

    /* renamed from: c */
    public float f128473c;

    /* renamed from: e */
    private int f128474e;

    static {
        C49750am amVar = new C49750am();
        f128469d = amVar;
        C62942bv.registerDefaultInstance(C49750am.class, amVar);
    }

    private C49750am() {
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
                return newMessageInfo(f128469d, "\u0001\u0003\u0000\u0001\u0004\u0006\u0003\u0000\u0000\u0000\u0004က\u0003\u0005င\u0000\u0006ခ\u0004", new Object[]{"e", "b", "a", C45240c.f118157a});
            case 3:
                return new C49750am();
            case 4:
                return new C49749al();
            case 5:
                return f128469d;
            case 6:
                C63010eb ebVar = f128470f;
                if (ebVar == null) {
                    synchronized (C49750am.class) {
                        ebVar = f128470f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128469d);
                            f128470f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
