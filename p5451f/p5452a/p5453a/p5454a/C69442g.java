package p5451f.p5452a.p5453a.p5454a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: f.a.a.a.g */
/* compiled from: PG */
public final class C69442g extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C69442g f185816c;

    /* renamed from: e */
    private static volatile C63010eb f185817e;

    /* renamed from: a */
    public int f185818a;

    /* renamed from: b */
    public int f185819b;

    /* renamed from: d */
    private int f185820d;

    static {
        C69442g gVar = new C69442g();
        f185816c = gVar;
        C62942bv.registerDefaultInstance(C69442g.class, gVar);
    }

    private C69442g() {
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
                return newMessageInfo(f185816c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C69442g();
            case 4:
                return new C69441f();
            case 5:
                return f185816c;
            case 6:
                C63010eb ebVar = f185817e;
                if (ebVar == null) {
                    synchronized (C69442g.class) {
                        ebVar = f185817e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f185816c);
                            f185817e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
