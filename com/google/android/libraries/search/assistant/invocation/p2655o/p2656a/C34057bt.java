package com.google.android.libraries.search.assistant.invocation.p2655o.p2656a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.a.bt */
/* compiled from: PG */
public final class C34057bt extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C34057bt f90757b;

    /* renamed from: d */
    private static volatile C63010eb f90758d;

    /* renamed from: a */
    public boolean f90759a;

    /* renamed from: c */
    private int f90760c;

    static {
        C34057bt btVar = new C34057bt();
        f90757b = btVar;
        C62942bv.registerDefaultInstance(C34057bt.class, btVar);
    }

    private C34057bt() {
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
                return newMessageInfo(f90757b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C34057bt();
            case 4:
                return new C34056bs();
            case 5:
                return f90757b;
            case 6:
                C63010eb ebVar = f90758d;
                if (ebVar == null) {
                    synchronized (C34057bt.class) {
                        ebVar = f90758d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90757b);
                            f90758d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
