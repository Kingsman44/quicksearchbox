package p5535j.p5536a.p5562i.p5568b.p5569a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.i.b.a.ca */
/* compiled from: PG */
public final class C71245ca extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C71245ca f190204c;

    /* renamed from: d */
    private static volatile C63010eb f190205d;

    /* renamed from: a */
    public int f190206a;

    /* renamed from: b */
    public int f190207b;

    static {
        C71245ca caVar = new C71245ca();
        f190204c = caVar;
        C62942bv.registerDefaultInstance(C71245ca.class, caVar);
    }

    private C71245ca() {
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
                return newMessageInfo(f190204c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C71245ca();
            case 4:
                return new C71243bz();
            case 5:
                return f190204c;
            case 6:
                C63010eb ebVar = f190205d;
                if (ebVar == null) {
                    synchronized (C71245ca.class) {
                        ebVar = f190205d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f190204c);
                            f190205d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
