package com.google.common.p4552o.p4553a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.a.bw */
/* compiled from: PG */
public final class C59499bw extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C59499bw f157869d;

    /* renamed from: e */
    private static volatile C63010eb f157870e;

    /* renamed from: a */
    public int f157871a;

    /* renamed from: b */
    public double f157872b;

    /* renamed from: c */
    public double f157873c;

    static {
        C59499bw bwVar = new C59499bw();
        f157869d = bwVar;
        C62942bv.registerDefaultInstance(C59499bw.class, bwVar);
    }

    private C59499bw() {
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
                return newMessageInfo(f157869d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C59499bw();
            case 4:
                return new C59498bv();
            case 5:
                return f157869d;
            case 6:
                C63010eb ebVar = f157870e;
                if (ebVar == null) {
                    synchronized (C59499bw.class) {
                        ebVar = f157870e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f157869d);
                            f157870e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
