package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.c.c.a.as */
/* compiled from: PG */
public final class C70992as extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C70992as f189307c;

    /* renamed from: d */
    private static volatile C63010eb f189308d;

    /* renamed from: a */
    public int f189309a;

    /* renamed from: b */
    public C71003bc f189310b;

    static {
        C70992as asVar = new C70992as();
        f189307c = asVar;
        C62942bv.registerDefaultInstance(C70992as.class, asVar);
    }

    private C70992as() {
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
                return newMessageInfo(f189307c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C70992as();
            case 4:
                return new C70991ar();
            case 5:
                return f189307c;
            case 6:
                C63010eb ebVar = f189308d;
                if (ebVar == null) {
                    synchronized (C70992as.class) {
                        ebVar = f189308d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189307c);
                            f189308d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
