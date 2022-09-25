package com.google.lens.p4708k;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.k.l */
/* compiled from: PG */
public final class C62604l extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62604l f169022d;

    /* renamed from: e */
    private static volatile C63010eb f169023e;

    /* renamed from: a */
    public int f169024a;

    /* renamed from: b */
    public C62971cq f169025b = emptyProtobufList();

    /* renamed from: c */
    public C62602j f169026c;

    static {
        C62604l lVar = new C62604l();
        f169022d = lVar;
        C62942bv.registerDefaultInstance(C62604l.class, lVar);
    }

    private C62604l() {
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
                return newMessageInfo(f169022d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"a", "b", C62600h.class, C45240c.f118157a});
            case 3:
                return new C62604l();
            case 4:
                return new C62603k();
            case 5:
                return f169022d;
            case 6:
                C63010eb ebVar = f169023e;
                if (ebVar == null) {
                    synchronized (C62604l.class) {
                        ebVar = f169023e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169022d);
                            f169023e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
