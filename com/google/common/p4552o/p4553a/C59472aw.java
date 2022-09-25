package com.google.common.p4552o.p4553a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.a.aw */
/* compiled from: PG */
public final class C59472aw extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C59472aw f157775d;

    /* renamed from: e */
    private static volatile C63010eb f157776e;

    /* renamed from: a */
    public int f157777a;

    /* renamed from: b */
    public int f157778b;

    /* renamed from: c */
    public long f157779c;

    static {
        C59472aw awVar = new C59472aw();
        f157775d = awVar;
        C62942bv.registerDefaultInstance(C59472aw.class, awVar);
    }

    private C59472aw() {
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
                return newMessageInfo(f157775d, "\u0001\u0002\u0000\u0001\u0005\u0006\u0002\u0000\u0000\u0000\u0005င\u0000\u0006ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C59472aw();
            case 4:
                return new C59471av();
            case 5:
                return f157775d;
            case 6:
                C63010eb ebVar = f157776e;
                if (ebVar == null) {
                    synchronized (C59472aw.class) {
                        ebVar = f157776e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f157775d);
                            f157776e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
