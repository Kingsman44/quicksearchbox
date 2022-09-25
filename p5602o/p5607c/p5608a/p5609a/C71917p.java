package p5602o.p5607c.p5608a.p5609a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: o.c.a.a.p */
/* compiled from: PG */
public final class C71917p extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C71917p f191532e;

    /* renamed from: f */
    private static volatile C63010eb f191533f;

    /* renamed from: a */
    public int f191534a;

    /* renamed from: b */
    public int f191535b;

    /* renamed from: c */
    public long f191536c;

    /* renamed from: d */
    public int f191537d;

    static {
        C71917p pVar = new C71917p();
        f191532e = pVar;
        C62942bv.registerDefaultInstance(C71917p.class, pVar);
    }

    private C71917p() {
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
                return newMessageInfo(f191532e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", C71918q.f191538a, C45240c.f118157a, "d", C71902a.f191500a});
            case 3:
                return new C71917p();
            case 4:
                return new C71916o();
            case 5:
                return f191532e;
            case 6:
                C63010eb ebVar = f191533f;
                if (ebVar == null) {
                    synchronized (C71917p.class) {
                        ebVar = f191533f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f191532e);
                            f191533f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
