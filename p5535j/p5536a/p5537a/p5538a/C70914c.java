package p5535j.p5536a.p5537a.p5538a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.a.a.c */
/* compiled from: PG */
public final class C70914c extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C70914c f189102c;

    /* renamed from: d */
    private static volatile C63010eb f189103d;

    /* renamed from: a */
    public int f189104a;

    /* renamed from: b */
    public long f189105b;

    static {
        C70914c cVar = new C70914c();
        f189102c = cVar;
        C62942bv.registerDefaultInstance(C70914c.class, cVar);
    }

    private C70914c() {
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
                return newMessageInfo(f189102c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C70914c();
            case 4:
                return new C70913b();
            case 5:
                return f189102c;
            case 6:
                C63010eb ebVar = f189103d;
                if (ebVar == null) {
                    synchronized (C70914c.class) {
                        ebVar = f189103d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189102c);
                            f189103d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
