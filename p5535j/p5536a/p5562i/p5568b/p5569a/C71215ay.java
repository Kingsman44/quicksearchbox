package p5535j.p5536a.p5562i.p5568b.p5569a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60201dl;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.i.b.a.ay */
/* compiled from: PG */
public final class C71215ay extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C71215ay f190101e;

    /* renamed from: f */
    private static volatile C63010eb f190102f;

    /* renamed from: a */
    public int f190103a;

    /* renamed from: b */
    public int f190104b;

    /* renamed from: c */
    public int f190105c;

    /* renamed from: d */
    public C62961ch f190106d = emptyIntList();

    static {
        C71215ay ayVar = new C71215ay();
        f190101e = ayVar;
        C62942bv.registerDefaultInstance(C71215ay.class, ayVar);
    }

    private C71215ay() {
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
                return newMessageInfo(f190101e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002င\u0001\u0003'", new Object[]{"a", "b", C60201dl.f162874a, C45240c.f118157a, "d"});
            case 3:
                return new C71215ay();
            case 4:
                return new C71214ax();
            case 5:
                return f190101e;
            case 6:
                C63010eb ebVar = f190102f;
                if (ebVar == null) {
                    synchronized (C71215ay.class) {
                        ebVar = f190102f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f190101e);
                            f190102f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
