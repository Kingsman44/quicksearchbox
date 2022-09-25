package com.google.p375ai.p378b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4479cg.C58072d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.yw */
/* compiled from: PG */
public final class C8190yw extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C8190yw f28770e;

    /* renamed from: f */
    private static volatile C63010eb f28771f;

    /* renamed from: a */
    public int f28772a;

    /* renamed from: b */
    public C58072d f28773b;

    /* renamed from: c */
    public int f28774c;

    /* renamed from: d */
    public C62971cq f28775d = emptyProtobufList();

    static {
        C8190yw ywVar = new C8190yw();
        f28770e = ywVar;
        C62942bv.registerDefaultInstance(C8190yw.class, ywVar);
    }

    private C8190yw() {
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
                return newMessageInfo(f28770e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0001\u0002\u001b\u0003ဉ\u0000", new Object[]{"a", C45240c.f118157a, "d", C8195za.class, "b"});
            case 3:
                return new C8190yw();
            case 4:
                return new C8189yv();
            case 5:
                return f28770e;
            case 6:
                C63010eb ebVar = f28771f;
                if (ebVar == null) {
                    synchronized (C8190yw.class) {
                        ebVar = f28771f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28770e);
                            f28771f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
