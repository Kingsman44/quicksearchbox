package com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.C59753ej;
import com.google.common.p4552o.C59770f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.as.b.a.ad */
/* compiled from: PG */
public final class C107510ad extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C107510ad f299128e;

    /* renamed from: f */
    private static volatile C63010eb f299129f;

    /* renamed from: a */
    public int f299130a;

    /* renamed from: b */
    public C59753ej f299131b;

    /* renamed from: c */
    public int f299132c;

    /* renamed from: d */
    public C62971cq f299133d = emptyProtobufList();

    static {
        C107510ad adVar = new C107510ad();
        f299128e = adVar;
        C62942bv.registerDefaultInstance(C107510ad.class, adVar);
    }

    private C107510ad() {
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
                return newMessageInfo(f299128e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002င\u0001\u0003\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", C59770f.class});
            case 3:
                return new C107510ad();
            case 4:
                return new C107509ac();
            case 5:
                return f299128e;
            case 6:
                C63010eb ebVar = f299129f;
                if (ebVar == null) {
                    synchronized (C107510ad.class) {
                        ebVar = f299129f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f299128e);
                            f299129f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
