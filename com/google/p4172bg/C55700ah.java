package com.google.p4172bg;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bg.ah */
/* compiled from: PG */
public final class C55700ah extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C55700ah f146943d;

    /* renamed from: e */
    private static volatile C63010eb f146944e;

    /* renamed from: a */
    public int f146945a;

    /* renamed from: b */
    public double f146946b;

    /* renamed from: c */
    public double f146947c;

    static {
        C55700ah ahVar = new C55700ah();
        f146943d = ahVar;
        C62942bv.registerDefaultInstance(C55700ah.class, ahVar);
    }

    private C55700ah() {
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
                return newMessageInfo(f146943d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002က\u0001\u0003က\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C55700ah();
            case 4:
                return new C55699ag();
            case 5:
                return f146943d;
            case 6:
                C63010eb ebVar = f146944e;
                if (ebVar == null) {
                    synchronized (C55700ah.class) {
                        ebVar = f146944e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146943d);
                            f146944e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
