package com.google.p4129b.p4130a.p4131a.p4132a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4129b.p4130a.p4131a.p4132a.p4133a.C54656f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.b.a.a.a.ad */
/* compiled from: PG */
public final class C54660ad extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54660ad f143495d;

    /* renamed from: e */
    private static volatile C63010eb f143496e;

    /* renamed from: a */
    public C54695bl f143497a;

    /* renamed from: b */
    public C54656f f143498b;

    /* renamed from: c */
    public C62971cq f143499c = emptyProtobufList();

    static {
        C54660ad adVar = new C54660ad();
        f143495d = adVar;
        C62942bv.registerDefaultInstance(C54660ad.class, adVar);
    }

    private C54660ad() {
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
                return newMessageInfo(f143495d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\t\u0002\t\u0003\u001b", new Object[]{"a", "b", C45240c.f118157a, C54685bb.class});
            case 3:
                return new C54660ad();
            case 4:
                return new C54659ac();
            case 5:
                return f143495d;
            case 6:
                C63010eb ebVar = f143496e;
                if (ebVar == null) {
                    synchronized (C54660ad.class) {
                        ebVar = f143496e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143495d);
                            f143496e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
