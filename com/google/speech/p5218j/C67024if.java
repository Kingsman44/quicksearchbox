package com.google.speech.p5218j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.if */
/* compiled from: PG */
public final class C67024if extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C67024if f182184b;

    /* renamed from: d */
    private static volatile C63010eb f182185d;

    /* renamed from: a */
    public int f182186a;

    /* renamed from: c */
    private int f182187c;

    static {
        C67024if ifVar = new C67024if();
        f182184b = ifVar;
        C62942bv.registerDefaultInstance(C67024if.class, ifVar);
    }

    private C67024if() {
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
                return newMessageInfo(f182184b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C67022id.f182183a});
            case 3:
                return new C67024if();
            case 4:
                return new C67021ic();
            case 5:
                return f182184b;
            case 6:
                C63010eb ebVar = f182185d;
                if (ebVar == null) {
                    synchronized (C67024if.class) {
                        ebVar = f182185d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182184b);
                            f182185d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
