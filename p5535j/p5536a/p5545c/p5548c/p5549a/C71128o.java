package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.c.c.a.o */
/* compiled from: PG */
public final class C71128o extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C71128o f189740c;

    /* renamed from: d */
    private static volatile C63010eb f189741d;

    /* renamed from: a */
    public int f189742a;

    /* renamed from: b */
    public int f189743b;

    static {
        C71128o oVar = new C71128o();
        f189740c = oVar;
        C62942bv.registerDefaultInstance(C71128o.class, oVar);
    }

    private C71128o() {
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
                return newMessageInfo(f189740c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C71127n.f189739a});
            case 3:
                return new C71128o();
            case 4:
                return new C71126m();
            case 5:
                return f189740c;
            case 6:
                C63010eb ebVar = f189741d;
                if (ebVar == null) {
                    synchronized (C71128o.class) {
                        ebVar = f189741d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189740c);
                            f189741d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
