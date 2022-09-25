package p5535j.p5536a.p5562i.p5568b.p5569a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.i.b.a.o */
/* compiled from: PG */
public final class C71320o extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C71320o f190478c;

    /* renamed from: e */
    private static volatile C63010eb f190479e;

    /* renamed from: a */
    public int f190480a;

    /* renamed from: b */
    public C71318m f190481b;

    /* renamed from: d */
    private byte f190482d = 2;

    static {
        C71320o oVar = new C71320o();
        f190478c = oVar;
        C62942bv.registerDefaultInstance(C71320o.class, oVar);
    }

    private C71320o() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f190482d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f190482d = b;
                return null;
            case 2:
                return newMessageInfo(f190478c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C71320o();
            case 4:
                return new C71319n();
            case 5:
                return f190478c;
            case 6:
                C63010eb ebVar = f190479e;
                if (ebVar == null) {
                    synchronized (C71320o.class) {
                        ebVar = f190479e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f190478c);
                            f190479e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
