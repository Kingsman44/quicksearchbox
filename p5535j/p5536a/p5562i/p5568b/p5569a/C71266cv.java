package p5535j.p5536a.p5562i.p5568b.p5569a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.i.b.a.cv */
/* compiled from: PG */
public final class C71266cv extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C71266cv f190284c;

    /* renamed from: d */
    private static volatile C63010eb f190285d;

    /* renamed from: a */
    public int f190286a;

    /* renamed from: b */
    public C71264ct f190287b;

    static {
        C71266cv cvVar = new C71266cv();
        f190284c = cvVar;
        C62942bv.registerDefaultInstance(C71266cv.class, cvVar);
    }

    private C71266cv() {
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
                return newMessageInfo(f190284c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C71266cv();
            case 4:
                return new C71265cu();
            case 5:
                return f190284c;
            case 6:
                C63010eb ebVar = f190285d;
                if (ebVar == null) {
                    synchronized (C71266cv.class) {
                        ebVar = f190285d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f190284c);
                            f190285d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
