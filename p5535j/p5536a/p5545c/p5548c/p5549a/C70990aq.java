package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.c.c.a.aq */
/* compiled from: PG */
public final class C70990aq extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C70990aq f189302d;

    /* renamed from: e */
    private static volatile C63010eb f189303e;

    /* renamed from: a */
    public int f189304a;

    /* renamed from: b */
    public int f189305b;

    /* renamed from: c */
    public int f189306c;

    static {
        C70990aq aqVar = new C70990aq();
        f189302d = aqVar;
        C62942bv.registerDefaultInstance(C70990aq.class, aqVar);
    }

    private C70990aq() {
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
                return newMessageInfo(f189302d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C70990aq();
            case 4:
                return new C70989ap();
            case 5:
                return f189302d;
            case 6:
                C63010eb ebVar = f189303e;
                if (ebVar == null) {
                    synchronized (C70990aq.class) {
                        ebVar = f189303e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189302d);
                            f189303e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
