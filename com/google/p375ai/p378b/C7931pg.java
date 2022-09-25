package com.google.p375ai.p378b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.pg */
/* compiled from: PG */
public final class C7931pg extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C7931pg f27864d;

    /* renamed from: e */
    private static volatile C63010eb f27865e;

    /* renamed from: a */
    public int f27866a;

    /* renamed from: b */
    public C7929pe f27867b;

    /* renamed from: c */
    public C62971cq f27868c = emptyProtobufList();

    static {
        C7931pg pgVar = new C7931pg();
        f27864d = pgVar;
        C62942bv.registerDefaultInstance(C7931pg.class, pgVar);
    }

    private C7931pg() {
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
                return newMessageInfo(f27864d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"a", "b", C45240c.f118157a, C7927pc.class});
            case 3:
                return new C7931pg();
            case 4:
                return new C7930pf();
            case 5:
                return f27864d;
            case 6:
                C63010eb ebVar = f27865e;
                if (ebVar == null) {
                    synchronized (C7931pg.class) {
                        ebVar = f27865e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27864d);
                            f27865e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
