package p5535j.p5536a.p5562i.p5568b.p5569a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.i.b.a.dz */
/* compiled from: PG */
public final class C71297dz extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C71297dz f190380a;

    /* renamed from: e */
    private static volatile C63010eb f190381e;

    /* renamed from: b */
    private int f190382b;

    /* renamed from: c */
    private C71278dg f190383c;

    /* renamed from: d */
    private byte f190384d = 2;

    static {
        C71297dz dzVar = new C71297dz();
        f190380a = dzVar;
        C62942bv.registerDefaultInstance(C71297dz.class, dzVar);
    }

    private C71297dz() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f190384d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f190384d = b;
                return null;
            case 2:
                return newMessageInfo(f190380a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C71297dz();
            case 4:
                return new C71296dy();
            case 5:
                return f190380a;
            case 6:
                C63010eb ebVar = f190381e;
                if (ebVar == null) {
                    synchronized (C71297dz.class) {
                        ebVar = f190381e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f190380a);
                            f190381e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
