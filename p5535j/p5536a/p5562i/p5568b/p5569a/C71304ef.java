package p5535j.p5536a.p5562i.p5568b.p5569a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.i.b.a.ef */
/* compiled from: PG */
public final class C71304ef extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C71304ef f190405d;

    /* renamed from: e */
    private static volatile C63010eb f190406e;

    /* renamed from: a */
    public int f190407a;

    /* renamed from: b */
    public long f190408b;

    /* renamed from: c */
    public int f190409c;

    static {
        C71304ef efVar = new C71304ef();
        f190405d = efVar;
        C62942bv.registerDefaultInstance(C71304ef.class, efVar);
    }

    private C71304ef() {
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
                return newMessageInfo(f190405d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဂ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", C45240c.f118157a, C71302ed.f190404a});
            case 3:
                return new C71304ef();
            case 4:
                return new C71301ec();
            case 5:
                return f190405d;
            case 6:
                C63010eb ebVar = f190406e;
                if (ebVar == null) {
                    synchronized (C71304ef.class) {
                        ebVar = f190406e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f190405d);
                            f190406e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
