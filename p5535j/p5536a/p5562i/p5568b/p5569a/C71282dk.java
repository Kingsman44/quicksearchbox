package p5535j.p5536a.p5562i.p5568b.p5569a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.i.b.a.dk */
/* compiled from: PG */
public final class C71282dk extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C71282dk f190324d;

    /* renamed from: e */
    private static volatile C63010eb f190325e;

    /* renamed from: a */
    public int f190326a;

    /* renamed from: b */
    public long f190327b;

    /* renamed from: c */
    public long f190328c;

    static {
        C71282dk dkVar = new C71282dk();
        f190324d = dkVar;
        C62942bv.registerDefaultInstance(C71282dk.class, dkVar);
    }

    private C71282dk() {
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
                return newMessageInfo(f190324d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C71282dk();
            case 4:
                return new C71281dj();
            case 5:
                return f190324d;
            case 6:
                C63010eb ebVar = f190325e;
                if (ebVar == null) {
                    synchronized (C71282dk.class) {
                        ebVar = f190325e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f190324d);
                            f190325e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
