package com.google.android.p10712d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.du */
/* compiled from: PG */
public final class C142396du extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C142396du f386398d;

    /* renamed from: e */
    private static volatile C63010eb f386399e;

    /* renamed from: a */
    public int f386400a;

    /* renamed from: b */
    public int f386401b;

    /* renamed from: c */
    public int f386402c;

    static {
        C142396du duVar = new C142396du();
        f386398d = duVar;
        C62942bv.registerDefaultInstance(C142396du.class, duVar);
    }

    private C142396du() {
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
                return newMessageInfo(f386398d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C142388dm.m231073b(), C45240c.f118157a, C142407ee.m231078b()});
            case 3:
                return new C142396du();
            case 4:
                return new C142395dt();
            case 5:
                return f386398d;
            case 6:
                C63010eb ebVar = f386399e;
                if (ebVar == null) {
                    synchronized (C142396du.class) {
                        ebVar = f386399e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386398d);
                            f386399e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
