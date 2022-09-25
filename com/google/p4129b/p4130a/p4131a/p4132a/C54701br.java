package com.google.p4129b.p4130a.p4131a.p4132a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4538j.p4539a.C59308f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.b.a.a.a.br */
/* compiled from: PG */
public final class C54701br extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54701br f143581d;

    /* renamed from: e */
    private static volatile C63010eb f143582e;

    /* renamed from: a */
    public int f143583a = 0;

    /* renamed from: b */
    public Object f143584b;

    /* renamed from: c */
    public C62971cq f143585c = emptyProtobufList();

    static {
        C54701br brVar = new C54701br();
        f143581d = brVar;
        C62942bv.registerDefaultInstance(C54701br.class, brVar);
    }

    private C54701br() {
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
                return newMessageInfo(f143581d, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002<\u0000\u0003<\u0000", new Object[]{"b", "a", C45240c.f118157a, C54697bn.class, C59308f.class, C54709bz.class});
            case 3:
                return new C54701br();
            case 4:
                return new C54700bq();
            case 5:
                return f143581d;
            case 6:
                C63010eb ebVar = f143582e;
                if (ebVar == null) {
                    synchronized (C54701br.class) {
                        ebVar = f143582e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143581d);
                            f143582e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
