package p5535j.p5536a.p5562i.p5568b.p5569a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.i.b.a.be */
/* compiled from: PG */
public final class C71222be extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C71222be f190139c;

    /* renamed from: d */
    private static volatile C63010eb f190140d;

    /* renamed from: a */
    public int f190141a;

    /* renamed from: b */
    public C71218ba f190142b;

    static {
        C71222be beVar = new C71222be();
        f190139c = beVar;
        C62942bv.registerDefaultInstance(C71222be.class, beVar);
    }

    private C71222be() {
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
                return newMessageInfo(f190139c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C71222be();
            case 4:
                return new C71221bd();
            case 5:
                return f190139c;
            case 6:
                C63010eb ebVar = f190140d;
                if (ebVar == null) {
                    synchronized (C71222be.class) {
                        ebVar = f190140d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f190139c);
                            f190140d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
