package com.google.speech.p5218j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.lp */
/* compiled from: PG */
public final class C67115lp extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C67115lp f182448d;

    /* renamed from: e */
    private static volatile C63010eb f182449e;

    /* renamed from: a */
    public int f182450a;

    /* renamed from: b */
    public boolean f182451b;

    /* renamed from: c */
    public int f182452c;

    static {
        C67115lp lpVar = new C67115lp();
        f182448d = lpVar;
        C62942bv.registerDefaultInstance(C67115lp.class, lpVar);
    }

    private C67115lp() {
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
                return newMessageInfo(f182448d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C67125lz.m97425b()});
            case 3:
                return new C67115lp();
            case 4:
                return new C67114lo();
            case 5:
                return f182448d;
            case 6:
                C63010eb ebVar = f182449e;
                if (ebVar == null) {
                    synchronized (C67115lp.class) {
                        ebVar = f182449e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182448d);
                            f182449e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
