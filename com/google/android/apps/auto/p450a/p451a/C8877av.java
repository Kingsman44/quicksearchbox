package com.google.android.apps.auto.p450a.p451a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.auto.a.a.av */
/* compiled from: PG */
public final class C8877av extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C8877av f30814e;

    /* renamed from: f */
    private static volatile C63010eb f30815f;

    /* renamed from: a */
    public int f30816a;

    /* renamed from: b */
    public int f30817b;

    /* renamed from: c */
    public C62971cq f30818c = emptyProtobufList();

    /* renamed from: d */
    public C8863ah f30819d;

    static {
        C8877av avVar = new C8877av();
        f30814e = avVar;
        C62942bv.registerDefaultInstance(C8877av.class, avVar);
    }

    private C8877av() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f30814e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0003\u001b\u0004ဉ\u0001", new Object[]{"a", "b", C8875at.f30813a, C45240c.f118157a, C8874as.class, "d"});
            case 3:
                return new C8877av();
            case 4:
                return new C8872aq();
            case 5:
                return f30814e;
            case 6:
                C63010eb ebVar = f30815f;
                if (ebVar == null) {
                    synchronized (C8877av.class) {
                        ebVar = f30815f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30814e);
                            f30815f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
