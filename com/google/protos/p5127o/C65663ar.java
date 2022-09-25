package com.google.protos.p5127o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.o.ar */
/* compiled from: PG */
public final class C65663ar extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C65663ar f178416d;

    /* renamed from: f */
    private static volatile C63010eb f178417f;

    /* renamed from: a */
    public C65665at f178418a;

    /* renamed from: b */
    public C62971cq f178419b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f178420c = emptyProtobufList();

    /* renamed from: e */
    private int f178421e;

    static {
        C65663ar arVar = new C65663ar();
        f178416d = arVar;
        C62942bv.registerDefaultInstance(C65663ar.class, arVar);
    }

    private C65663ar() {
        emptyProtobufList();
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
                return newMessageInfo(f178416d, "\u0001\u0003\u0000\u0001\u0004\u0007\u0003\u0000\u0002\u0000\u0004ဉ\u0003\u0005\u001b\u0007\u001b", new Object[]{"e", "a", "b", C65661ap.class, C45240c.f118157a, C65661ap.class});
            case 3:
                return new C65663ar();
            case 4:
                return new C65662aq();
            case 5:
                return f178416d;
            case 6:
                C63010eb ebVar = f178417f;
                if (ebVar == null) {
                    synchronized (C65663ar.class) {
                        ebVar = f178417f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178416d);
                            f178417f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
