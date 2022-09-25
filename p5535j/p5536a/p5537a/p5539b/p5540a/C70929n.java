package p5535j.p5536a.p5537a.p5539b.p5540a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.a.b.a.n */
/* compiled from: PG */
public final class C70929n extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C70929n f189134c;

    /* renamed from: d */
    private static volatile C63010eb f189135d;

    /* renamed from: a */
    public int f189136a = 0;

    /* renamed from: b */
    public Object f189137b;

    static {
        C70929n nVar = new C70929n();
        f189134c = nVar;
        C62942bv.registerDefaultInstance(C70929n.class, nVar);
    }

    private C70929n() {
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
                return newMessageInfo(f189134c, "\u0001\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001ျ\u0000\u0002ြ\u0000\u0003့\u0000\u0004ြ\u0000\u0005ဿ\u0000\u0006ြ\u0000\u0007ြ\u0000", new Object[]{"b", "a", C70924i.class, C70928m.class, C70931p.m103846b(), C70917b.class, C70926k.class});
            case 3:
                return new C70929n();
            case 4:
                return new C70922g();
            case 5:
                return f189134c;
            case 6:
                C63010eb ebVar = f189135d;
                if (ebVar == null) {
                    synchronized (C70929n.class) {
                        ebVar = f189135d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189134c);
                            f189135d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
