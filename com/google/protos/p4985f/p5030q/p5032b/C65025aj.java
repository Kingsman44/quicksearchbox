package com.google.protos.p4985f.p5030q.p5032b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.b.aj */
/* compiled from: PG */
public final class C65025aj extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C65025aj f176085d;

    /* renamed from: e */
    private static volatile C63010eb f176086e;

    /* renamed from: a */
    public int f176087a;

    /* renamed from: b */
    public int f176088b;

    /* renamed from: c */
    public C62971cq f176089c = emptyProtobufList();

    static {
        C65025aj ajVar = new C65025aj();
        f176085d = ajVar;
        C62942bv.registerDefaultInstance(C65025aj.class, ajVar);
    }

    private C65025aj() {
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
                return newMessageInfo(f176085d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"a", "b", C65023ah.f176084a, C45240c.f118157a, C65059f.class});
            case 3:
                return new C65025aj();
            case 4:
                return new C65022ag();
            case 5:
                return f176085d;
            case 6:
                C63010eb ebVar = f176086e;
                if (ebVar == null) {
                    synchronized (C65025aj.class) {
                        ebVar = f176086e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176085d);
                            f176086e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
