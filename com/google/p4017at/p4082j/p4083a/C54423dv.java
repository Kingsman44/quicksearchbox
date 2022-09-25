package com.google.p4017at.p4082j.p4083a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.j.a.dv */
/* compiled from: PG */
public final class C54423dv extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54423dv f142925d;

    /* renamed from: e */
    private static volatile C63010eb f142926e;

    /* renamed from: a */
    public C54438ej f142927a;

    /* renamed from: b */
    public C54436eh f142928b;

    /* renamed from: c */
    public C54434ef f142929c;

    static {
        C54423dv dvVar = new C54423dv();
        f142925d = dvVar;
        C62942bv.registerDefaultInstance(C54423dv.class, dvVar);
    }

    private C54423dv() {
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
                return newMessageInfo(f142925d, "\u0000\u0003\u0000\u0000\u0002\u0005\u0003\u0000\u0000\u0000\u0002\t\u0003\t\u0005\t", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C54423dv();
            case 4:
                return new C54422du();
            case 5:
                return f142925d;
            case 6:
                C63010eb ebVar = f142926e;
                if (ebVar == null) {
                    synchronized (C54423dv.class) {
                        ebVar = f142926e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142925d);
                            f142926e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
