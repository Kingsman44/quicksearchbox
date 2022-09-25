package com.google.android.p10712d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.l */
/* compiled from: PG */
public final class C142520l extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C142520l f386739c;

    /* renamed from: d */
    private static volatile C63010eb f386740d;

    /* renamed from: a */
    public int f386741a = 0;

    /* renamed from: b */
    public Object f386742b;

    static {
        C142520l lVar = new C142520l();
        f386739c = lVar;
        C62942bv.registerDefaultInstance(C142520l.class, lVar);
    }

    private C142520l() {
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
                return newMessageInfo(f386739c, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001?\u0000\u0002?\u0000\u0003?\u0000", new Object[]{"b", "a"});
            case 3:
                return new C142520l();
            case 4:
                return new C142518j();
            case 5:
                return f386739c;
            case 6:
                C63010eb ebVar = f386740d;
                if (ebVar == null) {
                    synchronized (C142520l.class) {
                        ebVar = f386740d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386739c);
                            f386740d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
